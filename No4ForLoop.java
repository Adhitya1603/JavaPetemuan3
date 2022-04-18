/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package no4forloop;

/**
 *
 * @author LENOVO
 */
import javax.swing.JOptionPane;
public class No4ForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hasil =1;
String str1="";
 String str2="";
str1=JOptionPane.showInputDialog("Masukkan angka");
 int angka=Integer.valueOf(str1).intValue();
 str2=JOptionPane.showInputDialog("Masukkan pangkat");
 int pangkat=Integer.valueOf(str2).intValue();
 for(int i=1;i<=pangkat;i++){
 hasil=hasil*angka;
 }
String str3=angka+" pangkat "+pangkat+ " = "+hasil;
JOptionPane.showMessageDialog(null, str3 );
    }
    
}
