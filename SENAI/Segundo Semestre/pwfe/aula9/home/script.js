const usuario = JSON.parse(localStorage.getItem("user"));

var nomeUsuario = document.querySelector("#nome");
var listaPost = document.querySelector("#container");
var itemPost = document.querySelector("#publicacao");

nomeUsuario.innerHTML = usuario.nome;

fetch("https://jsonplaceholder.typicode.com/posts?userId=" + usuario.id)
.then(res => { return res.json() })
.then(posts => { 
    posts.forEach(post => {
        let novoPost = itemPost.cloneNode(true);
        novoPost.classList.remove("modelo");

        novoPost.querySelector("#titulo").innerHTML = post.title;
        novoPost.querySelector("#corpinho").innerHTML = post.body;

        novoPost.querySelector("button").addEventListener("click", () => {
            window.location.href = "http://127.0.0.1:5500/comentarios/index.html?postId" + post.id;
        })

        listaPost.appendChild(novoPost);
    })
})