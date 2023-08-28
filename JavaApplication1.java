/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Double harga,hargatotal;
        int jumlah;
        System.out.printf("%-30s: " , "Masukkan Harga Per Satuan");
        harga = in.nextDouble();
        System.out.printf("%-30s: " , "Masukkan Jumlah Unit");
        jumlah = in.nextInt();
        hargatotal = harga*jumlah;
        System.out.printf("%-8s %s %8s\n", "=====", "FILKOMART", "====");
        System.out.printf("%-20s: Rp%.2f\n" , "Harga Per Unit" , harga);
        System.out.printf("%-20s: %d\n" , "Jumlah Unit" , jumlah);
        System.out.printf("%-20s: Rp%.2f\n" , "Harga Total" , hargatotal);
    }
    
}
