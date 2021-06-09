import java.util.*;
public class Ejercicio13{

	public static void main (String[] args){
		
		double radio, volumen, altura;

		Scanner entrada = new Scanner (System.in);

		System.out.println("\nIngrese el radio");
		radio = entrada.nextDouble();

		System.out.println("\nIngrese la altura");
		altura = entrada.nextDouble();

		if(altura>0){
			volumen = Math.PI*radio*radio*altura;
			System.out.println("El volumen es: "+ volumen);
		}else {
			System.out.println("No existe una altura negativs ");
		}


	}	
}