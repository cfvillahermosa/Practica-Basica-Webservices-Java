<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.Vector" %>
<%@ page import="es.ufv.dis.discos.bean.Disco" %>
<%@ page import="es.ufv.dis.discos.motor.Motor" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

String id = request.getParameter("id");
String titulo = request.getParameter("titulo");
String soporte = request.getParameter("soporte");
String artista = request.getParameter("artista");
String genero = request.getParameter("genero");
Motor motor = new Motor();
motor.modificar(id, titulo, soporte, artista, genero);

Vector<Disco> discos = motor.getDiscos();


%>

<ul>
<%
for (int i=0; i< discos.size(); i++)
{
	Disco disco = discos.elementAt(i);
	
	%>
	<li><%=disco.getId() %> - <%=disco.getTitulo() %></li> 
	<%
	
}
%>


</ul>
<p><a href="inicio.jsp" > Volver </a></p>
</body>
</html>