/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosconsolas;

import java.util.Arrays;

/**
 *
 * @author juli
 */
public class EjemplosConsola {
    int[]listaNumeros =	{203, 20, 8, 9, 201};

    /**
     * @param args the command line arguments
     */
    
    /*
    El metodo maximos va a calcular el maximo y el segundo maximo de la lista
    de numeros
    */
public int[] maximos (int[] lista){ 
  

    int [] listaMaximos = {lista [0], lista[1]};
    for (int i=0; i< lista.length ; i++){
        
         if (listaMaximos [0] <= lista[i]){
             if (i!=0)
             listaMaximos[1] = listaMaximos[0];
            listaMaximos[0] = lista[i];
        }
         else{if (lista [i] >= listaMaximos[1]){
             listaMaximos[1] = lista[i];
             
        }
             
         }
    }
    
            return listaMaximos;
}


public static void main(String[] args) {
        EjemplosConsola ejercicios = new EjemplosConsola();
        System.out.println(Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros)));
        //jercicios.maximos (ejercicios.lista);
    }
    
}
