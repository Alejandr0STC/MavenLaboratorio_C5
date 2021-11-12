<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Plantilla</title>
</head>
<body>
	<h1>Plantilla de Trabajadores</h1>
	<h2>Pago por hora</h2>
	${n1} 
	<h2>Cantidad de horas</h2>
	${n2 }
	<h2>Total a Pagar a trabajadores</h2>
	${resultado }
	<%!
		/*public int calcular(int x,int y)
		{
			int resultado=x*y;
			return resultado;
		}*/
	%>
	<%
	/*
	int vh=Integer.parseInt(request.getParameter("valorh"));
		int ch=Integer.parseInt(request.getParameter("cantidadh"));  
		
		out.println("<b>total a pagar a trabajador</b>"+calcular(vh,ch)+"soles");
		*/
	%>
</body>
</html>