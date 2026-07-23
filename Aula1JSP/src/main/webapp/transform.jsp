<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="dao.contatoDao"%>
<%@page import="modelos.Contato"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dados Recebidos</title>
</head>
<body>
    <%@ include file="topo.jsp" %>
    
    <% 
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String dataNasc = request.getParameter("dataNascimento");
        
        if (nome != null && email != null && !nome.trim().isEmpty() && !email.trim().isEmpty()) {
            Contato ct = new Contato();
            ct.setNome(nome);
            ct.setEmail(email);
            
            contatoDao dao = new contatoDao();
            dao.salvar(ct);
            
            List<Contato> contatos = dao.consultar();
    %>
            <div style="background-color: #d4edda; color: #155724; padding: 15px; margin: 20px 0; border: 1px solid #c3e6cb; border-radius: 5px;">
                <h3>✓ Dados salvos com sucesso!</h3>
                <p><strong>Nome cadastrado:</strong> <%= ct.getNome() %></p>
                <p><strong>E-mail cadastrado:</strong> <%= ct.getEmail() %></p>
                <% if(dataNasc != null && !dataNasc.isEmpty()) { %>
                    <p><strong>Data de Nascimento:</strong> <%= dataNasc %></p>
                <% } %>
            </div>

            <table border="1" style="border-collapse: collapse; text-align: left; width: 100%; max-width: 600px; margin-top: 15px;">
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
                      for(Contato c : contatos){
                         out.print("<tr>");
                         out.print("<td>"+ c.getId() +"</td>");
                         out.print("<td>"+ c.getNome() +"</td>");
                         out.print("<td>"+ c.getEmail() +"</td>");
                         out.print("<td><a href='excluir.jsp?id="+c.getId()+"'>excluir</a></td>");
                         out.print("<td><button>Editar</button></td>");
                         out.print("</tr>");
                      }
                   %>
               </tbody>
            </table>
    <% 
        } else { 
    %>
            <div style="background-color: #f8d7da; color: #721c24; padding: 15px; margin: 20px 0; border: 1px solid #f5c6cb; border-radius: 5px;">
                <h3>Erro: Nenhum dado válido foi enviado.</h3>
            </div>
    <% 
        } 
    %>

    <%@ include file="rodape.jsp" %>
    <hr />
    <a href="index.jsp">home</a> | <a href="cadastro.jsp">Novo</a>
</body>
</html>