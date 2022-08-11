import random
numero = random.randint(1, 100) #int random entre 1 e 100
numero_tentativas = 0 #definindo o valor da variavel

while True: #loop infinito, interrompido ao acertar o número
    try:
        tentativa = int(input("Adivinhe o número: ")) #variavel tentativa é uma int

        if numero == tentativa:
            numero_tentativas = numero_tentativas + 1
            print(f'Você ganhou com {numero_tentativas} tentativas')
            break
        elif tentativa < numero: #elif é quando tem 3 situações, else if do python
            print('Número muito baixo')
            numero_tentativas = numero_tentativas + 1 #permite outra tentativa 
        else:
            print("Número muito alto")
            numero_tentativa = numero_tentativa + 1
        
    except: #se ele não conseguir executar o try, caí no except
        print('Escolha um número entre 1 e 100')