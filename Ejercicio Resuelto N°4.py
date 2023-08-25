# Ejercicio Resuelto N°4: A la mamá de Juan le preguntan su edad, y contesta: tengo 3 hijos, pregúntele a Juan su edad. Alberto tiene 2/3 de la edad de Juan, Ana tiene 4/3 de la edad de Juan y mi edad es la suma de las tres. Hacer un algoritmo que muestre la edad de los cuatro. 

EdadJuan = int(input('Edad de Juan '))
EdadAlber = int(2 * EdadJuan /3)
EdadAna = int(4/3 * EdadJuan)
EDADMAMA = int(EdadAlber + EdadAna + EdadJuan)
print('Las edades son: Alberto = ' + str(EdadAlber), 'Ana = ' + str(EdadAna), 'Juan = ' + str(EdadJuan), 'Mamá = ' + str(EDADMAMA))
