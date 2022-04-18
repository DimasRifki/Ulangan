
package soal.no.pkg1;

import java.util.Scanner;

public class SoalNo1 {
  public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
       
        System.out.println("Masukkan nilai integer pertama : ");
        num1 = input.nextInt();
        System.out.println("Masukkan nilai integer kedua : ");
        num2 = input.nextInt();
        if(num1>num2) {
            System.out.println("Nilai Terbesarnya : " + num1);
        }else {
            System.out.println("Nilai Terbesarnya : " +num2);
        }
        
    }
}