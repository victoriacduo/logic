function criarElemento(){

let itemLista = document.createElement("div");
itemLista.className = "item-lista";

let thumbnail = document.createElement("img");
thumbnail.src = "./assets/icon.png";
thumbnail.id = "thumb";
thumbnail.alt = "Foto do Restaurante";

let like = document.createElement("img");
like.src = "./assets/heartEmpty.png";
like.id = "like";
like.alt = "Favoritar";

let avaliacao = document.createElement("img");
avaliacao.src = "./assets/star.png";
avaliacao.id = "avaliacao";
avaliacao.alt = "Avaliacao";

let info = document.createElement("div");
info.id = "info";

let nomeRestaurante = document.createElement("p");
nomeRestaurante.innerHTML = "Mc Donalds 2.0";

let textoAvaliacao = document.createElement("p");

textoAvaliacao.appendChild(avaliacao);
textoAvaliacao.append("4.9");

info.appendChild(nomeRestaurante);
info.appendChild(textoAvaliacao);

itemLista.appendChild(thumbnail);
itemLista.appendChild(info);
itemLista.appendChild(like);

document.querySelector(".lista").appendChild(itemLista);

}