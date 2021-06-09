import java.util.*;
public class Ejercicio19{

	public static void main (String[] args){
	 int numero = (int)(Math.random()*1000+1);
	 System.out.println("\nEl numero aleatorio es: "+numero);

	 if (numero%5==0 && numero<=25){
	 	System.out.println("\nCorrecto");
	 }else {
	 	System.out.println("\nIncorrecto");
	 }

	}
}
