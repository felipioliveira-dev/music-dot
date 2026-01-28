document.getElementById("formContato").addEventListener("submit", function (evento) {

    evento.preventDefault(); // impede o envio do formulário

    var nome = document.getElementById("nome").value;
    var telefone = document.getElementById("telefone").value;
    var email = document.getElementById("email").value;
    var opiniao = document.getElementById("opiniao").value;

    // Validação do nome
    if (nome == "" || nome.length < 10) {
        alert("O nome deve ter no mínimo 10 caracteres.");
        return;
    }

    // Validação do telefone
    if (telefone == "" || telefone.length != 10) {
        alert("O telefone deve ter exatamente 10 caracteres.");
        return;
    }

    // Validação do e-mail
    if (email == "") {
        alert("O e-mail não pode estar vazio.");
        return;
    }

    if (email.indexOf("@") == -1 || email.indexOf(".") == -1) {
        alert("Digite um e-mail válido.");
        return;
    }

    // Validação da opinião
    if (opiniao == "" || opiniao.length < 10 || opiniao.length > 50) {
        alert("A opinião deve ter entre 10 e 50 caracteres.");
        return;
    }

    // Se tudo estiver correto
    alert("Formulário enviado com sucesso!");
    document.getElementById("formContato").submit();
});
