<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="dao.contatoDao"%>
<%@page import="modelos.Contato"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Contatos</title>
</head>
<body>
    <%@ include file="topo.jsp" %>
    <h2>Contatos Cadastrados</h2>
    
    <% 
        contatoDao dao = new contatoDao();
        List<Contato> contatos = dao.consultar();
        
        if(contatos.isEmpty()) {
            out.print("<p style='color: #721c24;'>Não há nenhum contato registrado!</p>");
        } else {
    %>
            <table border="1" style="border-collapse: collapse; text-align: left; width: 100%; max-width: 600px;">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Nome</th>
                        <th>Email</th>
                        <th>Ações</th>
                    </tr>
                </thead>
                <tbody>
                <% 
                    for(Contato c : contatos) {
                        out.print("<tr>");
                        out.print("<td>" + c.getId() + "</td>");
                        out.print("<td>" + c.getNome() + "</td>");
                        out.print("<td>" + c.getEmail() + "</td>");
                        out.print("<td><a href='excluir.jsp?id=" + c.getId() + "'>excluir</a></td>");
                        out.print("<td><button>Editar</button></td>");
                        out.print("</tr>");
                    }
                %>
                </tbody>
            </table>
    <% 
        } 
    %>
	
    <%@ include file="rodape.jsp" %>
    <hr />
    <a href="index.jsp">home</a> | <a href="cadastro.jsp">Novo</a>
</body>
</html>