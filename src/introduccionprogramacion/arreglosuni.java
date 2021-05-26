package introduccionprogramacion;
import java.util.Scanner;

public class arreglosuni {
	
	public static void main(String[] args) { 
		
    	Scanner valorcantidad;
    	Integer cantidad;
    	
    	System.out.println("Indique el numero de personas a Ingresar \n");
    	valorcantidad = new Scanner (System.in);
    	cantidad = Integer.parseInt(  valorcantidad.nextLine() );
    	
    	 arreglo(cantidad);
	}
	
	
	public static void arreglo( Integer cantidad) {
		
		Scanner ingresar;
		Integer index;
		
		String[] personas = new String[ cantidad  ];
		
		index = 1;
		
		for( Integer i = 0; i <= cantidad - 1; i++ ) {
			System.out.println("Ingrese el nombre de la persona n.- " + index + " \n " );
			ingresar = new Scanner (System.in);
			personas[i] = ingresar.nextLine();
			index++;
		}
		

		System.out.println("Las personas ingresadas son  \n" );
		index = 1;
		
		for( Integer i = 0; i <= cantidad - 1; i++ ) {
			System.out.println( index +  ".- " + personas[i] + " \n " );
			index++;
		}
	}
}
