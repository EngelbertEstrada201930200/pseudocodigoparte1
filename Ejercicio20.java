import java.util.*;
public class Ejercicio20{

	public static void main(String[] args){

		int digito1, digito2, digito3, digito4, digito5, num; 

		Scanner entrada = new Scanner(System.in);
		System.out.println("\nIngrese un numero de 5 digitos");
		num= entrada.nextInt();

		if (num>=10000 && num<=99999){
			digito1=(int) Math.ceil(num/10000)%10;
			digito2=(int) Math.ceil(num/1000)%10;
			digito3=(int) Math.ceil(num/100)%10;
			digito4=(int) Math.ceil(num/10)%10;
			digito5=(int) Math.ceil(num%10)%10;
			System.out.println("El numero 1 = "+digito1);
			System.out.println("El numero 2 = "+digito2);
			System.out.println("El numero 3 = "+digito3);
			System.out.println("El numero 4 = "+digito4);
			System.out.println("El numero 5 = "+digito5);

			if(digito1 == digito5 && digito2== digito4){
				System.out.println("El numero es capicúa");

			}else{
				System.out.println("El numero no es capicúa");
			}

		}else{
			System.out.println("El numero que ingreso no tiene 5 digitos");
		}

	}
}