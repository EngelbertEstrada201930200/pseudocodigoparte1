Algoritmo conversiones
	Definir n Como real;
	Definir yarda, metro, ft, pulg Como real;
	
	Escribir "Ingrese una cantidad en centimetros"
	leer n;
	
	yarda = n*0.1*(1/0.914);
	metro = n*0.01;
	ft = n*0.0328084;
	pulg = n*(1/2.54);
	
	
	Escribir "Centimetros a yardas es " yarda;
	Escribir "Centimetros a metro es " metro;
	Escribir "Centimetros a pies es " ft;
	Escribir "Centimetros a pulgada es " pulg;
	
FinAlgoritmo 
