import math
#CIRCULO: retornar Area y Perimetro en base a Radio
class Circulo:
    def __init__(self, radio):
        self.radio = radio
    def area(self):
        return (math.pi*(self.radio**2))
    def perimetro(self):
        return 2*(math.pi)*self.radio

#RECTANGULO: retornar area y perimetro en base a... base y altura
class Rectangulo:
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura
    def areaR(self):
        return self.base*self.altura
    def perimetroR(self):
        return (self.base*2)+(self.altura*2)

#CUADRADO: determinar area y perimetro en base al lado
class Cuadrado:
    def __init__(self, lado):
        self.lado = lado
    def areaC(self):
        return self.lado*self.lado
    def perimetroC(self):
        return self.lado * 4

#TRIANGULO RECTANGULO: base altura para area y perimetro, aparte de tipo de triangulo rectangulo
class TrianguloRectangulo:
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura
    def areaT(self):
        return (self.base*self.altura) / 2
    def hipotenusaT(self):
        return math.sqrt((self.base**2)+(self.altura**2))
    def perimetroT(self):
        return self.base + self.altura + self.hipotenusaT()
    def tipotriangulo(self):
        if (self.base == self.altura) and (self.base == self.hipotenusaT()) and (self.altura == self.hipotenusaT()):
            return "Es un triangulo equilatero."
        elif (self.base != self.altura) and (self.altura != self.hipotenusaT()) and (self.base != self.hipotenusaT()):
            return "Es un triangulo escaleno."
        else: return "Es un triangulo  isosceles"
        
 
class PruebaFiguras:
    def main():
      Cradio = Circulo(float(input('Escriba el radio del circulo: ')))
      RectaBH = Rectangulo(float(input("Escriba la base del rectangulo: ")), float(input("Escriba la altura del rectangulo: ")))
      ladoCuadrado = Cuadrado(float(input("Escriba un lado del cuadrado: ")))
      TRinguloR = TrianguloRectangulo(float(input("Escriba la base del triangulo: ")), float(input("Escriba la altura del triangulo: ")))
      print(f'\nEl area del circulo es: {Cradio.area()}\nEl perimetro del circulo es: {Cradio.perimetro()}')
      print(f'\nEl area del rectangulo es: {RectaBH.areaR()}\nEl perimetro del rectangulo es: {RectaBH.perimetroR()}')
      print(f'\nEl area del cuadrado es: {ladoCuadrado.areaC()}\nEl perimetro del cuadrado es: {ladoCuadrado.perimetroC()}')
      print(f'\nEl area del triangulo es: {TRinguloR.areaT()}\nEl perimetro del triangulo es: {TRinguloR.perimetroT()}\n{TRinguloR.tipotriangulo()}')

if __name__ == "__main__":
    PruebaFiguras.main()
