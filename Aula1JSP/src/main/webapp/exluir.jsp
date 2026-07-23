<%@page import="dao.contatoDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Excluir Contato</title>
</head>
<body>
    <%
        String idParam = request.getParameter("id");
        if(idParam != null) {
            int id = Integer.parseInt(idParam);
            
            contatoDao dao = new contatoDao();
            dao.excluir(id);
    %>
            <h1>Excluiu com sucesso o id: <%= id %></h1>
    <%
        } else {
    %>
            <h1>Erro: ID não fornecido.</h1>
    <%
        }
    %>
    
    <hr />
    <a href="listar.jsp">Voltar para a Lista</a>
</body>
</html>