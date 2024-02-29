class persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

juan = persona("Juan", int(input('Escriba la edad de Juan: ')))
alberto = persona('Alberto', int((juan.edad*2)/3))
ana = persona('Ana', int((juan.edad*4)/3))
ma = persona('Madre', int(juan.edad + ana.edad + alberto.edad))
print(f'LAS EDADES SON:\nAlberto: {alberto.edad}\nJuan: {juan.edad}\nAna: {ana.edad}\nMadre: {ma.edad}')