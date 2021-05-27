package introduccionprogramacion;

import java.util.Scanner;

public class arreglobidi {
	
	public static String agenda[][] = new String[5][5];


	public static void main(String[] args) { 

    	agenda[0][0] = "Nombre";
    	agenda[0][1] = "Apellido paterno";
    	agenda[0][2] = "Apellido materno";
    	agenda[0][3] = "Telefono";
    	agenda[0][4] = "E-mail";
		
    	System.out.println("Limtado a 5 personas \n");
 
    	arreglo();
	}
	
	
	
	public static void arreglo( ) {
		
		Integer index = 1;
		
		for( Integer i = 0; i <=  4; i++  ) {
			
			agregar( i, index );
			index++;
		}
		
		System.out.println("Los datos Ingresados son");
		
		@SuppressWarnings("resource")
		Scanner enter = new Scanner(System.in);
        enter.nextLine();
        
        index = 1;
		
        
		for( Integer i = 0; i <=  4; i++  ) {
			
			mostrar( i, index );
			index++;
		}
        
        
        
	}
	

	@SuppressWarnings("resource")
	public static void agregar( Integer posicion, Integer index) {
		
		Scanner entradaDato;
		
    	System.out.println( index + ".-  " + "Ingrese el nombre persona  \n");
    	entradaDato = new Scanner (System.in);
    	agenda[posicion][0] = entradaDato.nextLine();
    	
    	System.out.println( index + ".-  " +  "Ingrese el apellido paterno \n");
    	entradaDato = new Scanner (System.in);
    	agenda[posicion][1] = entradaDato.nextLine();
		
    	System.out.println( index + ".-  " +  "Ingrese el apellido materno \n");
    	entradaDato = new Scanner (System.in);
    	agenda[posicion][2] = entradaDato.nextLine();
    	
    	System.out.println( index + ".-  " +  "Ingrese el telefono \n");
    	entradaDato = new Scanner (System.in);
    	agenda[posicion][3] = entradaDato.nextLine();
    	
    	System.out.println( index + ".-  " +  "Ingrese el correo \n");
    	entradaDato = new Scanner (System.in);
    	agenda[posicion][4] = entradaDato.nextLine();
    	System.out.println("*****************************************************"  );
    	
	}
	
	public static void mostrar( Integer posicion, Integer index) {
		
    	System.out.println( index + ".-  " + "Nombre: "  + agenda[posicion][0] );
    	System.out.println( index + ".-  " + "Apellido paterno: "  + agenda[posicion][1] );
    	System.out.println( index + ".-  " + "Apellido materno: "  + agenda[posicion][2] );
    	System.out.println( index + ".-  " + "Telefono: "  + agenda[posicion][3] );
    	System.out.println( index + ".-  " + "E-mail: "  + agenda[posicion][4] );
    	System.out.println("*****************************************************"  );
		
	}
	

}
