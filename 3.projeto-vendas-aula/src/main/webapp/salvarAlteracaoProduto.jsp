<%@page import="dao.ProdutoDao"%>
<%@page import="modelos.Produto"%>

<%

int id = Integer.parseInt(request.getParameter("id"));

String descricao = request.getParameter("descricao");

double preco =
Double.parseDouble(request.getParameter("preco"));

int estoque =
Integer.parseInt(request.getParameter("estoque"));

Produto produto = new Produto();

produto.setDescricao(descricao);
produto.setPreco(preco);
produto.setEstoque(estoque);

ProdutoDao dao = new ProdutoDao();

dao.alterar(id, produto);

%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Produto Alterado</title>

</head>

<body>

<%@ include file="topo.jsp" %>

<h2>Produto alterado com sucesso!</h2>

<a href="listarProduto.jsp">

Ver Produtos

</a>

<br><br>

<a href="produto.jsp">

Voltar

</a>

<%@ include file="rodape.jsp" %>

</body>

</html>