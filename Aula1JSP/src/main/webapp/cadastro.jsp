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
    <form action="transform.jsp" method="post">
        <label>Informe nome</label>
        <input type="text" placeholder="EX: José" name="nome" />
        
        <label>Informe email</label>
        <input type="email" placeholder="EX: jose@gmail.com" name="email" />
        
        <button type="submit">Gravar</button>
    </form>
    <hr />
    <%@ include file="rodape.jsp" %>
    <a href="index.jsp">Voltar</a>
</body>
</html>