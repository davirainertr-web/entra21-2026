<%@page import="dao.PedidoDao"%>
<%@page import="dao.ClienteDao"%>
<%@page import="modelos.Cliente"%>
<%@page import="modelos.Pedido"%>

<%

int id = Integer.parseInt(request.getParameter("id"));

ClienteDao clienteDao = new ClienteDao();

Cliente cliente = clienteDao.consultar(id);

PedidoDao pedidoDao = new PedidoDao();

Pedido pedido = null;

if(cliente != null){

    pedido = pedidoDao.criarPedido(cliente);

    session.setAttribute("pedido", pedido);

}

%>

<!DOCTYPE html>

<html>

<head>
<meta charset="UTF-8">
<title>Pedido</title>
</head>

<body>

<%@ include file="topo.jsp" %>

<%

if(cliente == null){

%>

<h2>Cliente não encontrado.</h2>

<a href="novoPedido.jsp">Voltar</a>

<%

}else{

%>

<h2>Pedido iniciado com sucesso!</h2>

<p>Cliente:</p>

<%= pedido.getCliente().getNome() %>

<br><br>

<a href="adicionarProdutoPedido.jsp">
Adicionar Produtos
</a>

<%

}

%>

<%@ include file="rodape.jsp" %>

</body>
</html>