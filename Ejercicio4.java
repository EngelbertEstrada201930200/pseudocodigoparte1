import java.util.*;
public class Ejercicio4{

	public static void main(String[]args){

		int cuadrado, cubo, num;

		Scanner entrada = new Scanner(System.in);

		System.out.println("\nIngrese un numero");
		num = entrada.nextInt();

		cuadrado= num*num;
		cubo = num*num*num;

		System.out.println("El cuadrado de "+num+" es: "+cuadrado);
		System.out.println("El cubo de "+num+" es: "+cubo);


		}
}