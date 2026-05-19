const corpoTabela = document.getElementById('corpo-tabela');

const listaClientes = JSON.parse(localStorage.getItem('clientes')) || [];

listaClientes.forEach((cliente) => {

    const linha = document.createElement('tr');

    linha.innerHTML = `
        <td>${cliente.nome}</td>
        <td>${cliente.email}</td>
        <td>${cliente.telefone}</td>
    `;

    corpoTabela.appendChild(linha);

});