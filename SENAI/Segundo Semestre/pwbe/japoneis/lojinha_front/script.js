const modalModal = document.querySelector(".modal");

const inputDescricao = document.querySelector("#descricaoCadastro");
const inputTipo = document.querySelector("#tipoSelect");
const inputValor = document.querySelector("#valorCadastro");
const datinha = new Date().toISOString().slice(0, 10);

const datasLa = document.querySelector("#datas");

var selecionarDatas = [];

function linhas() {
    fetch('http://localhost:5000/lojinha/produtos')
    .then(res => { return res.json() })
    .then(data => {
        selecionarDatas[0] = data[0].dia.slice(0,10);
        let i = 1;
        data.forEach((linha) => {

            if(linha.tipo == "D") {
                let novaLinha = document.querySelector(".asLinhas").cloneNode(true);
                novaLinha.classList.remove("modelo");

                novaLinha.querySelector("#id").innerHTML = linha.id_produto;
                novaLinha.querySelector("#data").innerHTML = linha.dia.slice(0,10);
                novaLinha.querySelector("#descricao").innerHTML = linha.descricao;
                novaLinha.querySelector("#valor").innerHTML = linha.valor;
                novaLinha.querySelector("#tipo").innerHTML = linha.tipo;

                document.querySelector("#tabelaDebito").appendChild(novaLinha);
            } else {
                let novaLinha = document.querySelector(".asLinhas").cloneNode(true);
                novaLinha.classList.remove("modelo");

                novaLinha.querySelector("#id").innerHTML = linha.id_produto;
                novaLinha.querySelector("#data").innerHTML = linha.dia.slice(0,10);
                novaLinha.querySelector("#descricao").innerHTML = linha.descricao;
                novaLinha.querySelector("#valor").innerHTML = linha.valor;
                novaLinha.querySelector("#tipo").innerHTML = linha.tipo;

                document.querySelector("#tabelaCredito").appendChild(novaLinha);
            }

            if(linha.dia.slice(0,10) != selecionarDatas[i-1]){
                selecionarDatas[i] = linha.dia.slice(0,10);
                i++;
            }
        });
    });
}

function fecharModalCadastro(){
    modalModal.classList.add("model");
}

function abrirModalCadastro() {
    modalModal.classList.remove("model");
}

function cadastrarProdutos() {
    let produto = {
        "dia": datinha,
        "descricao": inputDescricao.value,
        "valor": inputValor.value,
        "tipo": inputTipo.value,
    };
    console.log(inputTipo.value);

    fetch('http://localhost:5000/lojinha/produtos', {
        "method":"POST",
        "headers": {
            "Content-Type": "application/json"
        },
        "body": JSON.stringify(produto)
    })
    .then(res => {return res.json()})
    .then(resp => {
        if(resp !== undefined){
            alert("Venda Cadastrada Com Sucesso !");
            window.location.reload();
        }else {
            alert("Falha ao cadastrar venda");
        }
     })
}

function opcoes() {
    selecionarDatas.forEach((outraData) => {
        let nOpcao = document.querySelector("#selected-data").cloneNode();
        
        nOpcao.innerHTML = outraData;
        document.querySelector("#datas").appendChild(nOpcao);
    });
}

function mudar() {
    let tableCredito = document.querySelector("#tabelaCredito").querySelectorAll('tr');
    let tableDebito = document.querySelector("#tabelaDebito").querySelectorAll('tr');

    for(let i = tableCredito.length; i > 2; i-- ){
        document.querySelector("#tabelaCredito").deleteRow(i-1)
    }
    for(let i = tableDebito.length; i > 2; i--){
        document.querySelector("#tabelaDebito").deleteRow(i-1)
    }

    filtrarr();
}

function filtrarr(){
    fetch(`http://localhost:5000/lojinha/produtos/${datasLa.value}`)
    .then(res => {return res.json()})
    .then(resposta => {
        resposta.forEach((linha) => {

            if(linha.tipo == "D") {
                let novaLinha = document.querySelector(".asLinhas").cloneNode(true);
                novaLinha.classList.remove("modelo");

                novaLinha.querySelector("#id").innerHTML = linha.id_produto;
                novaLinha.querySelector("#data").innerHTML = linha.dia.slice(0,10);
                novaLinha.querySelector("#descricao").innerHTML = linha.descricao;
                novaLinha.querySelector("#valor").innerHTML = linha.valor;
                novaLinha.querySelector("#tipo").innerHTML = linha.tipo;

                document.querySelector("#tabelaDebito").appendChild(novaLinha);
            } else {
                let novaLinha = document.querySelector(".asLinhas").cloneNode(true);
                novaLinha.classList.remove("modelo");

                novaLinha.querySelector("#id").innerHTML = linha.id_produto;
                novaLinha.querySelector("#data").innerHTML = linha.dia.slice(0,10);
                novaLinha.querySelector("#descricao").innerHTML = linha.descricao;
                novaLinha.querySelector("#valor").innerHTML = linha.valor;
                novaLinha.querySelector("#tipo").innerHTML = linha.tipo;

                document.querySelector("#tabelaCredito").appendChild(novaLinha);
            }
        })
    })
}