<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
<title>Formulario Agenda</title>
<script>
function index() {
	location.href='CrearEPS.jsp';
}
</script>
</head>
<body>
<table>
	<tr><td>
            Fecha de inicio:</td><td><input type="date" name="fecha_inicio">
        </td></tr>
        <tr><td>
            Fecha de finalizacion:</td><td><input type="date" name="fecha_final">
        </td></tr>
        <tr><td><br></td></tr>
        <tr><td>
            <input type="submit" name="submit" value="Enviar">
        </td><td>
        	<input type="button" name="exit" value="Cancelar" onclick="index()">
        </td></tr>
	</table>
</body>
</html>