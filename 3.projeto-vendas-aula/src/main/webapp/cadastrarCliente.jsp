<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrar Cliente</title>
</head>

<body>

<%@ include file="topo.jsp" %>

<h2>Cadastro de Cliente</h2>

<form action="salvarCliente.jsp" method="post">

    <p>
        <label>CPF:</label><br>
        <input
            type="text"
            name="cpf"
            placeholder="Ex: 12345678900"
            required>
    </p>

    <p>
        <label>Nome:</label><br>
        <input
            type="text"
            name="nome"
            placeholder="Ex: João Silva"
            required>
    </p>

    <p>
        <label>E-mail:</label><br>
        <input
            type="email"
            name="email"
            placeholder="Ex: joao@email.com">
    </p>

    <p>
        <label>CEP:</label><br>
        <input
            type="text"
            name="cep">
    </p>

    <p>
        <label>Rua:</label><br>
        <input
            type="text"
            name="rua">
    </p>

    <p>
        <label>Número:</label><br>
        <input
            type="text"
            name="numero">
    </p>

    <p>
        <label>Bairro:</label><br>
        <input
            type="text"
            name="bairro">
    </p>

    <p>
        <label>Cidade:</label><br>
        <input
            type="text"
            name="cidade">
    </p>

    <p>
        <label>Estado:</label><br>
        <input
            type="text"
            name="estado"
            placeholder="Ex: SC">
    </p>

    <button type="submit">Salvar Cliente</button>

</form>

<hr>

<a href="cliente.jsp">Voltar</a>

<%@ include file="rodape.jsp" %>

</body>
</html>