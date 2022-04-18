/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iflelse;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class IflElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        int x;
        System.out.print("Masukan Angka 1-10 :");
        x = input.nextInt();
        if (x==1){
            System.out.println("Anda memilih nomor 1");
        }else if (x==2){
            System.out.println("Anda memilih nomor 2");
        }else if (x==3){
            System.out.println("Anda memilih nomor 3");
        }else if (x==4){
            System.out.println("Anda memilih nomor 4");
        }else if (x==5){
            System.out.println("Anda memilih nomor 5");
        }else if (x==6){
            System.out.println("Anda memilih nomor 6");
        }else if (x==7){
            System.out.println("Anda memilih nomor 7");
        }else if (x==8){
            System.out.println("Anda memilih nomor 8");
        }else if (x==9){
            System.out.println("Anda memilih nomor 9");
        }else if (x==10){
            System.out.println("Anda memilih nomor 10");
        }else{
            System.out.println("Invalid Number");
        }
    }
    
}
