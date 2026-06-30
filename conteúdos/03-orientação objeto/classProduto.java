class Produto {
    private int id;
    private String descricao;
    private double preco;
    private int estoque;
    private String medida;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        Validar.preco(preco);
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        Validar.estoque(estoque);
        this.estoque = estoque;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        Validar.medida(medida);
        this.medida = medida;
    }

    void display() {
        System.out.printf("ID: %d | %s | R$ %.2f | Estq: %d (%s)\n", id, descricao, preco, estoque, medida);
    }

    void desconto(double pct) {
        if (pct > 0) setPreco(this.preco - this.preco * (pct / 100));
    }

    void acrescimo(double pct) {
        if (pct > 0) setPreco(this.preco + this.preco * (pct / 100));
    }
}