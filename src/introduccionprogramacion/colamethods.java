package introduccionprogramacion;

import java.util.*;

public class colamethods {
	
	// fuente de los metodos utilizados en la lista de arreglos
	
	//  https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
	
	// Se toman elementos de la pila creada por @author jlunaher
	
	
	public static ArrayList<String> cola = new ArrayList<String>();



	public static void main(String[] args) {
		
		
		Scanner ingresoMenu = new Scanner(System.in);Scanner 
		datoIngresado = new Scanner(System.in);
		String dato;
		int valorMenu;
		
		do {
		
        System.out.println("Selecciona una opcion:");
        System.out.println("1.-Add \n 2.-Remove \n 3.- Visualizar la lista \n 4.-Salir \n");
        
        valorMenu = ingresoMenu.nextInt();
        System.out.print("********************************* \n ");
        
        
        
        switch(valorMenu){
        case 1:
            System.out.println("Ingresa el dato:\n");
            dato = datoIngresado.nextLine();
            System.out.print("********************************* \n");
            agregar(dato);
            continuar();
            break;
        case 2:
            remover();
            continuar();
            break;
        case 3:
            ver();
            continuar();
            break;
        case 4:
            System.out.println("Adios!");
            continuar();
            break;
        default:
            System.out.println("Opcion invalida");
            continuar();
            break;
    }
        

		}while( valorMenu != 4 );
        
	}
	
	
	
	public static void continuar() {
		
		System.out.print("********************************* \n ");
        System.out.print("Presione enter para continuar  \n");
        System.out.print("********************************* \n");
        Scanner enter = new Scanner(System.in);
        enter.nextLine();
        System.out.print("********************************* \n");
        System.out.print(" \n");
		
	}
	
	
	
	public static void agregar(String dato){
	 cola.add(dato);
	 System.out.print("Se agrego " +  dato  +  " Exitosamente a la cola de datos\n ");
	 System.out.print(" \n");
	 }
	
	
	public static void remover(){
		if( cola.size() <= 0 ) {
			System.out.print("Error la cola de datos no tiene elementos, favor de agregar datos \n");
			System.out.print(" \n");
			
			 }else {
				 cola.remove(0);
				 System.out.print("Se elimino exitosamente el primer elemento cola de datos \n ");
				 System.out.print(" \n");
				}
		}
		
	public static void ver(){
		
		if( cola.size() <= 0 ) {
			System.out.print("Error la cola de datos no tiene elementos, favor de agregar datos \n");
			System.out.print(" \n");
			 }else {
				 
					System.out.print("La lista actual es \n");
					System.out.print(" \n");
					
				    for (int i=0;i <cola.size();i++) {
				        System.out.println("1.- " + cola.get(i));
				      }
				    System.out.print(" \n");
				}
		
		}

	
	

}
