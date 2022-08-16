var posts = fetch("https://jsonplaceholder.typicode.com/posts");
var publicacao = document.querySelector(".publicacao");

posts.then((resposta) => {
    return resposta.json();
})
.then((data) => {
    data.forEach((postagem => {
        let novaPubli = publicacao.cloneNode(true);
        novaPubli.classList.remove("modelo");

        novaPubli.querySelector("#titulo").innerHTML = postagem.title;
        novaPubli.querySelector("#corpinho").innerHTML = postagem.body;

        document.querySelector(".container").appendChild(novaPubli);
    }));
});

function informacoes(){
    let nomeUsuario = JSON.parse(localStorage.getItem("user"));
    document.querySelector("#teste").innerHTML = nomeUsuario;
}