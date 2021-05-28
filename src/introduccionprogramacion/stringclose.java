package introduccionprogramacion;

import java.util.Scanner;

public class stringclose {
	
	static Boolean valor = true;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {    
		
		String cadena; 
		Scanner entradacadena;
		
		
        System.out.println("Ingresa la cadena a evaluar");
        entradacadena = new Scanner (System.in);
        cadena =  entradacadena.nextLine();
		
		
		if(  cadena.length() > 0 ) {
			
			if( cadena.contains("{") || cadena.contains("}")  ) {
				
				// System.out.println(  "si tiene llaves" );
				
				cerrarllaves( cadena );
				
				
				
				if( valor  ) {
					System.out.println("La cadena es valida");
				}
				
			}else{
				
				System.out.println(  "La cadena no contiene llaves" );
			}		
			
		}else {
			System.out.println(  "La cadena esta vacia" );
		}
		
	}
	
	
	
	public static void cerrarllaves( String cadena ){
		
		// System.out.println(  cadena.length() );
		
		Integer abrircount = 0;
		Integer cerrarcount = 0;
		Integer diferencia;
		String nuevacadena, cadenatemp1 = "", caracter = "",   cadenatemp = cadena;
		String abrirchar = "", cerrarchar = "";
		

		
		for( Integer i = 0; i < cadena.length(); i++ ) {


			//Se evalua el numero de llaves abiertas
			if( cadena.charAt(i) ==  '{' ) {
				abrircount++;
			//	cadenatemp1 += cadena.charAt(i) + "}";
			}
			
			
			
			if( cadena.charAt(i) == '}' ) {
				
				cerrarcount++;
				//cadenatemp1 +=   "{"  + cadena.charAt(i);  
			}
			
			
		}
		
		System.out.println( "+++++++++++++++++++++++++++" );
		System.out.println( cadenatemp1 );
		//System.out.println( caracter );
		//System.out.println( "+++++++++++++++++++++++++++" );
		
		
		if(  abrircount > cerrarcount ) {
			diferencia = abrircount - cerrarcount;
			//System.out.println(  diferencia );
			
			
			for( Integer i = 0; i < diferencia; i++  ) {
				cerrarchar += "}";
			}
			
			nuevacadena = cadenatemp + cerrarchar;
			
			
			System.out.println( "+++++++++++++++++++++++++++" );
			System.out.println("La cadena ingresada no es valida");
			System.out.println( "+++++++++++++++++++++++++++" );
			
			
			System.out.println( "Posible solucion"  );
			
			System.out.println( nuevacadena  );
			
			System.out.println(  "Se deben agregar la cantidad " +  diferencia +  "  de llave(s) de }" );
			
			valor = false;
			
		}
		
		
		
		if(  cerrarcount > abrircount ) {
			diferencia = cerrarcount - abrircount;
			//System.out.println(  diferencia );
			
			for( Integer i = 0; i < diferencia; i++  ) {
				abrirchar += "{";
				
			}
			
			nuevacadena = abrirchar + cadenatemp;
			
			System.out.println( "+++++++++++++++++++++++++++" );
			System.out.println("La cadena ingresada no es valida");
			System.out.println( "+++++++++++++++++++++++++++" );
			
			System.out.println( "Posible solucion"  );
			System.out.println( nuevacadena  );
			System.out.println(  "Se deben agregar la cantidad " +  diferencia  +  "  de llave(s) de { " );
		
			valor = false;
			
		}
		
		
		
		
	}
	
	

}
