Algoritmo suma_digitos
	
	Escribir "Ingrese un numero con 4 digitos"
	leer n
	n1 <- trunc (n/1000)
	r1 <- n mod 1000
	n2 <- trunc (r1/100)
	r2 <- n mod 100
	n3 <- trunc (r2/10)
	r3 <- n mod 10
	n4 <- trunc (r3/1)
	
	Suma =n1+n2+n3+n4
	Escribir "La suma de los digitos es " Suma

FinAlgoritmo
