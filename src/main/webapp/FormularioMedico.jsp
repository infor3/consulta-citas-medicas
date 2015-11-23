<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
<title>Formulario Medico</title>
<script>
function index() {
	location.href='CrearEPS.jsp';
}
</script>
</head>
<body>
<form action="/consulta-citas-medicas-1.0-SNAPSHOT/hola" method="get">
    <table>
        <tr><td>
                Nombre(s):</td><td><input type="text" name="nombre">
            </td>
        </tr>
        <tr><td>
            Apellidos:</td><td><input type="text" name="apellidos">
        </td></tr>
        <tr><td>
            Fecha de nacimiento:</td><td><input type="date" name="fecha_nacimiento">
        </td></tr>
        <tr><td>
            Correo electrónico:</td><td><input type="email" name="correo">
        </td></tr>
        <tr><td>
            Dirección:</td><td><input type="text" name="direccion">
        </td></tr>
        <tr><td>
            Telefono:</td><td><input type="text" name="telefono">
        </td></tr>
        <tr><td>
            Celular:</td><td><input type="text" name="celular">
        </td></tr>
        <tr><td>
            Documento de Identidad:</td><td><input type="text" name="documento">
        </td></tr>
        <tr>
            <td>
                <input type="radio" name="id" value="cedula" checked>C.C.
            </td>
            <td>
                <input type="radio" name="id" value="tarjetaidentidad">T.I.
            </td>
            <td>
                <input type="radio" name="id" value="pasaporte">P.S
            </td>
        </tr>
        <tr><td><br></td></tr>
        <tr><td>
            <input type="submit" name="submit" value="Enviar">
        </td><td>
        	<input type="button" name="exit" value="Cancelar" onclick="index()">
        </td></tr>
    </table>
</body>
</html>