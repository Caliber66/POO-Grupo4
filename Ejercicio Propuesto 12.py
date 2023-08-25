# Un empleado trabaja 48 horas en la semana a razón de $5.000 hora. El porcentaje de retención en la fuente es del 12,5% del salario bruto. Se desea saber cuál es el salario bruto, la retención en la fuente y el salario neto del trabajador.

Horas = int(input('Horas trabajadas: '))
PagoxHora = int(input('Pago por hora: '))
Salario = Horas * PagoxHora
Retencion = int((0.125*Salario))
Neto = int((Salario-Retencion))

print('Salario bruto:', '$'+str(Salario), 'Retención en la fuente: ', '$'+str(Retencion), 'Neto en la fuente: ', '$'+str(Neto)) 
