public class aluno extends pessoa {
    private double media;

    public aluno() {

    }

    public aluno(String nome, String email, double media) {
        super(nome,email);
        //setNome(nome);
        //setEmail(email);
        setMedia(media);
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getStatus() {
       /* if(media < 7) {
            return "Reprovado;"
        }
        else {
            return "Aprovado";
        } */
        return media < 7 ? "Reprovado" : "Aprovado";
    }

    public void display() {
        /*System.out.println("Nome:" + getNome());
        System.out.println("Email: " + getEmail());/* /* */
        super.display();
        System.out.println("Média: " + media);
        System.out.println("Status: " + getStatus());
    }
}
