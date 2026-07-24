<%@page import="java.util.List"%>
<%@page import="dao.ProdutoDao"%>
<%@page import="modelos.Produto"%>

<%
ProdutoDao dao = new ProdutoDao();
List<Produto> produtos = dao.consultar();
%>

<!DOCTYPE html>

<html>

<head>
<meta charset="UTF-8">
<title>Adicionar Produto</title>
</head>

<body>

<%@ include file="topo.jsp" %>

<h2>Adicionar Produto ao Pedido</h2>

<%

if(session.getAttribute("pedido") == null){

%>

<p>Nenhum pedido foi iniciado.</p>

<a href="novoPedido.jsp">Iniciar Pedido</a>

<%

}else{

%>

<table border="1">

<tr>
    <th>ID</th>
    <th>Descrição</th>
    <th>Preço</th>
    <th>Estoque</th>
</tr>

<%

int id = 1;

for(Produto p : produtos){

%>

<tr>

<td><%= id++ %></td>

<td><%= p.getDescricao() %></td>

<td>R$ <%= p.getPreco() %></td>

<td><%= p.getEstoque() %></td>

</tr>

<%

}

%>

</table>

<br>

<form action="adicionarItem.jsp" method="post">

<label>ID do Produto</label>

<br>

<input
type="number"
name="id"
min="1"
required>

<br><br>

<label>Quantidade</label>

<br>

<input
type="number"
name="quantidade"
min="1"
required>

<br><br>

<button type="submit">

Adicionar

</button>

</form>

<%

}

%>

<br>

<a href="pedido.jsp">Voltar</a>

<%@ include file="rodape.jsp" %>

</body>
</html>