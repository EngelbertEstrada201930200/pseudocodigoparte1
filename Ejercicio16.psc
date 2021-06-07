Algoritmo mostrar_num_mayor
	Definir num1 Como Real
	definir num2 Como Real
	definir num3 como real
	
	Escribir " Ingrese el primer numero "
	Leer num1
	
	Escribir " Ingrese el segundo numero "
	Leer num2
	
	Escribir " Ingresar el tercer numero"
	Leer num3
	
	Si num1 > num2 y num1 > num3  Entonces
		escribir num1 " Es mayor "
	SiNo
		Si num2 > num1 y num2 > num3 Entonces
			escribir num2 " Es mayor "
		SiNo
			escribir num3 " Es mayor "
		Fin Si
	Fin Si    
	
FinAlgoritmo
