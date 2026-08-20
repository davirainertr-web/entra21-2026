<%@page import="dao.PedidoDao"%>
<%@page import="modelos.Pedido"%>
<%@page import="modelos.ItemPedido"%>

<%

int id = Integer.parseInt(request.getParameter("id"));

PedidoDao dao = new PedidoDao();

Pedido pedido = dao.consultar(id);

%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Detalhes do Pedido</title>

</head>

<body>

<%@ include file="topo.jsp" %>

<%

if(pedido == null){

%>

<h2>Pedido não encontrado.</h2>

<%

}else{

%>

<h2>Pedido <%= pedido.getId() %></h2>

<p>

<b>Cliente:</b>

<%= pedido.getCliente().getNome() %>

</p>

<table border="1">

<tr>

<th>Produto</th>

<th>Quantidade</th>

<th>Preço</th>

<th>Subtotal</th>

</tr>

<%

for(ItemPedido item : pedido.getItens()){

%>

<tr>

<td><%= item.getProduto().getDescricao() %></td>

<td><%= item.getQuantidade() %></td>

<td>R$ <%= item.getProduto().getPreco() %></td>

<td>R$ <%= item.getSubtotal() %></td>

</tr>

<%

}

%>

</table>

<br>

<h3>Total: R$ <%= pedido.getTotal() %></h3>

<%

}

%>

<br>

<a href="listarPedido.jsp">

Voltar

</a>

<%@ include file="rodape.jsp" %>

</body>

</html>