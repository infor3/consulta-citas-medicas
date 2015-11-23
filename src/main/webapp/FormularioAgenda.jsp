
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
<title>Formulario Agenda</title>
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
            Fecha de inicio:</td><td><input type="date" name="fecha_inicio">
        </td></tr>
        <tr><td>
            Fecha de finalizacion:</td><td><input type="date" name="fecha_final">
        </td></tr>
        <tr><td><br></td></tr>
        <tr><td>
        	ingrese horas exactas</td><td>
        </td></tr>
        <tr><td>
        	Hora de inicio diario:</td><td>  <input type="time" name="hora_inicio">
        </td></tr>
        <tr><td>
        	Hora de finalizacion diario:</td><td>  <input type="time" name="hora_final">
        </td></tr>
        <tr><td><br></td></tr>
        <tr><td>
            <input type="submit" name="submit" value="Enviar">
        </td><td>
        	<input type="button" name="exit" value="Cancelar" onclick="index()">
        </td></tr>
	</table>
</form>
</body>
</html>