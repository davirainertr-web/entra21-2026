<%@page import="dao.ClienteDao"%>
<%@page import="modelos.Cliente"%>

<%

int id = Integer.parseInt(request.getParameter("id"));

Cliente cliente = new Cliente();

cliente.setCpf(request.getParameter("cpf"));
cliente.setNome(request.getParameter("nome"));
cliente.setEmail(request.getParameter("email"));
cliente.setCep(request.getParameter("cep"));
cliente.setRua(request.getParameter("rua"));
cliente.setNumero(request.getParameter("numero"));
cliente.setBairro(request.getParameter("bairro"));
cliente.setCidade(request.getParameter("cidade"));
cliente.setEstado(request.getParameter("estado"));

ClienteDao dao = new ClienteDao();

dao.alterar(id, cliente);

%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Cliente Alterado</title>

</head>

<body>

<%@ include file="topo.jsp" %>

<h2>Cliente alterado com sucesso!</h2>

<a href="listarCliente.jsp">

Ver Clientes

</a>

<br><br>

<a href="cliente.jsp">

Voltar

</a>

<%@ include file="rodape.jsp" %>

</body>

</html>