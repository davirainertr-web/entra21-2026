
public class Main {

	public static void main(String[] args) {
	   Produto p1 = new Produto();
	   Produto p2 = new Produto(1,"Milho");
	   Produto p3 = new Produto(1,"Milho",1.0);
	   System.out.println(p1);
	   
	   p1.setId(1);
	   p1.setDescricao("milho");
	   p1.setPreco(1.75);
	   p1.setEstoque(10);
	   
	   System.out.println(p1.getId());
	   System.out.println(p1.getDescricao());
	   System.out.println(p1.getPreco());
	   System.out.println(p1.getEstoque());   

	   System.out.println(p2.getId());
	   System.out.println(p2.getDescricao());

	   System.out.println(p3.getId());
	   System.out.println(p3.getDescricao());
	   System.out.println(p3.getPreco());

	}

}
