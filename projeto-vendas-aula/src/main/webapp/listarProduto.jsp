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
<title>Lista de Produtos</title>
</head>
<body>

<%@ include file="topo.jsp" %>

<h2>Produtos Cadastrados</h2>

<%
if(produtos.isEmpty()){
%>

<p>Nenhum produto cadastrado.</p>

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
    <td><%= p.getId() %></td>
    <td><%= p.getDescricao() %></td>
    <td>R$ <%= p.getPreco() %></td>
    <td><%= p.getEstoque() %></td>
</tr>

<%
}
%>

</table>

<%
}
%>

<br>

<a href="cadastrarProduto.jsp">
    Cadastrar novo produto
</a>

<br><br>

<a href="produto.jsp">
    Voltar
</a>

<%@ include file="rodape.jsp" %>

</body>
</html>