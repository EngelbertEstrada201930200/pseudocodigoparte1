import java.util.*;
public class Ejercicio8{

	public static void main (String[] args){

		int num1, num2, num3;
		Scanner entrada = new Scanner(System.in);

		System.out.println("\nIngrese el primer numero");
		num1 = entrada.nextInt();

		System.out.println("\nIngrese el segundo numero");
		num2 = entrada.nextInt();

		System.out.println("\nIngrese el tercer numero");
		num3 = entrada.nextInt();

		int promedio = (num1+num2+num3)/3;

		System.out.println("El promedio de las notas es: "+promedio);


	}	
}