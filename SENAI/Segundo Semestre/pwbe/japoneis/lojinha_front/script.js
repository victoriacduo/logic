function linhas() {
    fetch('http://localhost:5000/lojinha/produtos')
    .then(res => { return res.json() })
    .then(data => {
        data.forEach((linha) => {
            let novaLinha = document.querySelector(".asLinhas").cloneNode(true);
            novaLinha.classList.remove("modelo");

            novaLinha.querySelector("#id").innerHTML = linha.id_produto;
            novaLinha.querySelector("#data").innerHTML = linha.dia;
            novaLinha.querySelector("#descricao").innerHTML = linha.descricao;
            novaLinha.querySelector("#valor").innerHTML = linha.valor;
            novaLinha.querySelector("#tipo").innerHTML = linha.tipo;

            document.querySelector("tbody").appendChild(novaLinha);
        })
    })
}