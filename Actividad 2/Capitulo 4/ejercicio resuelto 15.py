#Se tienen cuatro esferas (A, B, C, D) de las cuales se sabe que tres son de igual peso y una
#diferente. Elaborar un algoritmo que determine cuál es la esfera diferente y si es de mayor o menor peso
ea, eb, ec, ed = float(input("A: ")), float(input("B: ")), float(input("C: ")), float(input("D: "))
if ea == eb and ea == ec:
    difer = "La esfera D es la diferente y "
    if ed > ea:
        peso = "es de mayor peso."
    else: peso = "es de menor peso."
    print(difer+peso) 
if ea == eb and ea == ed:
    difer = "La esfera C es la diferente y "
    if ec > ea:
        peso = "es de mayor peso."
    else: peso = "es de menor peso."
    print(difer+peso) 
if ea == ed and ea == ec:
    difer = "La esfera B es la diferente y "
    if eb > ea:
        peso = "es de mayor peso."
    else: peso = "es de menor peso."
    print(difer+peso) 
if eb == ec and eb == ed:
    difer = "La esfera A es la diferente y "
    if ed < ea:
        peso = "es de mayor peso."
    else: peso = "es de menor peso."
    print(difer+peso) 
else: print("Mas de una esfera es diferente.")

