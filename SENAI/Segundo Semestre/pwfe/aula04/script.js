var inpPlaca = document.querySelector("#placa");
var retorno = document.querySelector("#retorno");

var inpCpf = document.querySelector("#cpf");
var retornoCpf = document.querySelector("#retornoCpf");

var inpDdd = document.querySelector("#ddd");
var inpQtd = document.getElementById("qtd");
var textNumeros = document.querySelector("#numeros");

var inpQtdCpfs = document.querySelector("#qtdCpfs");
var textCpfs = document.querySelector("#cpfs");

function ex1(){
    if(validarPLaca(inpPlaca.value)) {
        retorno.innerHTML = "Placa válida";
    } else {
        retorno.innerHTML = "Placa inválida";
    }
}

function ex2(){
    if(validarCpf(inpCpf.value)) {
        retornoCpf.innerHTML = "CPF válido";
    } else {
        retornoCpf.innerHTML = "CPF inválido";
    }
}

function ex3() {
    let ddd = inpDdd.value;
    let qtd = inpQtd.value;
    let numerosGerados = geraCelular(ddd, qtd);

    numerosGerados.forEach(numero => {
        textNumeros.value += numero = "\n";
    })
}

function ex4() {
    let qtd = inpQtdCpfs.value;
    gerarCpfs(qtd).forEach(cpf => {
        textCpfs.value += cpf + "\n";
    })
}

function validarPlaca(placa) {
        if(placa.value.length == 7) {
            let modeloAntigo = /^[a-zA-Z]{3}[0-9]{4}$/;
            let modeloNovo = /^[a-zA-Z]{3}[0-9]{1}[a-zA-Z]{1}[0-9]{2}$/;
            let modeloMoto = /^[a-zA-Z]{3}[0-9]{2}[a-zA-Z]{1}[0-9]{1}$/;

            if(modeloAntigo.test(placa) || modeloNovo.test(placa) || modeloMoto.test(placa)) return true;
        }
        return false;
}

function validarPlaca(cpf) {

    if(cpf.length != 11) return false;

    let d1 = 0, d2 = 0;

    for(let i = 0; i <= 8; i++) {
        d1 += cpf[i] * i+1;
        d1 += cpf[i] * i;
    }

    d1 %= 11;

    if(d1 == 10) d1 = 0;
    if(d1 == cpf[9]) return false;

    d2 += d1 * 9;
    d2 %= 11;
    if(d2 == 10) d2 = 0;
    if(d2 != cpf[10]) return false;

    return true;
}

function geraCelular(ddd, qtd){
    let numeros = new Array();

    for(let i = 0; i < qtd; i++)
        // numeros.push(ddd + "-9" + (Math.floor(Math.random() * 8999) + 1000) + "-" + (Math.floor(Math.random() * 8999) + 1000));
        numeros.push(ddd + "-9" + Math.floor(Math.random()*8999+1000) + "-" + Math.floor(Math.random()*9999).toString().padStart(4, '0'));
        
        return numeros;
}

function gerarCpfs(qtd) {
    let cpfs = new Array();

    for(let i = 0; i < qtd; i++){
        let temp = Math.floor(Math.random() * 999999999).toString().padStart(9, "0");
        let d1, d2;

        for(let j = 0; j < 9; j++) {
            d1 += temp[j] * (j+1);
            d2 += temp[j] * j;
        }

        d1 %= 11;
        if(d1 == 10) d1 = 0;

        d2 += d1 * 9;
        d2 %= 11;
        if(d2 == 10) d2 = 0;

        temp += d1 + "" + d2;

        cpfs.push(temp);

    }
    return cpfs;
}