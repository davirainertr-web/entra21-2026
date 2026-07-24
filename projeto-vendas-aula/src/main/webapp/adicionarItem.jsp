<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="dao.ProdutoDao"%>
<%@page import="modelos.Produto"%>
<%@page import="modelos.ItemPedido"%>
<%@page import="modelos.Pedido"%>
<%@page import="modelos.ItemPedido"%>

<%

int id = Integer.parseInt(request.getParameter("id"));
int quantidade = Integer.parseInt(request.getParameter("quantidade"));

ProdutoDao dao = new ProdutoDao();

Produto produto = dao.consultar(id);

Pedido pedido =
(Pedido) session.getAttribute("pedido");

if(carrinho == null){
    carrinho = new ArrayList<>();
}

if(produto == null){

    out.print("<h2>Produto não encontrado.</h2>");
    return;

}

if(produto.getEstoque() < quantidade){

    out.print("<h2>Estoque insuficiente.</h2>");
    out.print("<a href='adicionarProdutoPedido.jsp'>Voltar</a>");
    return;

}

dao.baixarEstoque(id, quantidade);

boolean encontrou = false;

for(ItemPedido item : carrinho){

    if(item.getProduto().getId() == produto.getId()){

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