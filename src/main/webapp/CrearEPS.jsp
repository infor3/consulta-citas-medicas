<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Crear EPS</title>
<script>
function index() {
	location.href='home.html';
}
</script>
</head>
<body>
	<form action="/EPSController" method="post">
		<table>
			<tr>
				<td>Nombre:</td>
				<td><input type="text" name="nombre"></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="Enviar">
				</td><td>
        	<input type="button" name="exit" value="Cancelar" onclick="index()">
        </td></tr>
		</table>
	</form>
</body>
</html>
