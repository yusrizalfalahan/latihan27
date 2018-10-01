/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117043.latihan30.cakep;

import java.util.Scanner;

/**
 *NAMA                 : Yusrizal Falahan
 * Kelas                : PBO-2 
 * NIM                  : 10117043
 * Deskripsi Program    : Program ini berisi perintah untuk menampilkan huruf 
 *                        kapital dan kecil pada sebuah kalimat
 * @author Acer
 */
public class PBO210117043Latihan27hurufbesarkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat;
        String besar;
        String kecil;

        Scanner scn = new Scanner(System.in);
        System.out.print("masukkan kalimat: ");
        kalimat = scn.nextLine(); //nextLine = lebih dari 1 kata

        besar = kalimat.toUpperCase();
        kecil = kalimat.toLowerCase();
        System.out.println("\n=======Hasil Formatting=======");
        System.out.println("huruf besar : " + besar);
        System.out.println("huruf kecil : " + kecil);

    }

}
