function linhas(){
    fetch('http://localhost:3000/duplicatas/clientes')
    .then(res => { return res.json() })
    .then(data => {
        data.forEach((linha) => {
            let novaLinha = document.querySelector(".asLinhas").cloneNode(true);
            novaLinha.classList.remove("modelo");

            novaLinha.querySelector("#cod_cli").innerHTML = linha.cod_cli;
            novaLinha.querySelector("#nome").innerHTML = linha.nome;
            novaLinha.querySelector("#endereco").innerHTML = linha.endereco;
            novaLinha.querySelector("#bairro").innerHTML = linha.bairro;
            novaLinha.querySelector("#cidade").innerHTML = linha.cidade;
            novaLinha.querySelector("#uf").innerHTML = linha.uf;
            novaLinha.querySelector("#imagemTel").src = "https://cdn-icons-png.flaticon.com/512/725/725624.png";

            document.querySelector("tbody").appendChild(novaLinha);
        });
    });
}

function telefones(el){
    let linhasCriadas = document.getElementsByClassName("menines")

    while (linhasCriadas[0]) {
        linhasCriadas[0].parentNode.removeChild(linhasCriadas[0])
    }

    fetch('http://localhost:3000/duplicatas/clientes')
    .then(res => { return res.json() })
    .then(data => {
        data.forEach((linha) => {
            if (el.parentNode.parentNode.querySelector("#cod_cli").innerHTML == linha.cod_cli) {
                linha.telefones.forEach(tel => {
                    
                    let novaLinha = document.getElementById("corpinhoTel").cloneNode(true);
                    novaLinha.classList.remove("modelo");
                    
                    novaLinha.querySelector("#tipo").innerHTML = tel.tipo;
                    novaLinha.querySelector("#numero").innerHTML = tel.numero;
                    novaLinha.classList.add("menines")

                    document.querySelector(".segundoTbody").appendChild(novaLinha);
                });
            }    
        })
    })
    showModal()
}

function showModal(){
    let modal = document.querySelector(".modal");
    modal.classList.toggle("modelo");
}