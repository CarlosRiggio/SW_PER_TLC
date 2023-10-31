
available_items = ["pasta",
                   "acqua",
                   "farina",
                   "uova",
                   "biscotti"]

shopping_list = []

while True:
    for index, item in enumerate(available_items):
        print(f"{index}: {item}")
    choice = int(input("Cosa vuoi comprare? (0 per uscire)"))

    if choice == 0:
        print("Hai comprato questa cose: " + str(shopping_list))

    elif 1<=choice<=len(available_items):
        shopping_list.append(available_items[choice-1])
    else:
        print("Numero non valito")