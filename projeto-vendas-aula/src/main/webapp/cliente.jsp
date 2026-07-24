<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Clientes</title>
</head>
<body>

<%@ include file="topo.jsp" %>

<h2>Menu de Clientes</h2>

<hr>

<p>
    <a href="cadastrarCliente.jsp">
        <button>Cadastrar Cliente</button>
    </a>
</p>

<p>
    <a href="listarCliente.jsp">
        <button>Listar Clientes</button>
    </a>
</p>

<p>
    <a href="consultarCliente.jsp">
        <button>Consultar Cliente</button>
    </a>
</p>

<p>
    <a href="alterarCliente.jsp">
        <button>Alterar Cliente</button>
    </a>
</p>

<p>
    <a href="excluirCliente.jsp">
        <button>Excluir Cliente</button>
    </a>
</p>

<p>
    <a href="index.jsp">
        <button>Voltar</button>
    </a>
</p>

<%@ include file="rodape.jsp" %>

</body>
</html>