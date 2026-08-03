<%@page import="dao.ProdutoDao"%>
<%@page import="modelos.Produto"%>
<%@page import="modelos.ItemPedido"%>
<%@page import="modelos.Pedido"%>

<%

int id = Integer.parseInt(request.getParameter("id"));
int quantidade = Integer.parseInt(request.getParameter("quantidade"));

Pedido pedido =
(Pedido) session.getAttribute("pedido");

if(pedido == null){

    response.sendRedirect("novoPedido.jsp");
    return;

}

ProdutoDao dao = new ProdutoDao();

Produto produto = dao.consultar(id);

if(produto == null){

    out.println("<h2>Produto não encontrado.</h2>");
    return;

}

if(!dao.possuiEstoque(id, quantidade)){

    out.println("<h2>Estoque insuficiente.</h2>");
    out.println("<a href='adicionarProdutoPedido.jsp'>Voltar</a>");

    return;

}

dao.baixarEstoque(id, quantidade);

boolean encontrou = false;

for(ItemPedido item : pedido.getItens()){

    if(item.getProduto().getId() == id){

        item.setQuantidade(item.getQuantidade() + quantidade);

        encontrou = true;

        break;

    }

}

if(!encontrou){

    pedido.getItens().add(
        new ItemPedido(produto, quantidade)
    );

}

session.setAttribute("pedido", pedido);

response.sendRedirect("carrinho.jsp");

%>