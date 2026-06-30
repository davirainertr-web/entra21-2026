class Validar {
    public static void preco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
    }

    public static void estoque(int estoque) {
        if (estoque < 0) {
            throw new IllegalArgumentException("O estoque não pode ser negativo.");
        }
    }

    public static void medida(String medida) {
        if (medida == null || medida.trim().length() != 2) {
            throw new IllegalArgumentException("A unidade de medida deve ter exatamente 2 caracteres.");
        }
    }
}