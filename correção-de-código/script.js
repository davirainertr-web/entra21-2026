const formulario = document.getElementById("formLogin");
const email = document.getElementById("email");
const senha = document.getElementById("senha");
const mensagem = document.getElementById("mensagem");

formulario.addEventListener("submit", function (evento) {
    evento.preventDefault();

    mensagem.className = "";

    if (email.value === "") {
        mensagem.textContent = "O e-mail é obrigatório.";
        mensagem.classList.add("erro");

    } else if (!validarEmail(email.value)) {
        mensagem.textContent = "Digite um e-mail válido.";
        mensagem.classList.add("erro");

    } else if (senha.value.length < 6) {
        mensagem.textContent = "A senha deve ter pelo menos 6 caracteres.";
        mensagem.classList.add("erro");

    } else {
        mensagem.textContent = "Login realizado com sucesso!";
        mensagem.classList.add("sucesso");
    }
});

function validarEmail(email) {
    const padrao = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return padrao.test(email);
}