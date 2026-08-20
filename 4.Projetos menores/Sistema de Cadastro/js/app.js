const paginasProtegidas = [
    "lista.html",
    "editar.html"
];

const paginaAtual =
    window.location.pathname.split("/").pop();

const usuarioLogado =
    localStorage.getItem("usuarioLogado");

if (
    paginasProtegidas.includes(paginaAtual)
    && !usuarioLogado
) {
    window.location.href = "acesso-negado.html";
}

if (document.getElementById("login-email")) {

    const nomeInput =
        document.getElementById("login-nome");

    const emailInput =
        document.getElementById("login-email");

    const botaoLogin =
        document.querySelector(".login-btn");

    botaoLogin.addEventListener("click", () => {

        const nome =
            nomeInput.value.trim();

        const email =
            emailInput.value.trim();

        const clientes =
            JSON.parse(localStorage.getItem("clientes")) || [];

        const usuario =
            clientes.find(cliente =>

                cliente.nome === nome &&
                cliente.email === email

            );

        if (!usuario) {

            alert("Usuário não encontrado");

            return;
        }

        localStorage.setItem(
            "usuarioLogado",
            JSON.stringify(usuario)
        );

        window.location.href = "menu.html";
    });
}

if (document.getElementById("usuario-logado")) {

    const usuario =
        JSON.parse(localStorage.getItem("usuarioLogado"));

    const topoUsuario =
        document.getElementById("topo-usuario");

    if (usuario) {

        topoUsuario.style.display = "flex";

        document.getElementById("usuario-logado")
            .innerHTML = `Olá, ${usuario.nome}`;

    } else {

        topoUsuario.style.display = "none";
    }
}

if (document.getElementById("logout")) {

    document.getElementById("logout")
        .addEventListener("click", () => {

            localStorage.removeItem("usuarioLogado");

            window.location.href = "login.html";
        });
}

if (document.getElementById("cep")) {

    let listaClientes =
        JSON.parse(localStorage.getItem("clientes")) || [];

    const inputs =
        document.querySelectorAll(".campo-resposta");

    const nomeInput = inputs[0];
    const emailInput = inputs[1];
    const telefoneInput = inputs[2];

    const cepInput =
        document.getElementById("cep");

    const ruaInput =
        document.getElementById("rua");

    const bairroInput =
        document.getElementById("bairro");

    const cidadeInput =
        document.getElementById("cidade");

    const estadoInput =
        document.getElementById("estado");

    const containerEndereco =
        document.getElementById("container-endereco");

    const botaoCadastrar =
        document.querySelector(".cadastrar");

    telefoneInput.addEventListener("input", () => {

        let valor =
            telefoneInput.value.replace(/\D/g, "");

        valor = valor.slice(0, 11);

        if (valor.length > 10) {

            valor =
                `(${valor.slice(0, 2)}) ${valor.slice(2, 7)}-${valor.slice(7)}`;

        }

        telefoneInput.value = valor;
    });

    cepInput.addEventListener("input", async () => {

        let valor =
            cepInput.value.replace(/\D/g, "");

        valor = valor.slice(0, 8);

        if (valor.length > 5) {

            valor =
                valor.slice(0, 5) + "-" + valor.slice(5);
        }

        cepInput.value = valor;

        const cepLimpo =
            valor.replace(/\D/g, "");

        if (cepLimpo.length !== 8) {

            containerEndereco.style.display = "none";

            return;
        }

        try {

            const resposta =
                await fetch(`https://viacep.com.br/ws/${cepLimpo}/json/`);

            const dados =
                await resposta.json();

            if (dados.erro) return;

            ruaInput.value =
                dados.logradouro;

            bairroInput.value =
                dados.bairro;

            cidadeInput.value =
                dados.localidade;

            estadoInput.value =
                dados.uf;

            containerEndereco.style.display = "flex";

        } catch (erro) {

            console.log(erro);
        }
    });

    botaoCadastrar.addEventListener("click", () => {

        const nome =
            nomeInput.value.trim();

        const email =
            emailInput.value.trim();

        const telefone =
            telefoneInput.value.trim();

        const cep =
            cepInput.value.trim();

        if (
            nome === "" ||
            email === "" ||
            telefone === "" ||
            cep === ""
        ) {

            alert("Preencha todos os campos");

            return;
        }

        const cliente = {

            nome,
            email,
            telefone,
            cep,

            rua: ruaInput.value,
            bairro: bairroInput.value,
            cidade: cidadeInput.value,
            estado: estadoInput.value
        };

        listaClientes.push(cliente);

        localStorage.setItem(
            "clientes",
            JSON.stringify(listaClientes)
        );

        alert("Cliente cadastrado!");

        window.location.reload();
    });
}

if (document.getElementById("lista-clientes")) {

    const listaContainer =
        document.getElementById("lista-clientes");

    let listaClientes =
        JSON.parse(localStorage.getItem("clientes")) || [];

    listaClientes.forEach((cliente, index) => {

        const card =
            document.createElement("div");

        card.classList.add("card-cliente");

        card.innerHTML = `
            <h2>${cliente.nome}</h2>

            <p><strong>Email:</strong> ${cliente.email}</p>

            <p><strong>Telefone:</strong> ${cliente.telefone}</p>

            <p><strong>CEP:</strong> ${cliente.cep}</p>

            <div class="card-footer">

                <div class="acoes">

                    <button class="editar" data-index="${index}">
                        ✏
                    </button>

                    <button class="deletar" data-index="${index}">
                        ✖
                    </button>

                </div>

            </div>
        `;

        listaContainer.appendChild(card);
    });

    document.addEventListener("click", (event) => {

        if (event.target.classList.contains("deletar")) {

            const index =
                event.target.dataset.index;

            listaClientes.splice(index, 1);

            localStorage.setItem(
                "clientes",
                JSON.stringify(listaClientes)
            );

            location.reload();
        }

        if (event.target.classList.contains("editar")) {

            const index =
                event.target.dataset.index;

            localStorage.setItem(
                "clienteEditar",
                index
            );

            window.location.href =
                "editar.html";
        }
    });
}

if (document.getElementById("form-editar")) {

    const index =
        localStorage.getItem("clienteEditar");

    let listaClientes =
        JSON.parse(localStorage.getItem("clientes")) || [];

    const cliente =
        listaClientes[index];

    const nomeInput =
        document.getElementById("editar-nome");

    const emailInput =
        document.getElementById("editar-email");

    const telefoneInput =
        document.getElementById("editar-telefone");

    const cepInput =
        document.getElementById("editar-cep");

    nomeInput.value = cliente.nome;
    emailInput.value = cliente.email;
    telefoneInput.value = cliente.telefone;
    cepInput.value = cliente.cep;

    document.getElementById("form-editar")
        .addEventListener("submit", (event) => {

            event.preventDefault();

            listaClientes[index].nome =
                nomeInput.value;

            listaClientes[index].email =
                emailInput.value;

            listaClientes[index].telefone =
                telefoneInput.value;

            listaClientes[index].cep =
                cepInput.value;

            localStorage.setItem(
                "clientes",
                JSON.stringify(listaClientes)
            );

            alert("Cliente atualizado!");

            window.location.href =
                "lista.html";
        });
}