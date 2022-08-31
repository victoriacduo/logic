var alunoNovo = document.querySelector(".card");

function alunos(){
    fetch('http://localhost:5000/academia/alunos')
    .then(res => {return res.json()})
    .then(data => {
        data.forEach((alunos) => {
            let novoAluno = alunoNovo.cloneNode(true);

            novoAluno.classList.remove("modelo");

            novoAluno.querySelector("#nome").innerHTML = alunos.nome;
            novoAluno.querySelector("#id").innerHTML = alunos.id_aluno;
            let data = new Date(alunos.nascimento);
            novoAluno.querySelector("#nascimento").innerHTML = `${data.getDay()}/${data.getMonth()}/${data.getFullYear()}`;
            novoAluno.querySelector("#sexo").innerHTML = alunos.sexo;
            novoAluno.querySelector("#peso").innerHTML = alunos.peso;

            document.querySelector(".cardzinho").appendChild(novoAluno);
        });
    });
}