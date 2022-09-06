const listaFuncio = document.querySelector("#lista-funcionarios");
const linhamodelo = document.querySelector(".linhamodelo");
const modalExcluir = document.querySelector(".excluir");
const modalEditar = document.querySelector(".editar");

const inputId = document.querySelector("#id");
const inputMatricula = document.querySelector("#matricula");
const inputNome = document.querySelector("#nome");
const inputCargo = document.querySelector("#cargo");
const inputSalario = document.querySelector("#salario");
const inputCpf = document.querySelector("#cpf");

fetch("http://localhost:3000/funcionarios")
.then(res => { return res.json() })
.then(produtos => {
    produtos.forEach(produto => {
        let linha = linhamodelo.cloneNode(true);
        linha.classList.remove("model");

        let colunas = linha.querySelectorAll("td");
        colunas[0].innerHTML = funcionario.id;
        colunas[1].innerHTML = funcionario.matricula;
        colunas[2].innerHTML = funcionario.nome;
        colunas[3].innerHTML = funcionario.cargo;
        colunas[4].innerHTML = "R$ " + funcionario.salario;
        colunas[5].innerHTML = funcionario.cpf;

        linha.querySelector("exclui").addEventListener("click", () => {
            modalExcluir.classList.remove("model");
            modalExcluir.querySelector("#id").innerHTML = funcionario.id;
        })

        linha.querySelector("#edita").addEventListener("click", () => {
            modalEditar.classList.remove("model");
            btCadedit.innerHTML = ("Editar");
            btCadedit.onclick = () => { editarFuncio() }
            inputId.value = funcionario.id;
            inputMatricula.value = funcionario.matricula;
            inputNome.value = funcionario.nome;
            inputCargo.value = funcionario.cargo;
            inputSalario.value = funcionario.salario;
            inputCpf.value = funcionario.cpf;
        });

        listaFuncio.appendChild(linha);
    });
});

function fecharModalExcluir(){
    modalExcluir.classList.add("model");
}

function fecharModalEditar(){
    modalEditar.classList.add("model");
}

function abrirModalCadastro(){
    btCadedit.innerHTML = "Cadastrar";
    btCadedit.onclick = () => { cadastrarFuncio(); }
    inputId.value = funcionario.id;
    inputMatricula.value = "";
    inputNome.value = "";
    inputCargo.value = "";
    inputSalario.value = "";
    inputCpf.value = "";
    modalEditar.classList.remove("model");
}

function editarFuncio(){
    let funcionario = {
        "id": inputId.value,
        "matricula": inputMatricula.value,
        "nome": inputNome.value,
        "cargo": inputCargo.value,
        "salario": inputSalario.value,
        "cpf": inputCpf.value,
    }

    fetch("http://localhost:3000/funcionario", {
        "method":"PUT",
        "headers": {
            "Content-Type":"application/json"
        },
        "body":JSON.stringify(funcionario)
    })
    .then(res => { return res.json() })
    .then(resp => {
        if(resp.cod !== undefined) {
            alert("Funcionário Alterado com Sucesso !");
            window.location.reload();
        }else {
            alert("Falha ao salvar alterações !");
        }
    })
}

function excluirFuncio() {
    let data = {
        "id":document.querySelector("#id").innerHTML
    }

    fetch("http://localhost:3000/funcionario", {
        "method":"DELETE",
        "headers":{
            "Content-Type": "application/json"
        },
        "body":JSON.stringify(data)
    })
    .then(res => { return res.json() })
    .then(resp => {
        if(resp.id !== undefined) {
            alert("Funcionário Excluido Com Sucesso!");
            window.location.reload();
        }else {
            alert("Falha ao excluir funcionário !");
        }
    });
}

function cadastrarFuncio() {
    let funcionario = {
        "id": inputId.value,
        "matricula": inputMatricula.value,
        "nome": inputNome.value,
        "cargo": inputCargo.value,
        "salario": inputSalario.value,
        "cpf": inputCpf.value,
    };

    fetch("http://localhost:3000/produtos", {
        "method":"POST",
        "headers": {
            "Content-Type": "application/json"
        },
        "body": JSON.stringify(funcionario)
    })
    .then(res => {return res.json()})
    .then(resp => {
        if(resp.id !== undefined){
            alert("Funcionário Cadastrado Com Sucesso !");
            window.location.reload();
        }else {
            alert("Falha ao cadastrar funcionário");
        }
     })
}