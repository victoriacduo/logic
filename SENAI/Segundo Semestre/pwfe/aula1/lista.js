let a = prompt("Digite o valor do 1º lado do triângulo");
let b = prompt("Digite o valor do 2º lado do triângulo");
let c = prompt("Digite o valor do 3º lado de triângulo");

if(a == b && b == c){
    alert('Triângulo Equilátro');
} else if(a == b && b != c || a != b && b == c || a != b && a == c){
    alert('Triângulo Isósceles');
}