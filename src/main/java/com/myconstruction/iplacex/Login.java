package com.myconstruction.iplacex;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Login() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("myconstruction.iplacex: Hola Mundo ! ! !");
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Llegue al post");
		System.out.println("Request Parameter Usuario: " + request.getParameter("username"));
		System.out.println("Request Parameter Password: " + request.getParameter("password"));
		
		String usuario = request.getParameter("username");
		
		System.out.println("Usuario " + usuario);
		
		request.setAttribute("usuario", usuario);
		
		
		response.sendRedirect(request.getContextPath()+"/inicio.jsp?usuario=" + usuario);


		
		// doGet(request, response);
	}

}
