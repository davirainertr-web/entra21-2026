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

<title>Editar Cliente</title>

</head>

<body>

<%@ include file="topo.jsp" %>

<%

if(cliente == null){

%>

<h2>Cliente não encontrado.</h2>

<a href="alterarCliente.jsp">Voltar</a>

<%

}else{

%>

<form action="salvarAlteracaoCliente.jsp" method="post">

<input
type="hidden"
name="id"
value="<%= id %>">

<p>

CPF

<br>

<input
type="text"
name="cpf"
value="<%= cliente.getCpf() %>">

</p>

<p>

Nome

<br>

<input
type="text"
name="nome"
value="<%= cliente.getNome() %>">

</p>

<p>

Email

<br>

<input
type="email"
name="email"
value="<%= cliente.getEmail() %>">

</p>

<p>

CEP

<br>

<input
type="text"
name="cep"
value="<%= cliente.getCep() %>">

</p>

<p>

Rua

<br>

<input
type="text"
name="rua"
value="<%= cliente.getRua() %>">

</p>

<p>

Número

<br>

<input
type="text"
name="numero"
value="<%= cliente.getNumero() %>">

</p>

<p>

Bairro

<br>

<input
type="text"
name="bairro"
value="<%= cliente.getBairro() %>">

</p>

<p>

Cidade

<br>

<input
type="text"
name="cidade"
value="<%= cliente.getCidade() %>">

</p>

<p>

Estado

<br>

<input
type="text"
name="estado"
value="<%= cliente.getEstado() %>">

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