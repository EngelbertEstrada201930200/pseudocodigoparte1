import java.util.*;
public class Ejercicio17 {

	public static void main (String[] args){

		int lado1, lado2, lado3;

		Scanner entrada = new Scanner (System.in);

		System.out.println("\nIngrese lado 1");
		lado1 = entrada.nextInt();

		System.out.println("Ingrese lado 2");
		lado2 = entrada.nextInt();
		
		System.out.println("Ingrese lado 3");
		lado3 = entrada.nextInt();
		
		if ((lado1==lado2) && (lado2 == lado3)){
			System.out.println("Es un triangulo equilatero");
		}else 
			if ((lado1==lado2) && (lado2!=lado3)){
				System.out.println("Es un triangulo isóceles");
			}else{
				System.out.println("Es un tringulo escaleno");
			}
	}
}		