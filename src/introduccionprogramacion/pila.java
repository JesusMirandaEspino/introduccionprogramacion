
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
public class Pila {
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
            System.out.println(pila[x]);            
        }
    }
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Pila pila = new Pila();
        int opcion = 0;
        String dato;
        Scanner valor = new Scanner(System.in);
        
        do{
            System.out.println("Selecciona una opcion:");
            System.out.println("1.-Push \n 2.-Pop \n 3.- Visualizar \n 4.-Salir \n");

            opcion = teclado.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Ingresa el dato:\n");
                    dato = valor.nextLine();
                    pila.push(dato);
                    break;
                case 2:
                    pila.pop();
                    break;
                case 3:
                    pila.view();
                    break;
                case 4:
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }while(opcion!=4);
    }
}
