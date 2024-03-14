#Dado el valor del lado en un triángulo equilátero, haga un algoritmo que obtenga el perímetro, el valor de la altura y el área del triángulo. 

lado = float(input("Escriba la medida de uno de los lados: "))
perimetro = lado*3
altura = (lado*(3**0.5))/2
area = (lado*altura)/2
print(f'Perimetro del triangulo: {perimetro}\nAltura del triangulo: {altura}\nArea del triangulo: {area}')

