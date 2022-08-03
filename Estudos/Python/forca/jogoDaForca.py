import random


# import os
def jogar():
    imprimi_mensagem_de_abertura()
    palavra_secreta = carrega_palavra_secreta()
    letras_acertadas = letras_acertadas_com_(palavra_secreta)

    enforcou = False
    acertou = False
    erros = 0

    print(letras_acertadas)

    while (not enforcou and not acertou):
        chute = pede_chute()

        if (chute in palavra_secreta):
            marca_chute_correto(chute, letras_acertadas, palavra_secreta)

        #                os.system('cls')
        else:
            erros += 1
        #             os.system('cls')
        enforcou = erros == 3
        acertou = '_' not in letras_acertadas
        print('\n')
        print(letras_acertadas)
        print(f'\nErros : {erros} / 3')

    if (acertou):
        Imprimir_mensagem_vencedor()
    else:
        Imprimir_mensagem_perdeu(palavra_secreta)

    print('Fim do jogo')


def imprimi_mensagem_de_abertura():
    print('*********************************')
    print('***Bem vindo ao jogo da Forca!***')
    print('*********************************')


def carrega_palavra_secreta():
    arquivo = open('palavras.txt', 'r')
    palavras = []

    for linha in arquivo:
        linha = linha.strip()
        palavras.append(linha)
    arquivo.close()

    numero = random.randrange(0, len(palavras))
    palavra_secreta = palavras[numero].upper()
    return palavra_secreta


def letras_acertadas_com_(palavra_secreta):
    return ['_' for letra in palavra_secreta]


def pede_chute():
    chute = input("Qual letra? ")
    chute = chute.strip().upper()
    return chute


def marca_chute_correto(chute, letras_acertadas, palavra_secreta):
    posicao = 0
    for letra in palavra_secreta:
        if (chute.upper() == letra.upper()):
            letras_acertadas[posicao] = letra
        posicao = posicao + 1


def Imprimir_mensagem_vencedor():
    print('Parabéns, você ganhou!')
    print("       ___________      ")
    print("      '._==_==_=_.'     ")
    print("      .-\\:      /-.    ")
    print("     | (|:.     |) |    ")
    print("      '-|:.     |-'     ")
    print("        \\::.    /      ")
    print("         '::. .'        ")
    print("           ) (          ")
    print("         _.' '._        ")
    print("        '-------'       ")


def Imprimir_mensagem_perdeu(palavra_secreta):
    print('Puxa, você foi enforcado!')
    print('A palavra era {}'.format(palavra_secreta))