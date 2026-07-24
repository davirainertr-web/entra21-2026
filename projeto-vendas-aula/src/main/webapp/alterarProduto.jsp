<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Alterar Produto</title>

</head>

<body>

<%@ include file="topo.jsp" %>

<h2>Alterar Produto</h2>

<form action="editarProduto.jsp" method="post">

<label>ID do Produto</label>

<br>

<input
type="number"
name="id"
min="1"
required>

<br><br>

<button type="submit">

Pesquisar

</button>

</form>

<br>

<a href="produto.jsp">

Voltar

</a>

<%@ include file="rodape.jsp" %>

</body>

</html>