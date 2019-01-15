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
    int[]listaNumeros =	{20,31,27,2,5,99};

    /**
     * @param args the command line arguments
     */
    
    /*
    El metodo maximos va a calcular el maximo y el segundo maximo de la lista
    de numeros
    */
public int[] maximos (int[] lista){
    int [] listaMaximos = {lista [0], lista[0]};
    for (int i=0; i< lista.length ; i++){
         if (listaMaximos [0] < lista[i]){
             listaMaximos[1] = listaMaximos[0];
            listaMaximos[0] = lista[i];
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
