<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Consultar Produto</title>
</head>

<body>

<%@ include file="topo.jsp" %>

<h2>Consultar Produto</h2>

<form action="resultadoConsultaProduto.jsp" method="post">

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

<a href="produtos.jsp">
Voltar
</a>

<%@ include file="rodape.jsp" %>

</body>
</html>