public class main {
    public static void main(String[] args) {
        aluno al1 = new aluno();
        al1.setNome("Pedro");
        al1.setEmail("pedro@gmail.com");
        al1.setMedia(6.0);
        //System.out.println(al1.getStatus());
        //System.err.println(al1.getNome());
        //System.out.println(al1.getEmail());
        al1.display();

        aluno al2 = new aluno("Pietro", "pietro@gmail.com", 7);
        al2.display();

        
        cliente cl1 = new cliente();
        cl1.setLimite(900.0);
        System.out.println(cl1.getLimite());


    }
}