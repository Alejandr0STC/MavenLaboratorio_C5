<html>
<body>
<h2>Hello World!</h2>
<%= new java.util.Date() %>
<h1>Gestionando proyectos con Maven</h1>
<form action="calculos.jsp" method="post">
	<table >
		<tr>
			<td>Valor de Hora</td>
			<td>
				<input type="text" name="valorh">
			</td>
		</tr>
		<tr>
			<td>Cantidad de Horas</td>
			<td>
				<input type="text" name="cantidadh">
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="Calcular">
			</td>
		</tr>
	</table>
</form>
</body>
</html>
