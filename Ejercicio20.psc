Algoritmo capic�a
	
	Escribir "Ingresar un numero"
	leer Num
	C1= (Num - (Num mod 100)) / 100
	R1 = Num mod 100
	C2= (R1 - (R1 mod 10)) / 10
	R2 = R1 mod 10
	
	Si Num == ((R2 * 100) + (C2 * 10) + c1)  Entonces
		Escribir "Numero Capic�a"
	SiNo
		Escribir "Numero ni capic�a"
	Fin Si

FinAlgoritmo
