var respFetch = fetch("https://jsonplaceholder.typicode.com/todos");
var card = document.querySelector(".card");

respFetch.then((response) => {
return response.json();
})
.then((data) => {
    data.forEach(cliente => {

        let novoCard = card.cloneNode(true);
        novoCard.classList.remove("modelo");

        novoCard.querySelector("#h1").innerHTML = cliente.userId;
        novoCard.querySelector("#p").innerHTML = cliente.title;
        novoCard.querySelector("#check").checked = cliente.completed;

        document.querySelector(".container").appendChild(novoCard);

        if(cliente.completed == true){
            check.checked = true;
        } else {
            check.checked = false;
        }
    });
});