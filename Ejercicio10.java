import java.util.*;
public class Ejercicio10 {

	public static void main (String [] args){

		int base, altura;
		int area;
		int perimetro;

		Scanner entrada = new Scanner (System.in);

		System.out.println (" ingresa la altura");
		altura =  entrada.nextInt();

		System.out.println (" Ingresa la base");
		base =  entrada.nextInt();

		area =  base*altura;

		perimetro =  2*base + 2*altura ;

		System.out.println (" El area del rectangulo es "+ area);
		System.out.println (" El prerimetro del rectangulo es "+ perimetro);


	}

}