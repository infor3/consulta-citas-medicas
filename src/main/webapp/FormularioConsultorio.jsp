<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Formulario Consultorio</title>
<script>
function index() {
	location.href='home.html';
}
</script>
</head>
<body>
<form action="" method="get">
	<table>
	<tr><td>
			Consultorio: </td><td><input type="text" name="id">
	</td></tr>
	<tr><td>
            Telefono:</td><td><input type="text" name="telefono">
    </td></tr>
    <tr><td>
            <input type="submit" name="submit" value="Enviar">
    </td><td>
        	<input type="button" name="exit" value="Cancelar" onclick="index()">
    </td></tr>
	</table>
</form>
</body>
</html>