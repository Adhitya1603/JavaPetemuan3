/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        int grade;
        System.out.print("Masukan Angka 1-10 :");
        grade = input.nextInt();
switch(grade){
case 1:
System.out.println( "Angka yang anda masukan adalah 1" ); break;
case 2:
System.out.println( "Angka yang anda masukan adalah 2" ); break;
case 3:
System.out.println( "Angka yang anda masukan adalah 3" ); break;
case 4:
System.out.println( "Angka yang anda masukan adalah 4" ); break;
case 5:
System.out.println( "Angka yang anda masukan adalah 5" ); break;
case 6:
System.out.println( "Angka yang anda masukan adalah 6" ); break;
case 7:
System.out.println( "Angka yang anda masukan adalah 7" ); break;
case 8:
System.out.println( "Angka yang anda masukan adalah 8" ); break;
case 9:
System.out.println( "Angka yang anda masukan adalah 9" ); break;
case 10:
System.out.println( "Angka yang anda masukan adalah 10" ); break;
default:
System.out.println("Invalid Number.");
}
    }
    
}
