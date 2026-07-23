<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Cadastrar Produto</title>
</head>

<body>

<%@ include file="topo.jsp" %>

<h2>Cadastro de Produto</h2>

<form action="salvarProduto.jsp" method="post">

    <p>
        <label>Descrição:</label><br>
        <input type="text"
               name="descricao"
               placeholder="Ex: Mouse Gamer"
               required>
    </p>

    <p>
        <label>Preço:</label><br>
        <input type="number"
               name="preco"
               step="0.01"
               min="0"
               placeholder="Ex: 199.90"
               required>
    </p>

    <p>
        <label>Estoque:</label><br>
        <input type="number"
               name="estoque"
               min="0"
               placeholder="Ex: 10"
               required>
    </p>

    <button type="submit">Salvar Produto</button>

</form>

<hr>

<a href="produtos.jsp">Voltar</a>

<%@ include file="rodape.jsp" %>

</body>
</html>