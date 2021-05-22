package introduccionprogramacion;

import java.util.Scanner;

public class calc {
	

	public static void main(String[] args) {      
    	
    	Scanner entradaseleccion, entradanum1, entradanum2;
    	int seleccion;
    	float num1, num2, num3, num4;

        System.out.println("¿Que deseas realizar? \n");
        System.out.println("1.- Suma \n");
        System.out.println("2.- Resta \n");
        System.out.println("3.- Multiplicacion \n");
        System.out.println("4.- Division \n");
        
        System.out.println("Ingresa valor");
        entradaseleccion = new Scanner (System.in);
        seleccion = Integer.parseInt( entradaseleccion.nextLine() );
        
        
        
        
        System.out.println("El valor es " + seleccion );
        
        
        switch( seleccion ){
        
        	case 1: 
        		
        		System.out.println("Suma \n");
        		
        		System.out.println("Ingrese el primer numero \n");
        		entradanum1 = new Scanner (System.in);
        		num1 = Integer.parseInt( entradanum1.nextLine() );
        		
        		System.out.println("Ingrese el segundo numero \n");
        		entradanum2 = new Scanner (System.in);
        		num2 = Integer.parseInt( entradanum2.nextLine() );
        		
        		num3 = num1 + num2;
        		
        		System.out.println("La suma de los numeros es " +  num3  +  " \n");
        		posneg(  num3 );
        		
        		break; 
        		
        		
        
        	case 2: 
        		
        		System.out.println("Resta \n");
        		
        		System.out.println("Ingrese el primer numero \n");
        		entradanum1 = new Scanner (System.in);
        		num1 = Integer.parseInt( entradanum1.nextLine() );
        		
        		System.out.println("Ingrese el segundo numero \n");
        		entradanum2 = new Scanner (System.in);
        		num2 = Integer.parseInt( entradanum2.nextLine() );
        		
        		num3 = num1 - num2;
        		
        		System.out.println("La resta  de los numeros es " +  num3  +  " \n");
        		posneg(  num3 );
        		
        		break;  		
        		
        		
        	case 3: 
        		
        		System.out.println("Multiplicacion \n");
        		
        		System.out.println("Ingrese el primer numero \n");
        		entradanum1 = new Scanner (System.in);
        		num1 = Integer.parseInt( entradanum1.nextLine() );
        		
        		System.out.println("Ingrese el segundo numero \n");
        		entradanum2 = new Scanner (System.in);
        		num2 = Integer.parseInt( entradanum2.nextLine() );
        		
        		num3 = num1 * num2;
        		
        		System.out.println("La multiplicacion  de los numeros es " +  num3  +  " \n");
        		posneg(  num3 );
        		
        		break;  
        		
        	case 4: 
        		
        		System.out.println("Division \n");
        		
        		System.out.println("Ingrese el primer numero \n");
        		entradanum1 = new Scanner (System.in);
        		num1 = Integer.parseInt( entradanum1.nextLine() );
        		
        		System.out.println("Ingrese el segundo numero \n");
        		entradanum2 = new Scanner (System.in);
        		num2 = Integer.parseInt( entradanum2.nextLine() );
        		
        		num4 = num1 / num2;
        		
        		System.out.println("La division  de los numeros es " +  num4  +  " \n");
        		posneg(  num4 );
        		
        		break;  
        		
        	default: System.out.println("El valor " + " Es incorrecto "); 
        	break;
        
        }
        
        
 }
	
	public static void posneg( float num) {
		if( num >= 0 ) {
			System.out.println("El numero es positivo \n");
		}else {
			System.out.println("El numero es negativo \n");
		}
	}
	


}
