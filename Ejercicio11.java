import java.util.*;
public class Ejercicio11{

	public static void main (String[] args){
		
		double numero, metros, yardas, pies, pulgadas;

		Scanner entrada = new Scanner (System.in);

		System.out.println("Ingrese un valor en centimetros");
		numero = entrada.nextDouble();

		metros = numero*0.01;
		yardas = numero*1.09361;
		pulgadas = numero*0.393701;
		pies = numero*0.0328084;

		System.out.println("De centimetro a metros "+ metros);
		System.out.println("De centimetro a yardas "+ yardas);
		System.out.println("De centimetro a pulgadas "+ pulgadas );
		System.out.println("De centimetro a pies " +pies);





	}	
}