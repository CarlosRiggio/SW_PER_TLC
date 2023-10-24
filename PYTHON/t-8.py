# # x = 10 
# # print(type(x))

# # #esto da error pq intentamos concatenar una string a un int
# # #print("Hola " + 66)

# # #correcto:
# # print("Hola"+str(66))


# # my_int = 10
# # my_float = 5.0

# # #format de escribir variables

# # print("{0} di tipo {1}".format(my_int, type(my_int)))

# # x = 0.1 + 0.1 +0.1

# # #Da como resultado 0.300000000000000004 pq los 0.1 estan en binario y da eso . para solucionarlo debemos importar decimal
# # print(x)

# # from decimal import Decimal

# # x = Decimal('0.1') + Decimal('0.1') + Decimal('0.1')
# # print("Este si q da 3: "+str(x))

# # x = y = z = "pizza"

# # print(x, y, z)

# # my_string1 = "Holaa"
# # my_string2 = "Aaaadios"

# # print(my_string1,1)
# # print(my_string2,2)




# # Con el casefold hacemos que lo q escriba valga tanto para mayuscula como para minuscula
# # my_choice = input("Cossa qui fare oggi: ")
# # print(my_choice)

# # if "cinema" in my_choice.casefold():
# #     print("Cinema in the input")
# # else:
# #     print("No cinema in the choice")


# nome = "Alessandro"

# eta = 30

# #Convierte el input a una string
# print(f"{nome} - {eta}")



my_string = "0123456789"

print(my_string[0])
print(my_string[6])
print(my_string[9])


print(my_string[-1])
print(my_string[-6])
print(my_string[-9])

# de 0 al 8 (sin incluir) y de 2 en 2
print(my_string[0:8:2])