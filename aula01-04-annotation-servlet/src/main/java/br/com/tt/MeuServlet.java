package br.com.tt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "minha-servlet", urlPatterns={"/teste","/pagina/*",})
public class MeuServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter writer = response.getWriter();
		writer.println("<h1>teste da minha servlet anotada");
		
	}
	
	

}
