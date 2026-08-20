<%@page import="dao.ClienteDao"%>
<%@page import="modelos.Cliente"%>

<%
    String cpf = request.getParameter("cpf");
    String nome = request.getParameter("nome");
    String email = request.getParameter("email");
    String cep = request.getParameter("cep");
    String rua = request.getParameter("rua");
    String numero = request.getParameter("numero");
    String bairro = request.getParameter("bairro");
    String cidade = request.getParameter("cidade");
    String estado = request.getParameter("estado");

    Cliente cliente = new Cliente();

    cliente.setCpf(cpf);
    cliente.setNome(nome);
    cliente.setEmail(email);
    cliente.setCep(cep);
    cliente.setRua(rua);
    cliente.setNumero(numero);
    cliente.setBairro(bairro);
    cliente.setCidade(cidade);
    cliente.setEstado(estado);

    ClienteDao dao = new ClienteDao();
    cliente.setId(dao.consultar().size() + 1);
    dao.salvar(cliente);
%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Cliente Salvo</title>
</head>

<body>

<%@ include file="topo.jsp" %>

<h2>Cliente cadastrado com sucesso!</h2>

<p><strong>Nome:</strong> <%= cliente.getNome() %></p>
<p><strong>CPF:</strong> <%= cliente.getCpf() %></p>
<p><strong>Email:</strong> <%= cliente.getEmail() %></p>
<p><strong>CEP:</strong> <%= cliente.getCep() %></p>
<p><strong>Rua:</strong> <%= cliente.getRua() %></p>
<p><strong>Número:</strong> <%= cliente.getNumero() %></p>
<p><strong>Bairro:</strong> <%= cliente.getBairro() %></p>
<p><strong>Cidade:</strong> <%= cliente.getCidade() %></p>
<p><strong>Estado:</strong> <%= cliente.getEstado() %></p>

<hr>

<a href="cadastrarCliente.jsp">Cadastrar outro cliente</a>

<br><br>

<a href="listarCliente.jsp">Listar clientes</a>

<br><br>

<a href="cliente.jsp">Voltar ao menu</a>

<%@ include file="rodape.jsp" %>

</body>
</html>