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

<title>Editar Produto</title>

</head>

<body>

<%@ include file="topo.jsp" %>

<%

if(produto == null){

%>

<h2>Produto não encontrado.</h2>

<a href="alterarProduto.jsp">

Voltar

</a>

<%

}else{

%>

<form action="salvarAlteracaoProduto.jsp" method="post">

<input
type="hidden"
name="id"
value="<%= id %>">

<p>

Descrição

<br>

<input
type="text"
name="descricao"
value="<%= produto.getDescricao() %>">

</p>

<p>

Preço

<br>

<input
type="number"
step="0.01"
name="preco"
value="<%= produto.getPreco() %>">

</p>

<p>

Estoque

<br>

<input
type="number"
name="estoque"
value="<%= produto.getEstoque() %>">

</p>

<button>

Salvar Alterações

</button>

</form>

<%

}

%>

<%@ include file="rodape.jsp" %>

</body>

</html>