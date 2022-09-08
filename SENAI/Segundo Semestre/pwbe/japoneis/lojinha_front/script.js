

const inputDescricao = document.querySelector("#descricao");
const inputTipo = document.querySelector("#tipo");
const inputValor = document.querySelector("#valor");


function linhas() {
    fetch('http://localhost:5000/lojinha/produtos')
    .then(res => { return res.json() })
    .then(data => {
        data.forEach((linha) => {

            if(linha.tipo == "D") {
                console.log("ok")
                let novaLinha = document.querySelector(".asLinhas").cloneNode(true);
                novaLinha.classList.remove("modelo");

                novaLinha.querySelector("#id").innerHTML = linha.id_produto;
                novaLinha.querySelector("#data").innerHTML = linha.dia;
                novaLinha.querySelector("#descricao").innerHTML = linha.descricao;
                novaLinha.querySelector("#valor").innerHTML = linha.valor;
                novaLinha.querySelector("#tipo").innerHTML = linha.tipo;

                document.querySelector("#tabelaDebito").appendChild(novaLinha);
            } else {
                let novaLinha = document.querySelector(".asLinhas").cloneNode(true);
                novaLinha.classList.remove("modelo");

                novaLinha.querySelector("#id").innerHTML = linha.id_produto;
                novaLinha.querySelector("#data").innerHTML = linha.dia;
                novaLinha.querySelector("#descricao").innerHTML = linha.descricao;
                novaLinha.querySelector("#valor").innerHTML = linha.valor;
                novaLinha.querySelector("#tipo").innerHTML = linha.tipo;

                document.querySelector("#tabelaCredito").appendChild(novaLinha);
                
            }
        })
    })
}

function fecharModalCadastro(){

}

function abrirModalCadastro() {

}

function cadastrarProdutos(){
    let produto = {
        "descricao": inputDescricao.value,
        "tipo": inputTipo.value,
        "valor": inputValor.value,
    };

    fetch("http://localhost:5000/produtos", {
        "method":"POST",
        "headers": {
            "Content-Type": "application/json"
        },
        "body": JSON.stringify(produto)
    })
    .then(res => {return res.json()})
    .then(resp => {
        if(resp.descricao !== undefined){
            alert("Venda Cadastrada Com Sucesso !");
            window.location.reload();
        }else {
            alert("Falha ao cadastrar venda");
        }
     })
}