<%@page import="modelos.Pedido"%>
<%@page import="modelos.ItemPedido"%>

<%
Pedido pedido = (Pedido) session.getAttribute("pedido");
%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Carrinho</title>

</head>

<body>

<%@ include file="topo.jsp" %>

<h2>Carrinho de Compras</h2>

<%

if(pedido == null){

%>

<p>Nenhum pedido iniciado.</p>

<a href="novoPedido.jsp">Novo Pedido</a>

<%

}else{

%>

<p><b>Cliente:</b> <%= pedido.getCliente().getNome() %></p>

<hr>

<%

if(pedido.getItens().isEmpty()){

%>

<p>O carrinho está vazio.</p>

<%

}else{

%>

<table border="1">

<tr>

<th>Produto</th>

<th>Quantidade</th>

<th>Preço Unitário</th>

<th>Subtotal</th>

<th>Ações</th>

</tr>

<%

for(ItemPedido item : pedido.getItens()){

%>

<tr>

<td><%= item.getProduto().getDescricao() %></td>

<td><%= item.getQuantidade() %></td>

<td>R$ <%= item.getProduto().getPreco() %></td>

<td>R$ <%= item.getSubtotal() %></td>

<td>

<form action="removerItem.jsp" method="post">

<input
type="hidden"
name="id"
value="<%= item.getProduto().getId() %>">

<input
type="number"
name="quantidade"
min="1"
max="<%= item.getQuantidade() %>"
required>

<button type="submit">

Remover

</button>

</form>

</td>

</tr>

<%

}

%>

</table>

<br>

<h3>Total do Pedido: R$ <%= pedido.getTotal() %></h3>

<%

}

}

%>

<hr>

<a href="adicionarProdutoPedido.jsp">

Adicionar mais produtos

</a>

<br><br>

<a href="finalizarPedido.jsp">

Finalizar Pedido

</a>

<br><br>

<a href="pedido.jsp">

Voltar

</a>

<%@ include file="rodape.jsp" %>

</body>

</html>