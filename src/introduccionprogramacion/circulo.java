package introduccionprogramacion;

import java.util.Scanner;

public class circulo {
	
	static Float pi = (float) 3.1416; 
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) { 
		
		
		float radio; 
		Scanner valorRadio;
		
		System.out.println(  "Calcula el area de un circulo" );
		System.out.println(  "============================= \n" );
		
		System.out.println(  "Ingresa el radio del circulo" );
        valorRadio = new Scanner (System.in);
        radio = Integer.parseInt( valorRadio.nextLine() );
        System.out.println(  "============================= \n" );
        System.out.println(  "============================= \n" );
        System.out.println(  "El area de circulo es:  " + areaCirculo( radio ) );
        
	}
	

	public static float areaCirculo( float radio ){
		
		float area;
		area = (float) (pi * Math.pow(radio, 2 ));
		
		return area;
	}
	
}
