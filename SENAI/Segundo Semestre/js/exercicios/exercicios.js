// 1 - validar placas

function validarPlaca(){

    var placa = document.getElementById("placa");
    var placaRes = document.getElementById("placaRes");
    var resposta = "placa inválida";

    const modelo1 = /^[a-zA-Z]{3}[0-9]{4}$/;
    const modelo2 = /^[a-zA-Z]{3}[0-9]{1}[a-zA-Z]{1}[0-9]{2}$/;

    if(modelo1.test(placa.value)){
        resposta = "Placa válida no modelo antigo";
    } if(modelo2.test(placa.value)){
        resposta = "Placa válida no modelo novo";
    }
    placaRes.value = resposta;
}

// 2 - validar cpf

function validaCPF() {

}

// 3 - telefones aleatorios()

function geraTelefones(){

      var numero = document.getElementById("numero");
      var telefoneRes = document.getElementById("telefones");

      for(let i = 0; i < parseInt(numero.value); i++){
            var gerador1 = ("" + Math.floor(Math.random() * 9999)).padStart(4,0);
            var gerador2 = ("" + Math.floor(Math.random() * 9999)).padStart(4,0);

            telefoneRes.value += `(19)9${gerador1}-${gerador2}\n`
      }

}

function gerarCPF(){

      const cpf1 = document.getElementById("cpfs");
      const cpf2 = document.getElementById("cpf");

      for(let i = 0; i < parseInt(cpf2.value); i++){
            cpf1.value += `${CPFgera()}\n`;
      }
}

function CPFgera(){
      const num1 = ("" + Math.floor(Math.random() * 999)).padStart(3,0);
      const num2 = ("" + Math.floor(Math.random() * 999)).padStart(3,0);
      const num3 = ("" + Math.floor(Math.random() * 999)).padStart(3,0);
      const dig1 = dig(num1, num2, num3);
      const dig2 = dig(num1, num2, num3, dig1);
      return `${num1}.${num2}.${num3}.${dig1}.${dig2}.`
}

function dig(n1, n2, n3, n4){
      const nums = n1.split("").concat(n2.split(""), n3.split(""));
      if(n4 !== undefined){
            nums[9] = n4;
      }

      let x = 0;
      for(let i = (n4 !== undefined ? 11 : 10), j = 0; i >= 2; i--, j++){
            x += parseInt(nums[j]) * i;
      }

      const y = x % 11;
      return y < 2 ? 0 : 11 - y;
}