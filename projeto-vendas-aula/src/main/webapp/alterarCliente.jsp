<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Alterar Cliente</title>

</head>

<body>

<%@ include file="topo.jsp" %>

<h2>Alterar Cliente</h2>

<form action="editarCliente.jsp" method="post">

<label>ID do Cliente</label>

<br>

<input
type="number"
name="id"
min="1"
required>

<br><br>

<button>

Pesquisar

</button>

</form>

<br>

<a href="cliente.jsp">

Voltar

</a>

<%@ include file="rodape.jsp" %>

</body>

</html>