import java.util.*;
public class Ejercicio2 {

	public static void main (String [] args ) {


		String capital;
		String pais;

		Scanner entrada = new Scanner (System.in);

		System.out.println (" Ingresa la capital  ");
                capital =   entrada.nextLine();
		

		System.out.println (" Ingrese el nombre del pais");
                pais =   entrada.nextLine();
                
                System.out.println ( capital+ " es la capital de "+pais);
		
		

	}

}
