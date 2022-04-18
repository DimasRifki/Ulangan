/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal5;

public class Soal5 {
  public static void main(String[]args){
        int[] array= {4,6,1,3,5};
        int maksimum= array[0];
 
        for(int i=0; i < array.length; i++){
            if(array[i] > maksimum){
                maksimum = array[i];   
            }
    }
        System.out.println("Nilai maksimum = "+maksimum);
}
}