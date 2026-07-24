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
<title>Novo Pedido</title>
</head>

<body>

<%@ include file="topo.jsp" %>

<h2>Novo Pedido</h2>

<%
if(clientes.isEmpty()){
%>

<p>Nenhum cliente cadastrado.</p>

<a href="cliente.jsp">Cadastrar Cliente</a>

<%
}else{
%>

<h3>Clientes cadastrados</h3>

<table border="1">

<tr>
    <th>ID</th>
    <th>Nome</th>
    <th>CPF</th>
</tr>

<%
int id = 1;

for(Cliente c : clientes){
%>

<tr>
    <td><%= id++ %></td>
    <td><%= c.getNome() %></td>
    <td><%= c.getCpf() %></td>
</tr>

<%
}
%>

</table>

<br>

<form action="salvarPedido.jsp" method="post">

<label>ID do Cliente:</label>

<input
type="number"
name="id"
min="1"
required>

<button type="submit">
Iniciar Pedido
</button>

</form>

<%
}
%>

<br>

<a href="pedido.jsp">
Voltar
</a>

<%@ include file="rodape.jsp" %>

</body>
</html>