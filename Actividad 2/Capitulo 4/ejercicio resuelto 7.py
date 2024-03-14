#Hacer un algoritmo que, dados dos valores numéricos A y B, escriba un mensaje diciendo si A es mayor, menor o igual a B
a = float(input("Ingrese el valor A: "))
b = float(input("Ingrese el valor B: "))
if a > b:
    print(f"A es mayor que B")
elif a < b:
    print(f'A es menor que B')
else: print ("A es igual a B")
