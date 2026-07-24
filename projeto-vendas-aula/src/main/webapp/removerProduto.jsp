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

<title>Excluir Produto</title>

</head>

<body>

<%@ include file="topo.jsp" %>

<%

if(produto == null){

%>

<h2>Produto não encontrado.</h2>

<a href="excluirProduto.jsp">

Voltar

</a>

<%

}else{

dao.excluir(id);

%>

<h2>Produto excluído com sucesso!</h2>

<p><b>Descrição:</b> <%= produto.getDescricao() %></p>

<br>

<a href="listarProduto.jsp">

Ver produtos

</a>

<br><br>

<a href="produto.jsp">

Voltar ao menu

</a>

<%

}

%>

<%@ include file="rodape.jsp" %>

</body>

</html>