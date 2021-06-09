import java.util.Scanner;

public class Ejercicio18{

    public static void main(String[] args){
    
        int numero1,cant = 0,suma = 0,dig1 = 0,dig2 = 0,dig3 = 0, dig4 = 0;
        String numero;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("ingrese el primer lado: "); 
        numero1 = entrada.nextInt();
        
        if(-9999 <= numero1 && numero1 <= 9999){
            cant=conteoDig(numero1);
        }else{
           System.out.print("numero invalido "); 
        }
        
        if(cant == 4){
            numero = String.valueOf(numero1);
            dig1 =  Character.getNumericValue(numero.charAt(0));
            dig2 =  Character.getNumericValue((int)numero.charAt(1));
            dig3 =  Character.getNumericValue((int)numero.charAt(2));
            dig4 =  Character.getNumericValue((int)numero.charAt(3));
            
        }else{
            if(cant == 3){
                numero = String.valueOf(numero1);
                dig1 = 0;
                dig2 =  Character.getNumericValue((int)numero.charAt(0));
                dig3 =  Character.getNumericValue((int)numero.charAt(1));
                dig4 =  Character.getNumericValue((int)numero.charAt(2));
            }else{
                if(cant == 2){
                    numero = String.valueOf(numero1);
                    dig1 = 0;
                    dig2 = 0;
                    dig3 =  Character.getNumericValue((int)numero.charAt(0));
                    dig4 =  Character.getNumericValue((int)numero.charAt(1));
                }else{
                    if(cant == 1){
                    numero = String.valueOf(numero1);
                    dig1 = 0;
                    dig2 = 0;
                    dig3 = 0;
                    dig4 =  Character.getNumericValue((int)numero.charAt(0));
                    }else{
                       System.out.print("numero invalido ");  
                    }
                }
                
            }
        }
        
        suma = dig1+dig2+dig3+dig4;
        
        System.out.println("La suma es: " + suma); 
        System.out.println("numero los digitos son:  "); 
        System.out.println("digito 1:  "+ dig1);
        System.out.println("digito 2:  "+ dig2);
        System.out.println("digito 3:  "+ dig3);
        System.out.println("digito 4:  "+ dig4);
    }
    
    public static int conteoDig(int cant){
        int canti;
       if(-9999 <= cant && cant <= 9999){
            canti = 4;
            return canti;
        }else if(-999 <= cant && cant <= 999){
            canti = 3;
            return canti;
        }else if(-99 <= cant && cant <= 99){
            canti = 2;
            return canti;
        }else if(-9 <= cant && cant <= 9){
            canti = 1;
            return canti;
        } else{
            canti = 0;
            return canti;
        }
    }
}
