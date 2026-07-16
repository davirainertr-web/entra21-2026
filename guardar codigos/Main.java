 /*import java.util.List;
 import java.util.Scanner;
 
 import dao.ClienteDao;
import dao.PedidoDao;
import dao.ProdutoDao;
import modelos.Cliente;
import modelos.Pedido;
import modelos.Produto;

public class Main {

    static ClienteDao clienteDao = new ClienteDao();
    static Scanner sc = new Scanner(System.in);
    static ProdutoDao produtoDao = new ProdutoDao();
    static PedidoDao pedidoDao = new PedidoDao();
    static Pedido carrinhoAtual = null;

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Produtos");
            System.out.println("2 - Clientes");
            System.out.println("3 - Pedidos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
    case 1:
        menuProduto();
        break;

    case 2:
        menuCliente();
        break;

    case 3:
        menuPedido();
        break;

    case 0:
        System.out.println("Saindo...");
        break;

    default:
        System.out.println("Opção inválida.");
    }
        } while (opcao != 0);
    }

    static void cadastrarProduto() {
    System.out.print("Descrição: ");
    String descricao = sc.nextLine();
    System.out.print("Preço: ");
    double preco = Double.parseDouble(sc.nextLine());
    System.out.print("Estoque: ");
    int estoque = Integer.parseInt(sc.nextLine());

    Produto p = new Produto(descricao, preco, estoque);
    Produto salvo = produtoDao.salvar(p);
    if (salvo != null) {
        System.out.println("Produto cadastrado! ID: " + salvo.getId());
    } else {
        System.out.println("Erro ao cadastrar produto.");
    }
}

static void listarProdutos() {
    List<Produto> produtos = produtoDao.consultar();

    if (produtos.isEmpty()) {
        System.out.println("Nenhum produto cadastrado.");
        return;
    }

    for (Produto p : produtos) {
        System.out.println(p);
    }
}

static void consultarProduto() {
    System.out.print("ID do produto: ");
    int id = Integer.parseInt(sc.nextLine());

    Produto p = produtoDao.consultar(id);

    if (p != null) {
        System.out.println(p);
    } else {
        System.out.println("Produto não encontrado.");
    }
}

static void alterarProduto() {

    System.out.print("ID do produto: ");
    int id = Integer.parseInt(sc.nextLine());

    Produto p = produtoDao.consultar(id);

    if (p == null) {
        System.out.println("Produto não encontrado.");
        return;
    }

    System.out.print("Nova descrição (" + p.getDescricao() + "): ");
    p.setDescricao(sc.nextLine());

    System.out.print("Novo preço (" + p.getPreco() + "): ");
    p.setPreco(Double.parseDouble(sc.nextLine()));

    System.out.print("Novo estoque (" + p.getEstoque() + "): ");
    p.setEstoque(Integer.parseInt(sc.nextLine()));

    produtoDao.alterar(p);

    System.out.println("Produto alterado com sucesso.");
}

static void excluirProduto() {

    System.out.print("ID do produto: ");
    int id = Integer.parseInt(sc.nextLine());

    produtoDao.deletar(id);

    System.out.println("Produto excluído (se existia).");
}

static void menuProduto() {
    int opcao;

    do {
        System.out.println("\n--- Produtos ---");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar");
        System.out.println("3 - Consultar por ID");
        System.out.println("4 - Alterar");
        System.out.println("5 - Excluir");
        System.out.println("0 - Voltar");
        System.out.print("Escolha: ");

        opcao = Integer.parseInt(sc.nextLine());

        switch (opcao) {
            case 1:
                cadastrarProduto();
                break;

            case 2:

                listarProdutos();
                break;

            case 3:
                consultarProduto();
                break;

            case 4:
                alterarProduto();
                break;

            case 5:
                excluirProduto();
                break;

            case 0:
                break;

            default:
                System.out.println("Opção inválida.");
        }

    } while (opcao != 0);
}

    static void menuCliente() {
    int opcao;
    do {
        System.out.println("\n--- Clientes ---");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar");
        System.out.println("3 - Consultar por ID");
        System.out.println("4 - Alterar");
        System.out.println("5 - Excluir");
        System.out.println("0 - Voltar");
        System.out.print("Escolha: ");
        opcao = Integer.parseInt(sc.nextLine());

        switch (opcao) {
            case 1: cadastrarCliente(); break;
            case 2: listarClientes(); break;
            case 3: consultarCliente(); break;
            case 4: alterarCliente(); break;
            case 5: excluirCliente(); break;
            case 0: break;
            default: System.out.println("Opção inválida.");
        }
    } while (opcao != 0);
}

static void cadastrarCliente() {
    System.out.print("CPF: ");
    String cpf = sc.nextLine();
    System.out.print("Nome: ");
    String nome = sc.nextLine();
    System.out.print("Email: ");
    String email = sc.nextLine();
    System.out.print("Rua: ");
    String rua = sc.nextLine();
    System.out.print("Número: ");
    String numero = sc.nextLine();
    System.out.print("Bairro: ");
    String bairro = sc.nextLine();
    System.out.print("CEP: ");
    String cep = sc.nextLine();
    System.out.print("Cidade: ");
    String cidade = sc.nextLine();
    System.out.print("Estado (UF): ");
    String estado = sc.nextLine();

    Cliente c = new Cliente(cpf, nome, email, rua, numero, bairro, cep, cidade, estado);
    Cliente salvo = clienteDao.salvar(c);
    System.out.println(salvo != null ? "Cliente cadastrado! ID: " + salvo.getId() : "Erro ao cadastrar.");
}

static void listarClientes() {
    List<Cliente> clientes = clienteDao.consultar();
    if (clientes.isEmpty()) {
        System.out.println("Nenhum cliente cadastrado.");
    }
    for (Cliente c : clientes) {
        System.out.println(c);
    }
}

static void consultarCliente() {
    System.out.print("ID do cliente: ");
    int id = Integer.parseInt(sc.nextLine());
    Cliente c = clienteDao.consultar(id);
    System.out.println(c != null ? c : "Cliente não encontrado.");
}

static void alterarCliente() {
    System.out.print("ID do cliente a alterar: ");
    int id = Integer.parseInt(sc.nextLine());
    Cliente c = clienteDao.consultar(id);
    if (c == null) {
        System.out.println("Cliente não encontrado.");
        return;
    }
    System.out.print("Novo nome (" + c.getNome() + "): ");
    c.setNome(sc.nextLine());
    System.out.print("Novo email (" + c.getEmail() + "): ");
    c.setEmail(sc.nextLine());
    System.out.print("Nova cidade (" + c.getCidade() + "): ");
    c.setCidade(sc.nextLine());

    clienteDao.alterar(c);
    System.out.println("Cliente alterado com sucesso.");
}

static void excluirCliente() {
    System.out.print("ID do cliente a excluir: ");
    int id = Integer.parseInt(sc.nextLine());
    clienteDao.deletar(id);
    System.out.println("Cliente excluído (se existia).");
    }

    static void menuPedido() {
    int opcao;
    do {
        System.out.println("\n--- Pedidos ---");
        System.out.println("1 - Iniciar novo pedido (carrinho)");
        System.out.println("2 - Adicionar produto ao carrinho");
        System.out.println("3 - Remover produto do carrinho");
        System.out.println("4 - Ver carrinho atual");
        System.out.println("5 - Finalizar pedido");
        System.out.println("6 - Consultar pedido por ID");
        System.out.println("7 - Listar todos os pedidos");
        System.out.println("0 - Voltar");
        System.out.print("Escolha: ");
        opcao = Integer.parseInt(sc.nextLine());

        switch (opcao) {
            case 1: iniciarPedido(); break;
            case 2: adicionarAoCarrinho(); break;
            case 3: removerDoCarrinho(); break;
            case 4: verCarrinho(); break;
            case 5: finalizarPedido(); break;
            case 6: consultarPedido(); break;
            case 7: listarPedidos(); break;
            case 0: break;
            default: System.out.println("Opção inválida.");
        }
    } while (opcao != 0);
}

static void iniciarPedido() {
    System.out.print("ID do cliente: ");
    int id = Integer.parseInt(sc.nextLine());
    Cliente cliente = clienteDao.consultar(id);
    if (cliente == null) {
        System.out.println("Cliente não encontrado.");
        return;
    }
    carrinhoAtual = pedidoDao.criarPedido(cliente);
    System.out.println("Carrinho iniciado para " + cliente.getNome());
}

static void adicionarAoCarrinho() {
    if (carrinhoAtual == null) {
        System.out.println("Inicie um pedido primeiro (opção 1).");
        return;
    }
    System.out.print("ID do produto: ");
    int idProduto = Integer.parseInt(sc.nextLine());
    Produto produto = produtoDao.consultar(idProduto);
    if (produto == null) {
        System.out.println("Produto não encontrado.");
        return;
    }
    System.out.print("Quantidade: ");
    int quantidade = Integer.parseInt(sc.nextLine());

    pedidoDao.adicionarAoCarrinho(carrinhoAtual, produto, quantidade);
    System.out.println("Produto adicionado ao carrinho.");
}

static void removerDoCarrinho() {
    if (carrinhoAtual == null) {
        System.out.println("Nenhum carrinho aberto.");
        return;
    }
    System.out.print("ID do produto a remover: ");
    int idProduto = Integer.parseInt(sc.nextLine());
    pedidoDao.removerDoCarrinho(carrinhoAtual, idProduto);
    System.out.println("Item removido (se existia).");
}

static void verCarrinho() {
    if (carrinhoAtual == null) {
        System.out.println("Nenhum carrinho aberto.");
        return;
    }
    System.out.println(carrinhoAtual);
    carrinhoAtual.getItens().forEach(System.out::println);
}

static void finalizarPedido() {
    if (carrinhoAtual == null) {
        System.out.println("Nenhum carrinho aberto.");
        return;
    }
    Pedido finalizado = pedidoDao.finalizarPedido(carrinhoAtual);
    if (finalizado != null) {
        System.out.println("Pedido finalizado! " + finalizado);
        carrinhoAtual = null;
    }
}

static void consultarPedido() {
    System.out.print("ID do pedido: ");
    int id = Integer.parseInt(sc.nextLine());
    Pedido p = pedidoDao.consultar(id);
    if (p != null) {
        System.out.println(p);
        p.getItens().forEach(System.out::println);
    } else {
        System.out.println("Pedido não encontrado.");
    }
}

static void listarPedidos() {
    List<Pedido> pedidos = pedidoDao.consultar();
    if (pedidos.isEmpty()) {
        System.out.println("Nenhum pedido cadastrado.");
    }
    for (Pedido p : pedidos) {
        System.out.println(p);
    }
}
}/* */
