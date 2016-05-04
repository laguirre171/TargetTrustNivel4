<%@page import="java.util.Date"%>
<html>
<body>
	<h2>
		<%
			out.print("Bem vindo ao JSP");
		%>
	</h2>
	<%
		String var = "valor Teste";
	%>
	<%
		out.print(var);
	out.print(new Date());
	%>
	<%
		System.out.print("teste");
	%>
	<%-- Meu comentário não vai aparecer no html --%>
	
</body>
</html>
