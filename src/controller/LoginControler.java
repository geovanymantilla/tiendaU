package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CienteDAo;
import entities.Cliente;

/**
 * Servlet implementation class LoginControler
 */
@WebServlet("/LoginControler")
public class LoginControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
        String contrase�a = request.getParameter("contrase�a");
        CienteDAo uDao = new CienteDAo();
        Cliente us = uDao.find(email);
        if(us!=null){
        	if(us.getClave().contentEquals(contrase�a)){
        		
                request.getRequestDispatcher("/index.jsp").forward(request, response);
        	}else{
        		request.getRequestDispatcher("/login.jsp").forward(request, response);
        	}
        }else{
        	request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
	}

}
