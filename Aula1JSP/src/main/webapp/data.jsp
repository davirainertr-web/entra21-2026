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
<title>Data Atual</title>
</head>
<body>

<%@ include file="topo.jsp" %>

<h1>Data Atual</h1>

<%
int dia = Integer.parseInt(new SimpleDateFormat("dd").format(new Date()));
int mes = Integer.parseInt(new SimpleDateFormat("MM").format(new Date()));
int ano = Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date()));
%>

<h3>
Hoje é dia <%= dia %> de <%= fncMES(mes) %> de <%= ano %>.
</h3>

<%@ include file="rodape.jsp" %>

<a href="index.jsp">Voltar</a>

</body>
</html>