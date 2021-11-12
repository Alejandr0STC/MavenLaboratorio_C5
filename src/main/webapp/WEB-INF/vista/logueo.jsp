<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Iniciar Sesion</title>
</head>
<body bgcolor="#c5dec9">
	<form action="validar">
		<table border="2">
			<tr>
				<td>
					Ingrese Usuario
					
				</td>
				<td>
					<input type="text" name="usuario">
				</td>
			</tr>
			<tr>
				<td>
					Ingrese Password
					
				</td>
				<td>
					<input type="password" name="password">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="ingresar" name="ingresar">	
				</td>
			</tr>	
		</table>
	</form>
	<!-- En caso que el usuario sea incorrecto, emite su respectivo mensaje -->
	<h2 style="color:blue;">${error }</h2>
</body>
</html>