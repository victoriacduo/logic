import random

tamanhoSenha = int(input("Digite o tamanho de sneha que você quer:"))

senha = "abcdefghijklmnopqrstuvwxyz01234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()?"

p = "".join(random.sample(senha, tamanhoSenha)) #junta o tamanho da senha com os caracteres, aleatoriamente

print(p) #imprime a senha