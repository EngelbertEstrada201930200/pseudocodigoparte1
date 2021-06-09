import java.util.*;
public class Ejercicio14{

	public static void main (String[] args){

		int num1, num2;
		int resultado;

		Scanner entrada = new Scanner(System.in);

		System.out.println (" Ingrese el primer numero");
		num1 =  entrada.nextInt();

		System.out.println (" Ingresa el segundo numero ");
		num2 = entrada.nextInt();

		resultado = num2 % num1;

		if ( resultado == 0) {

			System.out.println (" Es divisible");
		} else {

			System.out.println (" No es divisible");
		}



	}

}