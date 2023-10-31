# result = 10
# result_copy = result

# print(f"{result} : {id(result)}")
# print(f"{result_copy} : {id(result_copy)}")


# #list
# shopping_list = ["pane",
#                  "pasta",
#                  "aqua",
#                  "uova",
#                  "harina"]

# for item in shopping_list:
#     print(item)

# print(shopping_list)
# print(shopping_list[3])
# print(shopping_list[-1])
# print(shopping_list[2:4])

# # for item in shopping_list:
# #     index = shopping_list.index(item)
# #     print(f"{index} : {item}")
# #mejor usar esta funcion para retornar el index junto con el elemento

# for index, item in enumerate(shopping_list):
#     print(f"{index} : {item}")


# #Mutable

# import copy

# #los int son inmutables pero la listas son mutables

# my_list = [1, 2, [3,4], 5]
# copy_1 = my_list
# copy_2 = my_list[:] #shallow copy -> no copiamos el contenido sino el referimiento al objeto (es como un pointer)
# copy_3 = copy.copy(my_list) #shallow copy
# copy_4 = copy.deepcopy(my_list) # deep copy -> hacemos una copia directa del objeto (replicamos el contenido de la lista)

# print(f"my_list: {my_list}, {id(my_list)}")
# print(f"my_copy: {copy_1}, {id(copy_1)}")
# print(f"my_copy: {copy_2}, {id(copy_2)}")
# print(f"my_copy: {copy_3}, {id(copy_3)}")
# print(f"my_copy: {copy_4}, {id(copy_4)}")

# print("-"*50)

# my_list[0] = 10
# print(f"my_list: {my_list}, {id(my_list)}")
# print(f"my_copy: {copy_1}, {id(copy_1)}")
# print(f"my_copy: {copy_2}, {id(copy_2)}")
# print(f"my_copy: {copy_3}, {id(copy_3)}")
# print(f"my_copy: {copy_4}, {id(copy_4)}")

# print("-"*50)

# #EN el momento en el que nosotros cambiamos el valor de algo inmutable, hemos cambiado el objeto, el ID de la lista es siempre lo mismo pero
# #cambia el objeto asi que el ID es distinto


# #aqui estamos cambiando el valor de la list
# # al cambiar la list la copy 1 no cambia pero la copy2 y a cop
# my_list[2][0] = 10
# print(f"my_list: {my_list}, {id(my_list)}")
# print(f"my_copy: {copy_1}, {id(copy_1)}")
# print(f"my_copy: {copy_2}, {id(copy_2)}")
# print(f"my_copy: {copy_3}, {id(copy_3)}")
# print(f"my_copy: {copy_4}, {id(copy_4)}")

# print("-"*50)


# #constructor de la clase list

# my_list = list(("uova", "pasta", "pane", "farina", "acqua"))
# for index, item in enumerate(my_list):
#     print(f"{index} : {item}")
# print(my_list)

# #OPERAZIONI


my_list= [1, 46, -19, 4.5, 7.8]
print(my_list)

sorted_list = sorted(my_list)
print(sorted_list)

shopping_list = ["pane",
                 "pasta",
                 "aqua",
                 "uova",
                 "harina"]

print(shopping_list)
shopping_list.append("biscotti")
print(shopping_list)

shopping_list.insert(0, "biscotti")
print(shopping_list)

shopping_list.remove("uova")
print(shopping_list)

#quitamos el elemento que sea pasta tras sacar su index y luego remover el elemento de ese index
index = shopping_list.index("pasta")
shopping_list.pop(index)
print(shopping_list)

#eliminamos el primer elemento de la shopping list
del shopping_list[0]
print(shopping_list)


###################################################################
########                        TUPLA                      ########
###################################################################


# # Copy the un tuple es siempre una deep copy, es inmutable.
import copy
my_tuple = 1, 2, 3, 4,5

print(f"{type(my_tuple)} : {my_tuple}")

copy_1 = copy.deepcopy(my_tuple)

print(copy_1)

my_tuple = ("A", "B", "C")
var_1, var_2, var_3 = my_tuple
print(var_1)
print(var_2)
print(var_3)
print(my_tuple)