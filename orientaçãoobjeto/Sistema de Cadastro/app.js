if (document.querySelector(".cadastrar")) {

    let listaClientes = JSON.parse(localStorage.getItem('clientes')) || [];

    const inputs = document.querySelectorAll('.campo-resposta');

    const botaoCadastrar = document.querySelector('.cadastrar');

    const nomeInput = inputs[0];
    const emailInput = inputs[1];
    const telefoneInput = inputs[2];


    telefoneInput.addEventListener("input", () => {

        let valor = telefoneInput.value.replace(/\D/g, "");

        valor = valor.slice(0, 11);

        if (valor.length > 0) {
            valor = "(" + valor;
        }

        if (valor.length > 3) {
            valor = valor.slice(0, 3) + ") " + valor.slice(3);
        }

        if (valor.length > 10) {
            valor = valor.slice(0, 10) + "-" + valor.slice(10);
        }

        telefoneInput.value = valor;
    });


    botaoCadastrar.addEventListener('click', () => {

        nomeInput.classList.remove("erro", "acerto");
        emailInput.classList.remove("erro", "acerto");
        telefoneInput.classList.remove("erro", "acerto");

        const nomeDigitado = nomeInput.value.trim();

        const emailDigitado = emailInput.value.trim();

        const telefoneDigitado = telefoneInput.value.trim();

        const telefoneLimpo = telefoneDigitado.replace(/\D/g, "");

        let formularioValido = true;


        if (nomeDigitado === "") {

            nomeInput.classList.add("erro");

            formularioValido = false;

        } else {

            const partesDoNome = nomeDigitado.split(/\s+/);

            if (partesDoNome.length < 2) {

                nomeInput.classList.add("erro");

                formularioValido = false;

            } else {

                nomeInput.classList.add("acerto");
            }
        }


        if (emailDigitado === "") {

            emailInput.classList.add("erro");

            formularioValido = false;

        } else if (!emailDigitado.includes("@")) {

            emailInput.classList.add("erro");

            formularioValido = false;

        } else {

            emailInput.classList.add("acerto");
        }


        if (telefoneLimpo === "") {

            telefoneInput.classList.add("erro");

            formularioValido = false;

        } else if (telefoneLimpo.length !== 11) {

            telefoneInput.classList.add("erro");

            formularioValido = false;

        } else {

            telefoneInput.classList.add("acerto");
        }


        if (!formularioValido) {
            return;
        }


        const telefoneFormatado =
            `(${telefoneLimpo.slice(0,2)}) ${telefoneLimpo.slice(2,7)}-${telefoneLimpo.slice(7,11)}`;


        const usuarioJaExiste = listaClientes.some((cliente) => {

            return (

                cliente.email === emailDigitado ||

                cliente.telefone === telefoneFormatado
            );
        });


        if (usuarioJaExiste) {

            emailInput.classList.remove("acerto");
            telefoneInput.classList.remove("acerto");

            emailInput.classList.add("erro");
            telefoneInput.classList.add("erro");

            return;
        }


        const novoCliente = {

            nome: nomeDigitado,

            email: emailDigitado,

            telefone: telefoneFormatado
        };


        listaClientes.push(novoCliente);

        localStorage.setItem('clientes', JSON.stringify(listaClientes));


        nomeInput.value = "";
        emailInput.value = "";
        telefoneInput.value = "";

        nomeInput.classList.remove("acerto");
        emailInput.classList.remove("acerto");
        telefoneInput.classList.remove("acerto");
    });
}



if (document.getElementById("lista-clientes")) {

    const listaContainer = document.getElementById('lista-clientes');

    const listaClientes = JSON.parse(localStorage.getItem('clientes')) || [];


    listaClientes.forEach((cliente, index) => {

        const card = document.createElement('div');

        card.classList.add('card-cliente');


        card.innerHTML = `
            <h2>${cliente.nome}</h2>

            <p><strong>E-mail:</strong> ${cliente.email}</p>

            <p><strong>Telefone:</strong> ${cliente.telefone}</p>

            <div class="acoes">

                <button class="editar" data-index="${index}">✏</button>

                <button class="deletar" data-index="${index}">✖</button>

            </div>
        `;


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

    const clientes = JSON.parse(localStorage.getItem("clientes")) || [];

    const index = parseInt(localStorage.getItem("clienteEditar"));

    const cliente = clientes[index];


    if (!cliente) {

        window.location.href = "lista.html";
    }


    const nome = document.getElementById("nome");

    const email = document.getElementById("email");

    const telefone = document.getElementById("telefone");


    const erroNome = document.getElementById("erro-nome");

    const erroEmail = document.getElementById("erro-email");

    const erroTelefone = document.getElementById("erro-telefone");


    nome.value = cliente.nome;

    email.value = cliente.email;

    telefone.value = cliente.telefone;


    telefone.addEventListener("input", function () {

        let valor = telefone.value.replace(/\D/g, "");

        valor = valor.slice(0, 11);

        if (valor.length > 0) {
            valor = "(" + valor;
        }

        if (valor.length > 3) {
            valor = valor.slice(0, 3) + ") " + valor.slice(3);
        }

        if (valor.length > 10) {
            valor = valor.slice(0, 10) + "-" + valor.slice(10);
        }

        telefone.value = valor;
    });


    document.getElementById("form-editar")
    .addEventListener("submit", function (event) {

        event.preventDefault();


        nome.classList.remove("erro", "acerto");
        email.classList.remove("erro", "acerto");
        telefone.classList.remove("erro", "acerto");


        erroNome.textContent = "";
        erroEmail.textContent = "";
        erroTelefone.textContent = "";


        const nomeDigitado = nome.value.trim();

        const emailDigitado = email.value.trim();

        const telefoneDigitado = telefone.value.trim();

        const telefoneLimpo = telefoneDigitado.replace(/\D/g, "");


        let formularioValido = true;


        if (nomeDigitado === "") {

            nome.classList.add("erro");

            erroNome.textContent = "⚠ Preencha o nome.";

            formularioValido = false;

        } else {

            const partesDoNome = nomeDigitado.split(/\s+/);

            if (partesDoNome.length < 2) {

                nome.classList.add("erro");

                erroNome.textContent = "⚠ Digite nome e sobrenome.";

                formularioValido = false;

            } else {

                nome.classList.add("acerto");
            }
        }


        if (emailDigitado === "") {

            email.classList.add("erro");

            erroEmail.textContent = "⚠ Preencha o e-mail.";

            formularioValido = false;

        } else if (!emailDigitado.includes("@")) {

            email.classList.add("erro");

            erroEmail.textContent = "⚠ O e-mail precisa ter '@'.";

            formularioValido = false;

        } else {

            email.classList.add("acerto");
        }


        if (telefoneLimpo === "") {

            telefone.classList.add("erro");

            erroTelefone.textContent = "⚠ Preencha o telefone.";

            formularioValido = false;

        } else if (telefoneLimpo.length !== 11) {

            telefone.classList.add("erro");

            erroTelefone.textContent = "⚠ O telefone precisa ter 11 números.";

            formularioValido = false;

        } else {

            telefone.classList.add("acerto");
        }


        if (!formularioValido) {
            return;
        }


        const telefoneFormatado =
            `(${telefoneLimpo.slice(0,2)}) ${telefoneLimpo.slice(2,7)}-${telefoneLimpo.slice(7,11)}`;


        const usuarioJaExiste = clientes.some((clienteAtual, clienteIndex) => {

            return (

                clienteIndex !== index &&

                (
                    clienteAtual.email === emailDigitado ||

                    clienteAtual.telefone === telefoneFormatado
                )
            );
        });


        if (usuarioJaExiste) {

            email.classList.remove("acerto");
            telefone.classList.remove("acerto");

            email.classList.add("erro");
            telefone.classList.add("erro");

            erroEmail.textContent = "⚠ Este e-mail já está cadastrado.";

            erroTelefone.textContent = "⚠ Este telefone já está cadastrado.";

            return;
        }


        clientes[index] = {

            nome: nomeDigitado,

            email: emailDigitado,

            telefone: telefoneFormatado
        };


        localStorage.setItem("clientes", JSON.stringify(clientes));

        localStorage.removeItem("clienteEditar");

        window.location.href = "lista.html";
    });
}