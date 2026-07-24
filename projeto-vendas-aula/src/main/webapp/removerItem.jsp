<%@page import="java.util.List"%>
<%@page import="modelos.ItemPedido"%>

<%

int id = Integer.parseInt(request.getParameter("id"));
int quantidade = Integer.parseInt(request.getParameter("quantidade"));

List<ItemPedido> carrinho =
(List<ItemPedido>) session.getAttribute("carrinho");

if(carrinho != null){

    for(int i = 0; i < carrinho.size(); i++){

        ItemPedido item = carrinho.get(i);

        if(item.getProduto().getId() == id){

            if(quantidade >= item.getQuantidade()){

                item.getProduto().setEstoque(

                    item.getProduto().getEstoque()
                    + item.getQuantidade()

                );

                carrinho.remove(i);

            }else{

                item.setQuantidade(

                    item.getQuantidade() - quantidade

                );

                item.getProduto().setEstoque(

                    item.getProduto().getEstoque()
                    + quantidade

                );

            }

            break;

        }

    }

}

session.setAttribute("carrinho", carrinho);

response.sendRedirect("carrinho.jsp");

%>