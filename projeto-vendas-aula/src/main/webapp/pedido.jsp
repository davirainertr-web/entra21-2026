<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>
<meta charset="UTF-8">
<title>Pedidos</title>
</head>

<body>

<%@ include file="topo.jsp" %>

<h2>Menu de Pedidos</h2>

<p>Escolha uma opção:</p>

<p>
    <a href="novoPedido.jsp">
        <button>Novo Pedido</button>
    </a>
</p>

<p>
    <a href="adicionarProdutoPedido.jsp">
        <button>Adicionar Produto</button>
    </a>
</p>

<p>
    <a href="carrinho.jsp">
        <button>Ver Carrinho</button>
    </a>
</p>

<p>
    <a href="finalizarPedido.jsp">
        <button>Finalizar Pedido</button>
    </a>
</p>

<p>
    <a href="listarPedido.jsp">
        <button>Listar Pedidos</button>
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