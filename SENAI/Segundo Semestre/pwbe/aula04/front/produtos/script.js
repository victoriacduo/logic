const produtos = document.querySelector(".produtos");
const produto = document.querySelector(".produto");
const modal = document.querySelector(".modal");

fetch("http://localhost:3000/produtos")
.then(resp => {return resp.json()})
.then(produtos => {
    produtos.forEach(produto => {
        duplicarProduto(produto);
    })
})

function duplicarProduto(info){
    let nProd = produto.cloneNode(true);

    nProd.classList.remove("model");

    nProd.querySelector("#nome").innerHTML = info.nome;
    nProd.querySelector("#preco").innerHTML = "R$ " + info.preco;

    produtos.appendChild(nProd);
}

function cadastrar(){
    let cod = document.querySelector("#cod").value;
    let nome = document.querySelector("#nnome").value;
    let qntd = document.querySelector("#qntd").value;
    let preco = document.querySelector("#ppreco").value;

    let data = JSON.stringify({
        "cod": cod,
        "nome": nome,
        "quantidade": qntd,
        "preco": preco
    });

    fetch("http://localhost:3000/produtos", {
        "method": "POST",
        "headers": {
            "Content-Type": "application/json"
        },
        "body": data
    })
    .then(res => {return res.json()})
    .then(data => { 
        duplicarProduto(data);
        showModal();
     });
}

function showModal(){
    modal.classList.toggle("model");
}