<%@page import="java.util.List"%>
<%@page import="modelos.Cliente"%>
<%@page import="dao.PedidoDao"%>

<%

Cliente cliente = (Cliente) session.getAttribute("clientePedido");
List<String> carrinho = (List<String>) session.getAttribute("carrinho");

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

if(cliente == null){

%>

<p>Nenhum pedido iniciado.</p>

<a href="pedido.jsp">Voltar</a>

<%

}else{

%>

<h2>Pedido Finalizado!</h2>

<p><b>Cliente:</b> <%= cliente.getNome() %></p>

<hr>

<h3>Itens comprados</h3>

<%

if(carrinho != null){

for(String item : carrinho){

%>

<p><%= item %></p>

<%

}

}

%>

<%

session.removeAttribute("clientePedido");
session.removeAttribute("carrinho");

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