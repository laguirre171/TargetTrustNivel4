package br.com.tt;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName="log-filtro", urlPatterns="/*")
public class logFilter implements Filter{

	public void destroy() {
		System.out.println("Finalizando Filtro..." + new Date());
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("Iniciando Filtro..." + new Date());
	}

}
