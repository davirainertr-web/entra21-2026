<%@page import="dao.PedidoDao"%>
<%@page import="modelos.Pedido"%>
<%@page import="modelos.ItemPedido"%>

<%

Pedido pedido =
(Pedido) session.getAttribute("pedido");

PedidoDao dao = new PedidoDao();

boolean sucesso = false;

if(pedido != null){

    sucesso = dao.salvar(pedido);

}

%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Pedido Finalizado</title>

</head>

<body>

<%@ include file="topo.jsp" %>

<%

if(pedido == null){

%>

<h2>Nenhum pedido iniciado.</h2>

<a href="pedido.jsp">Voltar</a>

<%

}else if(!sucesso){

%>

<h2>Não foi possível finalizar o pedido.</h2>

<p>O carrinho está vazio.</p>

<br>

<a href="carrinho.jsp">Voltar</a>

<%

}else{

%>

<h2>Pedido Finalizado com Sucesso!</h2>

<hr>

<p><b>Número do Pedido:</b> <%= pedido.getId() %></p>

<p><b>Cliente:</b> <%= pedido.getCliente().getNome() %></p>

<hr>

<table border="1">

<tr>

<th>Produto</th>

<th>Quantidade</th>

<th>Subtotal</th>

</tr>

<%

for(ItemPedido item : pedido.getItens()){

%>

<tr>

<td><%= item.getProduto().getDescricao() %></td>

<td><%= item.getQuantidade() %></td>

<td>R$ <%= item.getSubtotal() %></td>

</tr>

<%

}

%>

</table>

<br>

<h3>Total: R$ <%= pedido.getTotal() %></h3>

<%

session.removeAttribute("pedido");

%>

<hr>

<p>Obrigado pela compra!</p>

<a href="pedido.jsp">Novo Pedido</a>

<%

}

%>

<%@ include file="rodape.jsp" %>

</body>

</html>