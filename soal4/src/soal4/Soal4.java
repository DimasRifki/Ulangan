/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal4;

/**
 *
 * @author Asus
 */
public class Soal4 {public static void main (String[]args){
        int[] array= {4, 6, 1, 3, 5};
        
        for(int i=0; i < array.length; i++){
               if(array[i] % 2 == 0){
                   System.out.print("genap ");
            }else{
                   System.out.print("ganjil ");
            }
        }
    }
}