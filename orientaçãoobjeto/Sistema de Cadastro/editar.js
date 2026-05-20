const clientes = JSON.parse(localStorage.getItem("clientes")) || [];

const index = localStorage.getItem("clienteEditar");

const cliente = clientes[index];

const nome = document.getElementById("nome");
const email = document.getElementById("email");
const telefone = document.getElementById("telefone");

nome.value = cliente.nome;
email.value = cliente.email;
telefone.value = cliente.telefone;

document.getElementById("form-editar")
.addEventListener("submit", function (event) {

    event.preventDefault();

    clientes[index] = {
        nome: nome.value,
        email: email.value,
        telefone: telefone.value
    };

    localStorage.setItem("clientes", JSON.stringify(clientes));

    localStorage.removeItem("clienteEditar");

    window.location.href = "lista.html";
});