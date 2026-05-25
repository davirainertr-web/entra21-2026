if (document.querySelector(".cadastrar")) {

    let listaClientes = JSON.parse(localStorage.getItem('clientes')) || [];

    const nomeInput = document.querySelector('.informacoes input:nth-of-type(1)');
    const emailInput = document.querySelector('.informacoes input:nth-of-type(2)');
    const telefoneInput = document.querySelector('.informacoes input:nth-of-type(3)');
    const cepInput = document.getElementById("cep");

    const containerEndereco = document.getElementById("container-endereco");
    const ruaInput = document.getElementById("rua");
    const bairroInput = document.getElementById("bairro");
    const cidadeInput = document.getElementById("cidade");
    const estadoInput = document.getElementById("estado");

    const botaoCadastrar = document.querySelector('.cadastrar');

    cepInput.addEventListener("input", async () => {
        let valor = cepInput.value.replace(/\D/g, "").slice(0, 8);

        if (valor.length > 5) {
            valor = valor.slice(0, 5) + "-" + valor.slice(5);
        }

        cepInput.value = valor;

        const cepLimpo = valor.replace(/\D/g, "");

        if (cepLimpo.length !== 8) {
            containerEndereco.style.display = "none";
            cepInput.classList.remove("erro", "acerto");
            return;
        }

        const endereco = await buscarCEP(cepLimpo);

        if (!endereco) {
            cepInput.classList.remove("acerto");
            cepInput.classList.add("erro");
            containerEndereco.style.display = "none"; 
        } else {
            cepInput.classList.remove("erro");
            cepInput.classList.add("acerto");

            ruaInput.value = endereco.logradouro || "";
            bairroInput.value = endereco.bairro || "";
            cidadeInput.value = endereco.localidade || "";
            estadoInput.value = endereco.uf || "";

            containerEndereco.style.display = "flex";
        }
    });

    telefoneInput.addEventListener("input", () => {
        let valor = telefoneInput.value.replace(/\D/g, "").slice(0, 11);

        if (valor.length > 0) valor = "(" + valor;
        if (valor.length > 3) valor = valor.slice(0, 3) + ") " + valor.slice(3);
        if (valor.length > 10) valor = valor.slice(0, 10) + "-" + valor.slice(10);

        telefoneInput.value = valor;
    });

    async function buscarCEP(cep) {
        try {
            const resposta = await fetch(`https://viacep.com.br/ws/${cep}/json/`);
            const dados = await resposta.json();
            if (dados.erro) return null; 
            return dados;
        } catch (error) {
            return null;
        }
    }

    botaoCadastrar.addEventListener("click", async () => {

        const nomeDigitado = nomeInput.value.trim();
        const emailDigitado = emailInput.value.trim();
        const telefoneDigitado = telefoneInput.value.trim();
        const cepDigitado = cepInput.value.trim();
        const cepLimpo = cepDigitado.replace(/\D/g, "");

        const telefoneLimpo = telefoneDigitado.replace(/\D/g, "");
        let formularioValido = true;

        [nomeInput, emailInput, telefoneInput, cepInput].forEach(i => {
            i.classList.remove("erro", "acerto");
        });

        if (nomeDigitado === "" || nomeDigitado.split(" ").length < 2) {
            nomeInput.classList.add("erro");
            formularioValido = false;
        } else {
            nomeInput.classList.add("acerto");
        }

        if (emailDigitado === "" || !emailDigitado.includes("@")) {
            emailInput.classList.add("erro");
            formularioValido = false;
        } else {
            emailInput.classList.add("acerto");
        }

        if (telefoneLimpo.length !== 11) {
            telefoneInput.classList.add("erro");
            formularioValido = false;
        } else {
            telefoneInput.classList.add("acerto");
        }

        if (cepLimpo.length !== 8 || cepInput.classList.contains("erro")) {
            cepInput.classList.add("erro");
            formularioValido = false;
        }

        if (!formularioValido) return;

        const telefoneFormatado =
            `(${telefoneLimpo.slice(0, 2)}) ${telefoneLimpo.slice(2, 7)}-${telefoneLimpo.slice(7)}`;

        const emailJaExiste = listaClientes.some(cliente =>
        cliente.email === emailDigitado
        );

        const telefoneJaExiste = listaClientes.some(cliente =>
            cliente.telefone === telefoneFormatado
        );

        if (emailJaExiste) {
            emailInput.classList.remove("acerto");
            emailInput.classList.add("erro");
        }

        if (telefoneJaExiste) {
            telefoneInput.classList.remove("acerto");
            telefoneInput.classList.add("erro");
        }

        if (emailJaExiste || telefoneJaExiste) {
            return;
        }

        const novoCliente = {
            nome: nomeDigitado,
            email: emailDigitado,
            telefone: telefoneFormatado,
            cep: cepDigitado,
            rua: ruaInput.value.trim(),
            bairro: bairroInput.value.trim(),
            cidade: cidadeInput.value.trim(),
            estado: estadoInput.value.trim(),
            ddd: telefoneLimpo.slice(0, 2)
        };

        listaClientes.push(novoCliente);
        localStorage.setItem("clientes", JSON.stringify(listaClientes));

        nomeInput.value = "";
        emailInput.value = "";
        telefoneInput.value = "";
        cepInput.value = "";

        ruaInput.value = "";
        bairroInput.value = "";
        cidadeInput.value = "";
        estadoInput.value = "";

        containerEndereco.style.display = "none";
        
        [nomeInput, emailInput, telefoneInput, cepInput].forEach(i => i.classList.remove("acerto"));
    });
}

if (document.getElementById("lista-clientes")) {

    const listaContainer = document.getElementById('lista-clientes');
    let listaClientes = JSON.parse(localStorage.getItem('clientes')) || [];

    listaClientes.forEach((cliente, index) => {

        const card = document.createElement('div');
        card.classList.add('card-cliente');

        card.innerHTML = `
            <h2>${cliente.nome}</h2>

            <p><strong>E-mail:</strong> ${cliente.email}</p>
            <p><strong>Telefone:</strong> ${cliente.telefone}</p>
            <p><strong>CEP:</strong> ${cliente.cep}</p>

            <button class="mostrar-endereco">
                ▼ Ver endereço
            </button>

            <div class="detalhes-endereco">
                <p><strong>Rua:</strong> ${cliente.rua || "Não informada"}</p>
                <p><strong>Bairro:</strong> ${cliente.bairro || "Não informado"}</p>
                <p><strong>Cidade:</strong> ${cliente.cidade || "Não informada"}</p>
                <p><strong>Estado:</strong> ${cliente.estado || "Não informado"}</p>
                <p><strong>DDD:</strong> ${cliente.ddd || "--"}</p>
            </div>

            <div class="card-footer">
                <span>Cliente #${index + 1}</span>
                <div class="acoes">
                    <button class="editar" data-index="${index}" title="Editar">✏</button>
                    <button class="deletar" data-index="${index}" title="Deletar">✖</button>
                </div>
            </div>
        `;

        const botaoCep = card.querySelector(".mostrar-endereco");
        const dadosCep = card.querySelector(".detalhes-endereco");

        dadosCep.style.display = "none";

        botaoCep.addEventListener("click", () => {
            if (dadosCep.style.display === "none") {
                dadosCep.style.display = "block";
                botaoCep.innerHTML = "▲ Ocultar endereço";
            } else {
                dadosCep.style.display = "none";
                botaoCep.innerHTML = "▼ Ver endereço";
            }
        });

        card.addEventListener("click", function (event) {
            if (event.target.classList.contains("deletar")) {
                const indexDeletar = event.target.dataset.index;
                listaClientes.splice(indexDeletar, 1);
                localStorage.setItem("clientes", JSON.stringify(listaClientes));
                location.reload();
            }

            if (event.target.classList.contains("editar")) {
                const indexEditar = event.target.dataset.index;
                localStorage.setItem("clienteEditar", indexEditar);
                window.location.href = "editar.html";
            }
        });

        listaContainer.appendChild(card);
    });
}

if (document.getElementById("form-editar")) {
    const formEditar = document.getElementById("form-editar");
    let listaClientes = JSON.parse(localStorage.getItem('clientes')) || [];
    const indexEditar = localStorage.getItem("clienteEditar");

    const nomeInput = document.getElementById("editar-nome");
    const emailInput = document.getElementById("editar-email");
    const telefoneInput = document.getElementById("editar-telefone");
    const cepInput = document.getElementById("editar-cep");

    if (indexEditar !== null && listaClientes[indexEditar]) {
        const cliente = listaClientes[indexEditar];

        nomeInput.value = cliente.nome;
        emailInput.value = cliente.email;
        telefoneInput.value = cliente.telefone;
        cepInput.value = cliente.cep || "";
    }

    cepInput.addEventListener("input", () => {
        let valor = cepInput.value.replace(/\D/g, "").slice(0, 8);
        if (valor.length > 5) valor = valor.slice(0, 5) + "-" + valor.slice(5);
        cepInput.value = valor;
    });

    telefoneInput.addEventListener("input", () => {
        let valor = telefoneInput.value.replace(/\D/g, "").slice(0, 11);
        if (valor.length > 0) valor = "(" + valor;
        if (valor.length > 3) valor = valor.slice(0, 3) + ") " + valor.slice(3);
        if (valor.length > 10) valor = valor.slice(0, 10) + "-" + valor.slice(10);
        telefoneInput.value = valor;
    });

    async function buscarCEPEditar(cep) {
        try {
            const resposta = await fetch(`https://viacep.com.br/ws/${cep}/json/`);
            const dados = await resposta.json();
            if (dados.erro) return null;
            return dados;
        } catch (error) {
            return null;
        }
    }

    formEditar.addEventListener("submit", async (e) => {
        e.preventDefault();

        const nomeDigitado = nomeInput.value.trim();
        const emailDigitado = emailInput.value.trim();
        const telefoneDigitado = telefoneInput.value.trim();
        const cepDigitado = cepInput.value.trim();

        const telefoneLimpo = telefoneDigitado.replace(/\D/g, "");
        const cepLimpo = cepDigitado.replace(/\D/g, "");

        let formularioValido = true;

        [nomeInput, emailInput, telefoneInput, cepInput].forEach(i => {
            i.classList.remove("erro", "acerto");
        });

        if (nomeDigitado === "" || nomeDigitado.split(" ").length < 2) {
            nomeInput.classList.add("erro");
            formularioValido = false;
        } else {
            nomeInput.classList.add("acerto");
        }

        if (emailDigitado === "" || !emailDigitado.includes("@")) {
            emailInput.classList.add("erro");
            formularioValido = false;
        } else {
            emailInput.classList.add("acerto");
        }

        if (telefoneLimpo.length !== 11) {
            telefoneInput.classList.add("erro");
            formularioValido = false;
        } else {
            telefoneInput.classList.add("acerto");
        }

        if (cepLimpo.length !== 8) {
            cepInput.classList.add("erro");
            formularioValido = false;
        }

        if (!formularioValido) return;

        const endereco = await buscarCEPEditar(cepLimpo);

        if (!endereco) {
            cepInput.classList.remove("acerto");
            cepInput.classList.add("erro");
            return; 
        } else {
            cepInput.classList.add("acerto");
        }

        const telefoneFormatated = `(${telefoneLimpo.slice(0, 2)}) ${telefoneLimpo.slice(2, 7)}-${telefoneLimpo.slice(7)}`;

        const emailJaExiste = listaClientes.some((cliente, idx) =>
        idx !== parseInt(indexEditar) &&
        cliente.email === emailDigitado
        );

        const telefoneJaExiste = listaClientes.some((cliente, idx) =>
            idx !== parseInt(indexEditar) &&
            cliente.telefone === telefoneFormatated
        );

        if (emailJaExiste) {
            emailInput.classList.remove("acerto");
            emailInput.classList.add("erro");
        }

        if (telefoneJaExiste) {
            telefoneInput.classList.remove("acerto");
            telefoneInput.classList.add("erro");
        }

        if (emailJaExiste || telefoneJaExiste) {
            return;
        }

        listaClientes[indexEditar] = {
            nome: nomeDigitado,
            email: emailDigitado,
            telefone: telefoneFormatated,
            cep: cepDigitado,
            rua: endereco.logradouro || "",
            bairro: endereco.bairro || "",
            cidade: endereco.localidade || "",
            estado: endereco.uf || "",
            ddd: endereco.ddd || ""
        };

        localStorage.setItem("clientes", JSON.stringify(listaClientes));
        window.location.href = "lista.html"; 
    });
}