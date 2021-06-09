import java.util.*;
public class Ejercicio3{

	public static void main(String[] args) {

		int num,doble, triple;

		Scanner scanner = new Scanner(System.in);

		System.out.println("");
		System.out.println("Ingrese un numero");
		num = scanner.nextInt();

		doble = num*2;
		triple = num*3;

		System.out.println("El doble del numero es : " + doble);
		System.out.println("El triple del numero es : " + triple);
		
	}
}