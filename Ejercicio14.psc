Algoritmo numero_divisible
	Definir num1 Como Entero
	Definir num2 Como Entero
	Definir res Como Entero
	
	Escribir "Ingrese el primer numero"
	leer num1
	Escribir "Ingrese el segundo numero"
	leer num2
	
	res = num2 mod num1
	
	Si res=0 Entonces
		Escribir "Es divisible"
	SiNo
		Escribir "No es divisible"
	Fin Si
	
FinAlgoritmo
