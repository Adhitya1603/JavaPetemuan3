/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joptionpane;

/**
 *
 * @author LENOVO
 */

import javax.swing.JOptionPane;
public class JoptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          String a;
        a = JOptionPane.showInputDialog ("Masukan Nilai 1 :");
        String b;
        b =  JOptionPane.showInputDialog("Masukan Nilai 2 :");
        String c;
        c = JOptionPane.showInputDialog("Masukan Nilai  3 :");
        int angka1 = Integer.parseInt(a);
        int angka2 = Integer.parseInt(b);
        int angka3 = Integer.parseInt(c);
     
  JOptionPane.showMessageDialog(null,"Rata-ratanya adalah " +((angka1+angka2+angka3)/3));  
    }
    
}
