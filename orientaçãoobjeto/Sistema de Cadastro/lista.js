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

    if (listaContainer) {
        listaContainer.appendChild(card);
    }
});