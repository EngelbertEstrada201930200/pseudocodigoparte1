Algoritmo numero_multiplo_de_cinco
	definir num Como entero
	
	num = aleatorio (0,1000) 
	
	Escribir " El numero aleatorio de 1 a 1000 es...." num
	
	Si num MOD 5 = 0  & num < 100 Entonces
		Escribir  " Correcto "
	SiNo
		Escribir " incorrecto " 
	Fin Si
FinAlgoritmo
