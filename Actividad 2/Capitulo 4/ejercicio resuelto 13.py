compratotal = float(input("Digite el valor de la compra: "))
bola = str(input("Escriba el color de la bola en minusculas sin tildes: "))
wrongcolor = False
if bola == "azul":
    valpag = compratotal*0.50 
elif bola == "blanco" or bola == "blanca":
    valpag = compratotal
elif bola == "verde":
    valpag = compratotal*0.10
elif bola == "amarillo" or bola == "amarilla":
    valpag = compratotal*0.25
elif bola == "roja" or bola == "rojo":
    valpag = compratotal*0
else: valpag, wrongcolor = compratotal, True

if wrongcolor == True:
    print(f"COLOR DE BOLA INVALIDO, NO SE APLICARAN DESCUENTOS\nEL CLIENTE DEBE PAGAR: ${valpag}")
else: print(f'EL CLIENTE DEBE PAGAR: ${valpag}')



