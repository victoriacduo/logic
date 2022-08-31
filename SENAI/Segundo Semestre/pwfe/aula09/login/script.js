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
                
                let infoUser = {
                    "id": user.id,
                    "nome": user.name
                }

                localStorage.setItem("user", JSON.stringify(infoUser));
                window.location = "../home/index.html";
            }
        });

        if(logado == false){
            alert("Dados incorretos");
        }
    });
}