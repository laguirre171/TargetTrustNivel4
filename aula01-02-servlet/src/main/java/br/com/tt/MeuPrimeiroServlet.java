package br.com.tt;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MeuPrimeiroServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void service(
			HttpServletRequest request,
			HttpServletResponse response) throws IOException{
		
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>Meu primeiro Servlet</h1>");
		writer.println("<h3>" + new Date() + "</h1>");
		writer.println("</body></html>");
				
	}

}
