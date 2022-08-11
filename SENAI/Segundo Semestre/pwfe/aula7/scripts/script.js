var clientes = [
    {
        "nome":"Paty Kerry",
        "imagem":"https://i.pinimg.com/280x280_RS/62/ba/7a/62ba7ab7139c63a571703937ae5a211b.jpg",
        "login":{
            "user":"patypatricia",
            "senha":"12345"
        }
    },
    {
        "nome":"Key Mary",
        "imagem":"https://business.ucf.edu/wp-content/uploads/sites/4/2021/06/Mary-Key_300.jpg",
        "login":{
            "user":"mariakelly",
            "senha":"qazwsx"
        }
    },
    {
        "nome":"Jonas Irmão",
        "imagem":"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTAdTp7f3FDMTu0Ek0PvJzcLkfZt9U_BODd7yOVMfLFURjRs2Jx9qOiBi7f5xv_a_H_K7c&usqp=CAU",
        "login":{
            "user":"jonasjonas",
            "senha":"qwerty"
        }
    }
];

function direcionar() {
    var usuario = document.querySelector("#usuario").value.toLowerCase();
    var senha = document.querySelector("#senha").value;

    for(var u in clientes){
        var us = clientes[u];

        if(us.login.user === usuario && us.login.senha === senha){
            let array = [us.nome, us.imagem];
            localStorage.setItem("user", JSON.stringify(array));
            // setar um item no localstorage ("nome da variavel q vai pra la", pegando um objeto json e transformando numa string(dados do json))
            // localstorage espaço locado na memoria do navegador fontes: mionha mente
            window.location = "pages/home.html";
            
            return true;
        }
    }
    alert("Dados incorretos");
    return false;
}