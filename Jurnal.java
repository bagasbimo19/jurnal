/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal;
import java.util.Scanner;
/**
 *
 * @author Praktikan
 */
public class Jurnal {

    /**
     * @param args the command line arguments
     */
    static int a=0;
    static int jumlah[] =new int[100];
    public static void main(String[] args) {
        
        System.out.print("masukin: ");
        int number = new Scanner(System.in).nextInt();
 
        System.out.println("\n\nhasil fibonacci " + number +" angkanye : ");
        for(int i=1;i<number;i++){
            jumlah[i]=fibonacciRecusion(i);
        }
        for(int i=number; i>=1; i--){
            System.out.print(fibonacciRecusion(i) +" ");
            a=fibonacciRecusion(i)+a;
        }
        System.out.println("\njumlah " + a);
        System.out.println("\nanggap aja kebalik");
    } 
 
    public static int fibonacciRecusion(int number){
        if(number == 1 || number == 2){
            return 1;
        }
 
        return fibonacciRecusion(number-1) + fibonacciRecusion(number -2);
    }
}
