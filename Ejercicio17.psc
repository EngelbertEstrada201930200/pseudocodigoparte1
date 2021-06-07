Algoritmo triangulos
	
	Definir lado1, lado2, lado3 Como Entero
	
	Escribir "Ingrese lado 1"
	leer lado1
	Escribir "Ingrese lado 2"
	leer lado2
	Escribir "Ingrese lado 3"
	leer lado3
	
	Si lado1 = lado2 &lado2=lado3 Entonces
		Escribir "Es un triangulo Equilatero"
	SiNo
		Si lado1 = lado2 & lado2 <> lado3 Entonces
			Escribir "Es un triangulo Isóceles"
		SiNo
			Escribir "Es un triangulo Escaleno"
		Fin Si
	Fin Si
	
FinAlgoritmo
