/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nilai1no1;

/**
 *
 * @author LENOVO
 */
     import java.io.*;

public class Nilai1no1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
BufferedReader Angka = new BufferedReader(new InputStreamReader(System.in));
int nilai1  ;
int nilai2  ;
int nilai3 ;
int Total;
System.out.println("=======================================");
System.out.println("Silahkan Masukan Nilai ");
System.out.println("=======================================");
try {
System.out.println("Silahkan Masukan Nilai 1:");
    nilai1 = Integer.parseInt(Angka.readLine());
System.out.println("Silahkan Masukan Nilai 2:");
    nilai2 = Integer.parseInt(Angka.readLine());
System.out.println("Silahkan Masukan Nilai 3:");
    nilai3 = Integer.parseInt(Angka.readLine());
    
    Total = (nilai1+nilai2+nilai3)/3;
System.out.println("Nilai rata-ratanya    :"+Total);

} catch (IOException e) {
System.out.println("error!");

} 

    }
}
    

