package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TiendaDao;
import entities.Tienda;

/**
 * Servlet implementation class RegistroController
 */
@WebServlet("/RegistroController")
public class RegistroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroController() {
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
		Tienda t = new Tienda();
		TiendaDao tDao = new TiendaDao();
		
		String nombre= request.getParameter("nombre");
		String lema= request.getParameter("lema");
		String descripcion= request.getParameter("descripcion");
		String email= request.getParameter("email");
		String contraseņa= request.getParameter("contraseņa");
		String propietario= request.getParameter("propietario");
		String facebook= request.getParameter("facebook");
		String web= request.getParameter("web");
		String imagen= request.getParameter("imagen");
		
		t.setNombre(nombre);
    	t.setLema(lema);
    	t.setDescripcion(descripcion);
    	t.setEmail(email);
    	t.setClave(contraseņa);
    	t.setPropietario(propietario);
    	t.setFacebook(facebook);
    	t.setWeb(web);
    	t.setImagen(imagen);
    	
    	tDao.insert(t);
    	request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
