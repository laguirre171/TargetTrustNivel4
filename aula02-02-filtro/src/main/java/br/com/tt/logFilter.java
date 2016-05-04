package br.com.tt;

import java.io.IOException;
import java.util.Collection;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(filterName = "log-filtro", urlPatterns = "/*")
public class logFilter implements Filter {

	public void destroy() {
		System.out.println("Finalizando Filtro..." + new Date());
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		
		System.out.println("Request chegando" + new Date());
		System.out.println(req.getRequestURL());
		chain.doFilter(request, response);
		System.out.println("Response saindo" + new Date());
		
		HttpServletResponse res = (HttpServletResponse) response;
		Collection<String> headerNames = res.getHeaderNames();
		
		

	}

	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("Iniciando Filtro..." + new Date());
	}

}
