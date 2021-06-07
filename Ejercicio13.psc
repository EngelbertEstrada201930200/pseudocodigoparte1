Algoritmo volumen_cilindro
	
	Definir radio, altura Como Entero
	Definir volumen Como Real
	

	Escribir "Ingrese el radio del cilindro"
	Leer radio
	Escribir "Ingrese la altura del cilindro"
	leer altura
	
	Si altura >0 Entonces
		Escribir "El radio es positivo"
		Escribir "La altura es positiva"
		volumen = pi*radio*radio*altura
		Escribir "El volumen del cilindro es "  volumen
	SiNo
		Escribir "La altuara es negativa, no existe volumen negativo"
	Fin Si
	
FinAlgoritmo
