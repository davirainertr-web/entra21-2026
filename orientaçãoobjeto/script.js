let listaClientes = [];

const inputs = document.querySelectorAll('.campo-resposta');
const botaoCadastrar = document.querySelector('.informacoes button');
const corpoTabela = document.getElementById('corpo-tabela');

botaoCadastrar.addEventListener('click', () => {
    const nomeDigitado = inputs[0].value.trim();
    const emailDigitado = inputs[1].value.trim();
    const telefoneDigitado = inputs[2].value.trim();

    if (nomeDigitado === "" || emailDigitado === "" || telefoneDigitado === "") {
        alert("Por favor, preencha todos os campos!");
        return;
    }

    const partesDoNome = nomeDigitado.split(/\s+/);
    if (partesDoNome.length < 2) {
        alert("Por favor, digite seu nome completo (Nome e Sobrenome).");
        return;
    }

    if (!emailDigitado.includes("@")) {
        alert("Por favor, insira um e-mail válido contendo '@'.");
        return;
    }

    const usuarioJaExiste = listaClientes.some((cliente) => {
        return cliente.email === emailDigitado || cliente.telefone === telefoneDigitado;
    });

    if (usuarioJaExiste) {
        alert("Atenção: Este E-mail ou Telefone já está cadastrado para outro usuário!");
    }

    const novoCliente = {
        nome: nomeDigitado,
        email: emailDigitado,
        telefone: telefoneDigitado
    };

    listaClientes.push(novoCliente);

    inputs[0].value = "";
    inputs[1].value = "";
    inputs[2].value = "";

    atualizarTabela();
});

function atualizarTabela() {
    corpoTabela.innerHTML = "";

    listaClientes.forEach((cliente) => {
        const linha = document.createElement('tr');

        linha.innerHTML = `
            <td>${cliente.nome}</td>
            <td>${cliente.email}</td>
            <td>${cliente.telefone}</td>
        `;

        corpoTabela.appendChild(linha);
    });
}