<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Produtos</title>
</head>

<body>

<%@ include file="topo.jsp" %>

<h2>Menu de Produtos</h2>

<p>Escolha uma opção:</p>

<p>
    <a href="cadastrarProduto.jsp">
        <button>Cadastrar Produto</button>
    </a>
</p>

<p>
    <a href="listarProdutos.jsp">
        <button>Listar Produtos</button>
    </a>
</p>

<p>
    <a href="consultarProduto.jsp">
        <button>Consultar Produto</button>
    </a>
</p>

<p>
    <a href="alterarProduto.jsp">
        <button>Alterar Produto</button>
    </a>
</p>

<p>
    <a href="excluirProduto.jsp">
        <button>Excluir Produto</button>
    </a>
</p>

<p>
    <a href="index.jsp">
        <button>Voltar</button>
    </a>
</p>

<%@ include file="rodape.jsp" %>

</body>
</html>