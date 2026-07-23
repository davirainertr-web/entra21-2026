<%@page import="dao.ProdutoDao"%>
<%@page import="modelos.Produto"%>

<%
    String descricao = request.getParameter("descricao");
    double preco = Double.parseDouble(request.getParameter("preco"));
    int estoque = Integer.parseInt(request.getParameter("estoque"));

    Produto produto = new Produto();

    produto.setDescricao(descricao);
    produto.setPreco(preco);
    produto.setEstoque(estoque);

    ProdutoDao dao = new ProdutoDao();
    dao.salvar(produto);
%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Produto Salvo</title>
</head>

<body>

<%@ include file="topo.jsp" %>

<h2>Produto cadastrado com sucesso!</h2>

<p><strong>Descrição:</strong> <%= produto.getDescricao() %></p>

<p><strong>Preço:</strong> R$ <%= produto.getPreco() %></p>

<p><strong>Estoque:</strong> <%= produto.getEstoque() %></p>

<hr>

<a href="cadastrarProduto.jsp">Cadastrar outro produto</a>

<br><br>

<a href="listarProdutos.jsp">Listar produtos</a>

<br><br>

<a href="produtos.jsp">Voltar ao menu</a>

<%@ include file="rodape.jsp" %>

</body>
</html>