<%@page import="java.util.List"%>
<%@page import="dao.ClienteDao"%>
<%@page import="modelos.Cliente"%>

<%
ClienteDao dao = new ClienteDao();
List<Cliente> clientes = dao.consultar();
%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Lista de Clientes</title>
</head>

<body>

<%@ include file="topo.jsp" %>

<h2>Clientes Cadastrados</h2>

<%
if(clientes.isEmpty()){
%>

<p>Nenhum cliente cadastrado.</p>

<%
}else{
%>

<table border="1">

<tr>
    <th>ID</th>
    <th>CPF</th>
    <th>Nome</th>
    <th>Email</th>
    <th>Cidade</th>
    <th>Estado</th>
</tr>

<%
int id = 1;

for(Cliente c : clientes){
%>

<tr>
    <td><%= id++ %></td>
    <td><%= c.getCpf() %></td>
    <td><%= c.getNome() %></td>
    <td><%= c.getEmail() %></td>
    <td><%= c.getCidade() %></td>
    <td><%= c.getEstado() %></td>
</tr>

<%
}
%>

</table>

<%
}
%>

<br>

<a href="cadastrarCliente.jsp">
Cadastrar novo cliente
</a>

<br><br>

<a href="cliente.jsp">
Voltar
</a>

<%@ include file="rodape.jsp" %>

</body>
</html>''