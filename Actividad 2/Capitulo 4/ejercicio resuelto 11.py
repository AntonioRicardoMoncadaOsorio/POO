#Escribir un algoritmo que acepte tres números enteros diferentes y muestre el mayor de ellos.
v1 = int(input("Ingrese el primer numero entero: "))
v2 = int(input("Ingrese el segundo numero entero: "))
v3 = int(input("Ingrese el tercer numero entero: "))
if v1 >= v2 and v1 >= v3:
    mayor = v1
elif v2 >= v1 and v2 >= v3:
    mayor = v2
elif v3 >= v1 and v3 >= v2:
    mayor = v3
print(f'El valor mayor entre {v1}, {v2} y {v3} es: {mayor}')