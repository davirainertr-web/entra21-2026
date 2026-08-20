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
<title>Consulta Cliente</title>
</head>

<body>

<%@ include file="topo.jsp" %>

<h2>Resultado da Consulta</h2>

<%

if(cliente == null){

%>

<p>Cliente não encontrado.</p>

<%

}else{

%>

<p><b>ID:</b> <%= id %></p>

<p><b>CPF:</b> <%= cliente.getCpf() %></p>

<p><b>Nome:</b> <%= cliente.getNome() %></p>

<p><b>Email:</b> <%= cliente.getEmail() %></p>

<p><b>CEP:</b> <%= cliente.getCep() %></p>

<p><b>Rua:</b> <%= cliente.getRua() %></p>

<p><b>Número:</b> <%= cliente.getNumero() %></p>

<p><b>Bairro:</b> <%= cliente.getBairro() %></p>

<p><b>Cidade:</b> <%= cliente.getCidade() %></p>

<p><b>Estado:</b> <%= cliente.getEstado() %></p>

<%

}

%>

<br>

<a href="consultarCliente.jsp">
Nova consulta
</a>

<br><br>

<a href="cliente.jsp">
Voltar
</a>

<%@ include file="rodape.jsp" %>

</body>
</html>