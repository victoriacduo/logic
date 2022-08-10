var listinha = [
	{
		"funcionario":"Sancho Cedraz",
		"cargo":{
			"nome":"Analista",
			"nivel":2
		},
		"autorizado":true
	},		
	{
		"funcionario":"Ionara Pederneiras",
		"cargo":{
			"nome":"Técnico",
			"nivel":2
		},
		"autorizado":true
	},
	{
		"funcionario":"Filipe Castanho",
		"cargo":{
			"nome":"Desenvolvedor",
			"nivel":1
		},
		"autorizado":false
	},
	{
		"funcionario":"Lívia Bicalho",
		"cargo":{
			"nome":"Analista",
			"nivel":3
		},
		"autorizado":true
	},
	{
		"funcionario":"Mauro Varanda",
		"cargo":{
			"nome":"Desenvolvedor",
			"nivel":3
		},
		"autorizado":false
	},	
	{
		"funcionario":"Sandro Rosário",
		"cargo":{
			"nome":"Técnico",
			"nivel":3
		},
		"autorizado":true
	}
];

var funcionarios = document.querySelector(".modelo");

function carregar(){
    listinha.forEach(info => {
        let novoFuncionario = funcionarios.cloneNode(true);

        novoFuncionario.classList.remove("modelo");

        novoFuncionario.querySelector("#nome-funcionario").innerHTML = info.funcionario;
        novoFuncionario.querySelector("#cargo-funcionario").innerHTML = info.cargo.nome;
        novoFuncionario.querySelector("#nivel").value = info.cargo.nivel;
        novoFuncionario.querySelector("#permissao").value = info.autorizado;

        if(info.cargo.nome == "Analista" || info.cargo.nome == "Desenvolvedor" && info.cargo.nivel == 3) {
            novoFuncionario.querySelector("#permissao").value = true;
        } else {
            novoFuncionario.querySelector("#permissao").value = false;
        }

        if(info.cargo.nivel == 3) {
            novoFuncionario.querySelector("#butao").remove();
        }

        document.querySelector(".lista").appendChild(novoFuncionario);
    });
}

function removerItem(e) {
    e.parentNode.remove();
}