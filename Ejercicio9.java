import java.util.*;
public class Ejercicio9{

	public static void main (String[] args){

		String palabra1;
		String palabra2;
		Scanner entrada = new Scanner(System.in);

		System.out.println("\nIngrese la primera palabra");
		palabra1 = entrada.nextLine();

		System.out.println("\nIngrese la suegunda palabra");
		palabra2 = entrada.nextLine();


		System.out.println("EL intercambio es (A,B) es: ("+palabra2+","+palabra1+")"); 

	}	
}