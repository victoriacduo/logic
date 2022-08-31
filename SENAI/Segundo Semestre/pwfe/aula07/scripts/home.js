var produtos = [
    {
        "img": "https://github.com/victoriacduo/logic/blob/main/SENAI/Primeiro%20Semestre/LIMA/aula7/loja/img/azul1.png?raw=true",
        "nome": "Aquarela Sakura Azul",
        "valor": 30
    },
    {
        "img": "https://github.com/victoriacduo/logic/blob/main/SENAI/Primeiro%20Semestre/LIMA/aula7/loja/img/margarida.png?raw=true",
        "nome": "Aquarela Margarida",
        "valor": 20
    },
    {
        "img": "https://github.com/victoriacduo/logic/blob/main/SENAI/Primeiro%20Semestre/LIMA/aula7/loja/img/rose.png?raw=true",
        "nome": "Aquarela Sino Rose",
        "valor": 30
    },
    {
        "img": "https://github.com/victoriacduo/logic/blob/main/SENAI/Primeiro%20Semestre/LIMA/aula7/loja/img/tulipa.png?raw=true",
        "nome": "Aquarela Tulipas",
        "valor": 28
    }
];

var item = document.querySelector("#bloco");

function produtinhos() {
    produtos.forEach(cada => {
        let novo = item.cloneNode(true);

        novo.classList.remode("modelo");

        novo.querySelector("#img-produto").src = cada.img;
        novo.querySelector("#nome").innerHTML = cada.nome;
        novo.querySelector("#valor").value = cada.valor;

        document.querySelector("#container").appendChild(novo);
    })
}

function informacoes(){
    let usuario = JSON.parse(localStorage.getItem("user"));
    // json.pasrrese pega string em formato de array e transforma em json (pegando a variavel no localstorage "variavel q vc vai pegar")
    document.querySelector("#nome-user").innerHTML = usuario[0];
    document.querySelector("#img-user").src = usuario[1];
}