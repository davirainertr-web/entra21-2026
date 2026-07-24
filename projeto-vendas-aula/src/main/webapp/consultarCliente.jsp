<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Consultar Cliente</title>
</head>

<body>

<%@ include file="topo.jsp" %>

<h2>Consultar Cliente</h2>

<form action="resultadoConsultaCliente.jsp" method="post">

    <label>Informe o ID:</label><br>

    <input
        type="number"
        name="id"
        min="1"
        required>

    <br><br>

    <button type="submit">
        Consultar
    </button>

</form>

<br>

<a href="cliente.jsp">
Voltar
</a>

<%@ include file="rodape.jsp" %>

</body>
</html>