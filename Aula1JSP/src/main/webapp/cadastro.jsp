<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro</title>
</head>
<body>

<%@ include file="topo.jsp" %>

<h1>Cadastro</h1>

<form action="trataform.jsp" method="post">

    Nome:
    <input type="text" name="txtnome"><br><br>

    E-mail:
    <input type="email" name="txtemail"><br><br>

    Data de nascimento:
    <input type="date" name="txtdtnasc"><br><br>

    <input type="submit" value="Cadastrar">

</form>

<%@ include file="rodape.jsp" %>

<a href="index.jsp">Voltar</a>

</body>
</html>