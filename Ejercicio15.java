import java.util.*;
public class Ejercicio15{

	public static void main (String[] args){

		int numero;

		Scanner entrada = new Scanner (System.in);

		System.out.println("\nIngrese un numero");
		numero = entrada.nextInt();

		if (numero>0){
			System.out.println("El numero que ingreso es positivo");
		}else if(numero<0){
			System.out.println("El numero que ingreso es negativo");

		}else {
			System.out.println("EL numero es nullo");
		}


	}	
}