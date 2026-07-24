<%@page import="dao.ClienteDao"%>
<%@page import="modelos.Cliente"%>

<%

int id = Integer.parseInt(request.getParameter("id"));

ClienteDao dao = new ClienteDao();

Cliente cliente = dao.consultar(id);

%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Excluir Cliente</title>

</head>

<body>

<%@ include file="topo.jsp" %>

<%

if(cliente == null){

%>

<h2>Cliente não encontrado.</h2>

<a href="excluirCliente.jsp">

Voltar

</a>

<%

}else{

dao.excluir(id);

%>

<h2>Cliente excluído com sucesso!</h2>

<p><b>Nome:</b> <%= cliente.getNome() %></p>

<br>

<a href="listarCliente.jsp">

Ver clientes

</a>

<br><br>

<a href="cliente.jsp">

Voltar ao menu

</a>

<%

}

%>

<%@ include file="rodape.jsp" %>

</body>

</html>