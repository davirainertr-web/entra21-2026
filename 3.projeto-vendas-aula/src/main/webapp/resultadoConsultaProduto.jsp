<%@page import="dao.ProdutoDao"%>
<%@page import="modelos.Produto"%>

<%

int id = Integer.parseInt(request.getParameter("id"));

ProdutoDao dao = new ProdutoDao();

Produto produto = dao.consultar(id);

%>

<!DOCTYPE html>

<html>

<head>
<meta charset="UTF-8">
<title>Consulta</title>
</head>

<body>

<%@ include file="topo.jsp" %>

<h2>Resultado da Consulta</h2>

<%

if(produto == null){

%>

<p>Produto não encontrado.</p>

<%

}else{

%>

<p><b>ID:</b> <%= id %></p>

<p><b>Descrição:</b> <%= produto.getDescricao() %></p>

<p><b>Preço:</b> R$ <%= produto.getPreco() %></p>

<p><b>Estoque:</b> <%= produto.getEstoque() %></p>

<%

}

%>

<br>

<a href="consultarProduto.jsp">
Nova consulta
</a>

<br><br>

<a href="produto.jsp">
Voltar
</a>

<%@ include file="rodape.jsp" %>

</body>

</html>