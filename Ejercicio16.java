import java.util.*;
public class Ejercicio16 {

	public static void main (String [] args){

		double num1, num2, num3 ; 

		Scanner entrada = new Scanner (System.in);

		System.out.print (" Ingresa el primer numero: ");
		num1 = entrada.nextDouble();

		System.out.print(" ingresa el segundo numero:  ");
		num2 = entrada.nextDouble ();

		System.out.print (" Ingresa el tercer numero: ");
		num3 = entrada.nextDouble();

		if ( num1 > num2 & num1 > num3) {

			System.out.println ("\n"+ num1 + "  es mayor ");

		} else 
				if ( num2 > num1 & num2 > num3){

					System.out.println (" \n "+ num2 + " es el mayor");

				} else {

					System.out.println (" \n "+ num3 +" es el mayor.");

				}	


	}

}