<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Excluir Produto</title>

</head>

<body>

<%@ include file="topo.jsp" %>

<h2>Excluir Produto</h2>

<form action="removerProduto.jsp" method="post">

<label>ID do Produto</label>

<br>

<input
type="number"
name="id"
min="1"
required>

<br><br>

<button type="submit">

Excluir

</button>

</form>

<br>

<a href="produto.jsp">

Voltar

</a>

<%@ include file="rodape.jsp" %>

</body>

</html>