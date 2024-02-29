#Dado el radio de un círculo. Haga un algoritmo que obtenga el área del círculo y la longitud de la circunferencia. 
import math
pi = math.pi
radio = float(input('Escriba el radio del circulo: '))
area = pi*(radio**2)
longc = (2*pi)*radio
print(f'El area del circulo es: {area}\nLa longitud de la circunferencia es: {longc}')
