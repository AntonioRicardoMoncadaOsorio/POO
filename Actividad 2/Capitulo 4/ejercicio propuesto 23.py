#Dados los valores A, B y C que son los parámetros de una ecuación de segundo grado, elaborar un algoritmo para hallar las posibles soluciones de dicha ecuación.
from math import sqrt
print('Asi se ve una ecuacion de segundo grado: ax² + bx + c = 0')
a = float(input('Escriba el valor de a: '))
b = float(input('Escriba el valor de b: '))
c = float(input('Escriba el valor de c: '))
sepuede =  b * b - 4 * a * c
if sepuede < 0: #nosepuede
    print(f'La solucion esta dentro de los numeros complejos.')
else:
    raiz = sqrt(sepuede)      
    x1 = ((-b) + raiz)/(2 * a) 
    if sepuede != 0: 
        x2 = ((-b) - raiz)/(2 * a)
        print(f'Los valores de x son: {x1} y {x2}.') 
    else:
        print(f'El valor de x es: {x1}')