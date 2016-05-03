package br.com.tt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:8080/aula02-01-soma/soma?valor1=1&valor2=2

@WebServlet("/soma")
public class SomaServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void service(HttpServletRequest request,
			HttpServletResponse response) throws IOException{
		
		PrintWriter writer = response.getWriter();
		//Recebendo os valores 
		String valor1 = request.getParameter("valor1");
		String valor2 = request.getParameter("valor2");
		//Convertendo os valores
		int val1 = Integer.parseInt(valor1);
		int val2 = Integer.parseInt(valor2);
		//Realizando as operações
		int soma = val1 + val2;
		//Respondendo ao cliente
		writer.print("A soma é " + soma);
	}
	

}
