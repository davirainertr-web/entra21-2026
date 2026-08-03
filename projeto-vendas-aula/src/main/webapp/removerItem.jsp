<%@page import="dao.ProdutoDao"%>
<%@page import="modelos.Pedido"%>
<%@page import="modelos.ItemPedido"%>

<%

int id = Integer.parseInt(request.getParameter("id"));
int quantidade = Integer.parseInt(request.getParameter("quantidade"));

Pedido pedido =
(Pedido) session.getAttribute("pedido");

if(pedido == null){

    response.sendRedirect("carrinho.jsp");
    return;

}

ProdutoDao produtoDao = new ProdutoDao();

for(int i = 0; i < pedido.getItens().size(); i++){

    ItemPedido item = pedido.getItens().get(i);

    if(item.getProduto().getId() == id){

        if(quantidade >= item.getQuantidade()){

            produtoDao.devolverEstoque(

                id,

                item.getQuantidade()

            );

            pedido.getItens().remove(i);

        }else{

            produtoDao.devolverEstoque(

                id,

                quantidade

            );

            item.setQuantidade(

                item.getQuantidade() - quantidade

            );

        }

        break;

    }

}

session.setAttribute("pedido", pedido);

response.sendRedirect("carrinho.jsp");

%>