<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Date, java.text.SimpleDateFormat"%>

<%!
public String fncMES(int mes){
    switch(mes){
        case 1: return "Janeiro";
        case 2: return "Fevereiro";
        case 3: return "Março";
        case 4: return "Abril";
        case 5: return "Maio";
        case 6: return "Junho";
        case 7: return "Julho";
        case 8: return "Agosto";
        case 9: return "Setembro";
        case 10: return "Outubro";
        case 11: return "Novembro";
        case 12: return "Dezembro";
        default: return "";
    }
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Primeira Aula de JSP</title>
</head>
<body>

<h1>Bem-vindos à primeira aula de JSP</h1>

<p>Data e hora atuais: <%= new Date() %></p>

<%
int dia = Integer.parseInt(new SimpleDateFormat("dd").format(new Date()));
int mes = Integer.parseInt(new SimpleDateFormat("MM").format(new Date()));
int ano = Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date()));
%>

<p>Hoje é dia <%= dia %>.</p>

<p>Hoje é <%= dia %> de <%= fncMES(mes) %> de <%= ano %>.</p>

<%
String nome = "Vilson";
int idade = 50;
%>

<p>Seu nome é <%= nome %>.</p>

<%
if(idade >= 18){
%>
<p><%= nome %>, você é maior de idade.</p>
<%
}else{
%>
<p><%= nome %>, você é menor de idade.</p>
<%
}
%>

<%@ include file="topo.jsp" %>

<form action="trataform.jsp" method="post">
    Nome:
    <input type="text" name="txtnome"><br><br>

    E-mail:
    <input type="email" name="txtemail"><br><br>

    Data de nascimento:
    <input type="date" name="txtdtnasc"><br><br>

    <input type="submit" value="Enviar">
</form>

<%@ include file="rodape.jsp" %>

<br>

<a href="cadastro.jsp">Ir para Cadastro</a>

</body>
</html>