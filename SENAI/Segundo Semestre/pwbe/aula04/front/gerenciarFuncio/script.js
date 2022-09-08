const listaFuncio = document.querySelector("#lista-funcionarios");
const linhamodelo = document.querySelector(".linhamodelo");
const modalExcluir = document.querySelector(".excluir");
const modalEditar = document.querySelector(".editar");

const btCadedit = document.querySelector(".btnEditCad")

const inputId = document.querySelector("#id");
const inputMatricula = document.querySelector("#matricula");
const inputNome = document.querySelector("#nome");
const inputCargo = document.querySelector("#cargo");
const inputSalario = document.querySelector("#salario");
const inputCpf = document.querySelector("#cpf");

fetch("http://localhost:3000/funcionarios")
.then(res => { return res.json() })
.then(funcionarios => {
    produtos.forEach(funcionario => {
        let linha = linhamodelo.cloneNode(true);
        linha.classList.remove("model");

        let colunas = linha.querySelectorAll("td");
        colunas[0].innerHTML = funcionario.matricula;
        colunas[1].innerHTML = funcionario.nome;
        colunas[2].innerHTML = funcionario.cargo;
        colunas[3].innerHTML = "R$ " + funcionario.salario;
        colunas[4].innerHTML = ''

        let cpf = funcionario.cpf.split('');

        for (let i = 0; i < cpf.length; i++) {
            if (i%3 == 0 && i != 0) {
                if (i == 9) {
                    colunas[4].innerHTML = colunas[4].innerHTML + '-'
                } else {
                    colunas[4].innerHTML = colunas[4].innerHTML + '.'
                }
                
            }
            colunas[4].innerHTML = colunas[4].innerHTML + cpf[i]
        }

        linha.querySelector("#exclui").addEventListener("click", () => {
            modalExcluir.classList.remove("model");
            modalExcluir.querySelector("#matricula").innerHTML = funcionario.matricula;
        });

        linha.querySelector("#edita").addEventListener("click", () => {
            modalEditar.classList.remove("model");
            btCadedit.innerHTML = "Editar";
            btCadedit.onclick = () => { editarFuncio() }
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
    inputMatricula.value = "";
    inputNome.value = "";
    inputCargo.value = "";
    inputSalario.value = "";
    inputCpf.value = "";
    modalEditar.classList.remove("model");
}

function editarFuncio(){
    let funcionario = {
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
        if(resp.matricula !== undefined) {
            alert("Funcionário Alterado com Sucesso !");
            window.location.reload();
        }else {
            alert("Falha ao salvar alterações !");
        }
    })
}

function excluirFuncio() {
    let data = {
        "matricula": document.querySelector("#matricula").innerHTML
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
        if(resp !== undefined) {
            alert("Funcionário Excluido Com Sucesso!");
            window.location.reload();
        }else {
            alert("Falha ao excluir funcionário !");
        }
    });
}

function cadastrarFuncio() {
    let funcionario = {
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
        if(resp.matricula !== undefined){
            alert("Funcionário Cadastrado Com Sucesso !");
            window.location.reload();
        }else {
            alert("Falha ao cadastrar funcionário");
        }
     })
}