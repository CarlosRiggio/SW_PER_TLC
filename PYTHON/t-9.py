age = int(input("Introduce your age: "))
if age >= 18:
    print("Puedes votar")
else:
    print("No puedes votar")

##################################################################
##################################################################

my_string = "Alessandro Bonomi"

for character in my_string:
    print(character, end=";")
print("\n")

#ciclo for con range 

for value in range(10,0,-1):
    print(value, end=",")
print("\n")

found = False

for value in range(10, 20):
    if value == 11:
        found = True

if found:
    print("Trovato")

#ciclo while
index = 10

while index>0:
    print(index, end=",")
    index -=1
print("\n")

#ciclo while con true

import random
value = random.randint(1,1000)
print("Risposta correcta: {value}")

while True:
    try: 
        guess = int(input("Insserire un valore da 1 a 1000 (0 per uscire): "))
    except ValueError:
        print("Avevo chiesto un intero, mi spengo")

    else:
        if guess ==0:
            break
        elif guess < value:
            print("Più Alto...")
        elif guess > value:
            print("Più Baso")
        else:
            print("Indominato")
            break













