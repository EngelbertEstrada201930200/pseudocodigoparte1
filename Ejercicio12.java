import java.util.*;
public class Ejercicio12 {

	public static void main (String [] args){

		double celius;
		double faharenheit; 

		Scanner entrada = new Scanner (System.in);

		System.out.println (" Ingrese una temperatura en celius °C ");
		celius =  entrada.nextDouble();

		faharenheit =  ( celius*9/5 )+ 32 ;

		System.out.println ("La temperatura en faharenheit es: " + faharenheit + " °F" ); 


	}


}