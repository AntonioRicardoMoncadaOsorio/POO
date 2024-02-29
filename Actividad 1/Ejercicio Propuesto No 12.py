#Un empleado trabaja 48 horas en la semana a razón de $5.000 hora. El porcentaje de
#retención en la fuente es del 12,5% del salario bruto. Se desea saber cuál es el salario bruto,
#la retención en la fuente y el salario neto del trabajador. 

pagohora = 5000
horas = 48
Salario_Bruto = pagohora*horas
porcentaje_fuente = 12.5
Retencion_total = ((Salario_Bruto/100)*porcentaje_fuente)
salario_neto = Salario_Bruto - Retencion_total
print(f'Horas trabajadas: {horas}\nSalario Bruto: {Salario_Bruto}\nRetencion: {Retencion_total}\nSalario Neto: {salario_neto}')