package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ServicioDao;
import entities.Servicio;
import entities.Tienda;

/**
 * Servlet implementation class ServicesController
 */
@WebServlet("/ServicesController")
public class ServicesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServicesController() {
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
		String nombre= request.getParameter("nombre");
		String descripcion= request.getParameter("descripcion");
		String tienda= request.getParameter("tienda");
		Tienda t = new Tienda();
		t.setNombre(tienda);
		Servicio s = new Servicio();
		ServicioDao sDao = new ServicioDao(); 
		s.setNombre(nombre);
		s.setDescripcion(descripcion);
		s.setTiendaBean(t);
		sDao.insert(s);
		
	}

}
