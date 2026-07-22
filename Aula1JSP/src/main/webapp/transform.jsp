<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dados Recebidos</title>
</head>
<body>

<%@ include file="topo.jsp" %>

<h1>Dados Recebidos</h1>

<%
String nome = request.getParameter("txtnome");
String email = request.getParameter("txtemail");
String nascimento = request.getParameter("txtdtnasc");
%>

<p><strong>Nome:</strong> <%= nome %></p>

<p><strong>E-mail:</strong> <%= email %></p>

<p><strong>Data de nascimento:</strong> <%= nascimento %></p>

<%@ include file="rodape.jsp" %>

<a href="index.jsp">Voltar</a>

</body>
</html>