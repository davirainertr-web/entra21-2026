public class pessoa {
    private String nome;
    private String email;


    public pessoa() {

    }

    public pessoa(String nome, String email) {
        setNome(nome);
        setEmail(email);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    } 

    public void display() {
        System.out.println("nome: " + nome);
        System.out.println("email: " + email);

    }
}
