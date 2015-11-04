<%@ page contentType="text/html" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <% if((boolean) request.getAttribute("valido")) { %>
        <h1>Hola, master!</h1>
        <% } else { %>
        <h1>Hola, ${param["nombre"]}</h1>
        <% } %>
    </body>
</html>
