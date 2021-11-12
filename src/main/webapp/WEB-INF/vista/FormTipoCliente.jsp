<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar Tipo Cliente</title>
</head>
<body>
	<H1>Registrar Tipo de Cliente</H1>
	<form:form action="registrarTipoCliente" modelAttribute="tpcliente">
		<table border="2">
			<tr>
				<td>
					<form:label path="descripcion">
						Ingrese Descripcion
					</form:label>
				</td>
				<td>
					<form:input path="descripcion"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="Registrar Tipo de Cliente">
				</td>
			</tr>
		</table>
	</form:form>
	<table border="2" bgcolor="yellow">
		<tr>
			<th>
				Codigo
			</th>
			<th>
				Tipo Cliente
			</th>
		</tr>
		<tr>
			<c:forEach items="${listadoCli }" var="tpcliente">
				<tr>
					<td>
						${tpcliente.idtipocliente}
					</td>
					<td>
						${tpcliente.descripcion}
					</td>
				</tr>
			</c:forEach>
		</tr>
	</table>
</body>
</html>