import random

def coin_flip(n):
    head = tails = 0
    for i in range(n):
        side = randint(0,1)
        if(side == 0):
            heads = heads + 1
        else:
            tails = tails + 1

            print(n, "coin flips: Cara: ", heads, "coroa: ", tails)

            print("\nPress the Var key and select 'coin_clip()'")
            print("In the ( ), enter a numer of flips!")