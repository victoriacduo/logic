import time
import datetime as dt   
import turtle 

#turtle é um módulo para desenhar utilizando a programação
t = turtle.Turtle()
tela = turtle.Screen()

tela.bgcolor("#009688")

sec = dt.datetime.now().second
min = dt.datetime.now().minute
hr = dt.datetime.now().hour

while True:

    t.hideturtle()
    t.clear()

    # display the time
    t.write(str(hr).zfill(2)
    + ":" + str(min).zfill(2) + ":"
    + str(sec).zfill(2),

    font = ("Arial Narrow", 35, "bold"))

    time.sleep(1)
    sec += 1

    if sec == 60:
        sec = 0
        min += 1

    if min == 60:
        min = 0
        hr += 1

    if hr == 13:
        hr = 1