var cep = document.querySelector("#cep");

var fetch = fetch("https://viacep.com.br/ws/01001000/json/");

fetch.then((res) => { return res.json(); })
.then((data) => {
    data.forEach(cep => {
        
    });
});

    let endereco = document.querySelector("#logradouro");
    let bairro = document.querySelector("#bairro");
    let cidade = document.querySelector("#cidade");
    let estado = document.querySelector("#estado");

// cep.addEventListener("keyup", );

var dadosCadastrados = {
    "nome": document.querySelector("#nome"),
    "email": document.querySelector("#email"),
    "senha": document.querySelector("#confirmaSenha"),
    "endereco": {
        "complemento": document.querySelector("#complemento"),
        "bairro": document.querySelector("#bairro"),
        "cidade": document.querySelector("#cidade"),
        "estado": document.querySelector("#estado")
    }
}