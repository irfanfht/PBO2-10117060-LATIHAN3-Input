/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117060.latihan3.input;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA : Irfan Faisal Hutama Tanjung.
 * KELAS : PBO2
 * NIM : 10117060
 * Deskripsi Program : Program ini berisi cara memasukkan data dari luar
 */
public class PBO210117060LATIHAN3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Masukkan nama anda : ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
        
        
    }
    
}
