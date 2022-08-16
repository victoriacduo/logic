var loginSenha = fetch("https://jsonplaceholder.typicode.com/users");
var logado = false;

function direcionar(){
    loginSenha.then((resposta) => {
        return resposta.json();
    })
    .then((retorno) => {
        retorno.forEach(user => {
            
            let email = document.querySelector("#email").value.toLowerCase();
            let senha = document.querySelector("#senha").value;

            if(user.email.toLowerCase() === email && user.username === senha){
                logado = true;
                localStorage.setItem("user", JSON.stringify(user.name));
                window.location = "pages/home.html";
            }
        });

        if(logado == false){
            alert("Dados incorretos");
        }
    });
}