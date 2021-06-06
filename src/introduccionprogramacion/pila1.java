


package introduccionprogramacion;

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jlunaher
 */


public class pila1 {
	
	 String[] pila = new String[5];
	    int tamanio = -1; 
	    
	    public int push(String dato){
	        if(tamanio>=pila.length-1){
	            System.out.println("Pila llena, elimina un dato para ingresar nuevos");
	        }else{
	            tamanio++;
	            pila[tamanio] = dato;
	        }
	        return tamanio;
	    }
	    
	    public int pop(){
	        if(tamanio==-1){
	            System.out.println("la pila no tiene datos");
	        }else{
	            pila[tamanio]=null;
	            tamanio--;
	        }
	        return tamanio;
	    }
	    
	    public void view(){
	        for(int x=4;x>=0;x--){
	        	
	        	// Se agrega un if que verifica el valor a nulo y lo 
	        	if( pila[x] == null ) {
	        		pila[x] = " ";
	        	}
	        	
	            System.out.println(pila[x]);            
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
	        pila1 pila = new pila1();
	        int opcion = 0;
	        String dato;
	        @SuppressWarnings("resource")
			Scanner valor = new Scanner(System.in);
	        
	        do{
	            System.out.println("Selecciona una opcion:");
	            System.out.println("1.-Push \n 2.-Pop \n 3.- Visualizar \n 4.-Salir \n");

	            opcion = teclado.nextInt();
	            System.out.print("********************************* \n ");

	            switch(opcion){
	                case 1:
	                    System.out.println("Ingresa el dato:\n");
	                    dato = valor.nextLine();
	                    pila.push(dato);
	                    continuar();
	                    break;
	                case 2:
	                    pila.pop();
	                    continuar();
	                    break;
	                case 3:
	                    pila.view();
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
