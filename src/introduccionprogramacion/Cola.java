package introduccionprogramacion;

import java.util.*;

public class Cola {
	
	
	 String[] cola = new String[5];
	    int tamanio = -1; 
	    
	    public int add(String dato){
	        if(tamanio>=cola.length-1){
	            System.out.println("Cola de datos llena, elimina un dato para ingresar nuevos");
	            
	        }else{
	        	
	        	
		        for(int x=0;x<=4;x++){
		        	
		        	if( cola[x] == null || cola[x] == " " ) {
			            cola[x] = dato;
			            tamanio++;
			            return tamanio;
		        		}      	
		        	
		        	}
	        }
	        
	        return tamanio;
	    }
	    
	    public int remove(){
	        if(tamanio<=-1){
	            System.out.println("la cola de datos  no tiene datos");
	        }else{
	        	
		        for(int x=0;x<=4;x++){
		        	
		        	if( cola[x] != null || cola[x] != " " ) {
			            cola[x] = "  ";
			            tamanio--;
			            return tamanio;
		        		}      	
		        	
		        	}
	        	
;
	        }
	        return tamanio;
	    }
	    
	    public void view(){
	        for(int x=0;x<=4;x++){
	        	
	        	//Se agrega un if que verifica el valor a nulo y lo 
	        	if( cola[x] == null ) {
	        	cola[x] = " ";
	        	}
	        	
	            System.out.println(cola[x]);            
	        }
	    }
	    
	    
		public static void continuar() {
			
			System.out.print("********************************* \n ");
	        System.out.print("Presione enter para continuar ");
	        @SuppressWarnings("resource")
			Scanner enter = new Scanner(System.in);
	        enter.nextLine();
	        System.out.print("********************************* \n");
			
		}
		
		
public static void main(String[] args) {
	        
	        @SuppressWarnings("resource")
			Scanner teclado = new Scanner(System.in);
	        Cola cola = new Cola();
	        int opcion = 0;
	        String dato;
	        @SuppressWarnings("resource")
			Scanner valor = new Scanner(System.in);
	        
	        do{
	            System.out.println("Selecciona una opcion:");
	            System.out.println("1.-Add \n 2.-Remove \n 3.- Visualizar \n 4.-Salir \n");

	            opcion = teclado.nextInt();
	            System.out.print("********************************* \n ");

	            switch(opcion){
	                case 1:
	                    System.out.println("Ingresa el dato:\n");
	                    dato = valor.nextLine();
	                    cola.add(dato);
	                    continuar();
	                    break;
	                case 2:
	                    cola.remove();
	                    continuar();
	                    break;
	                case 3:
	                    cola.view();
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
	        }while(opcion!=4);
	    }
	

		
	

}
