/*
Burbuja
 */
package ordenamiento;

import java.util.Arrays;
import java.util.Scanner;

public class Burbuja {
    
    Scanner leer = new Scanner(System.in);
    
    int lista[] = new int[4]; 

    public void ingresarValor(){ //Meto para ingresar los valor a ordenar
        
        for(int cont=0; cont<4; cont++){
            System.out.print("Ingrese el valor: ");
            int valor = leer.nextInt();
            lista[cont] = valor;
        }
        
        System.out.println("\nLa lista es:");
        System.out.println(Arrays.toString(lista));
        System.out.println();
        
    }
    
    public void ordenar(){ //Ordenar con el metodo de burbuja
        
        System.out.println("\nOrdenamiento:");
        
        for(int i=0; i<lista.length-1; i++){
            for(int j=i+1; j<lista.length; j++){
                
                System.out.println(Arrays.toString(lista)+"\t"+i+"  "+j+"*********"+lista[i]+"  "+lista[j]);
                
                if(lista[i]>lista[j]){
                    int aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }
                
            }
        }
        
        System.out.println("\nLa lista ordenada es:");
        System.out.println(Arrays.toString(lista));
    }
    
}
