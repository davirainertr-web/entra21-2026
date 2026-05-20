let listaClientes = JSON.parse(localStorage.getItem('clientes')) || [];

const inputs = document.querySelectorAll('.campo-resposta');
const botaoCadastrar = document.querySelector('.informacoes button');

const telefoneInput = inputs[2];

telefoneInput.addEventListener("input", () => {

    let valor = telefoneInput.value;

    valor = valor.replace(/\D/g, "");

    valor = valor.slice(0, 11);

    if (valor.length > 10) {
        valor = valor.replace(
            /^(\d{2})(\d{5})(\d{4})$/,
            "($1) $2-$3"
        );
    } else {
        valor = valor.replace(
            /^(\d{2})(\d{4})(\d{0,4})$/,
            "($1) $2-$3"
        );
    }

    telefoneInput.value = valor;
});

botaoCadastrar.addEventListener('click', () => {

    inputs.forEach(input => {
        input.classList.remove('erro', 'acerto');
    });

    const nomeDigitado = inputs[0].value.trim();
    const emailDigitado = inputs[1].value.trim();
    const telefoneDigitado = inputs[2].value.trim();

    let valido = true;

    const partesDoNome = nomeDigitado.split(/\s+/);
    if (nomeDigitado === "" || partesDoNome.length < 2) {
        inputs[0].classList.add('erro');
        valido = false;
    } else {
        inputs[0].classList.add('acerto');
    }

    if (emailDigitado === "" || !emailDigitado.includes("@")) {
        inputs[1].classList.add('erro');
        valido = false;
    } else {
        inputs[1].classList.add('acerto');
    }

    if (
    telefoneDigitado === "" ||
    telefoneDigitado.length < 15
) {
        inputs[2].classList.add('erro');
        valido = false;
    } else {
        inputs[2].classList.add('acerto');
    }

    if (!valido) return;

    const usuarioJaExiste = listaClientes.some(cliente =>
        cliente.email === emailDigitado || cliente.telefone === telefoneDigitado
    );

    if (usuarioJaExiste) {
        alert("E-mail ou telefone já cadastrado!");
        return;
    }

    listaClientes.push({
        nome: nomeDigitado,
        email: emailDigitado,
        telefone: telefoneDigitado
    });

    localStorage.setItem('clientes', JSON.stringify(listaClientes));

    inputs.forEach(input => {
    input.value = "";
    input.classList.remove('erro', 'acerto');
});

    alert("Cliente cadastrado com sucesso!");
});