<%@page import="java.util.List"%>
<%@page import="dao.PedidoDao"%>
<%@page import="modelos.Pedido"%>

<%

PedidoDao dao = new PedidoDao();

List<Pedido> pedidos = dao.consultar();

%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Pedidos</title>

</head>

<body>

<%@ include file="topo.jsp" %>

<h2>Pedidos Realizados</h2>

<%

if(pedidos.isEmpty()){

%>

<p>Nenhum pedido foi realizado.</p>

<%

}else{

%>

<table border="1">

<tr>

<th>ID</th>

<th>Cliente</th>

<th>Total</th>

<th>Itens</th>

</tr>

<%

for(Pedido pedido : pedidos){

%>

<tr>

<td><%= pedido.getId() %></td>

<td><%= pedido.getCliente().getNome() %></td>

<td>R$ <%= pedido.getTotal() %></td>

<td>

<a href="detalhesPedido.jsp?id=<%= pedido.getId() %>">

Ver Detalhes

</a>

</td>

</tr>

<%

}

%>

</table>

<%

}

%>

<br>

<a href="pedido.jsp">

Voltar

</a>

<%@ include file="rodape.jsp" %>

</body>

</html>