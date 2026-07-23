<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Sistema de Vendas</title>
</head>

<body>

<%@ include file="topo.jsp" %>

<h1>Menu Principal</h1>

<p>Escolha uma opção:</p>

<p>
    <a href="produtos.jsp">
        <button>Produtos</button>
    </a>
</p>

<p>
    <a href="clientes.jsp">
        <button>Clientes</button>
    </a>
</p>

<p>
    <a href="pedidos.jsp">
        <button>Pedidos</button>
    </a>
</p>

<%@ include file="rodape.jsp" %>

</body>
</html>