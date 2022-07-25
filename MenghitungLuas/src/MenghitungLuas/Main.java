/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MenghitungLuas;

import java.util.Scanner;

/**
 *
 * @author LAB
 */

public class Main {
    public static void main(String[] args) {
        int pilihan;
        String ulg = "y";
        while (ulg.equals ("y")) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("### MENU UTAMA ###");
        System.out.println();
        System.out.println("1. Menghitung Luas Persegi Panjang");
        System.out.println("2. Menghitung Luas Bujur Sangkar");
        System.out.println("3. Menghitung Luas Lingkaran");
        System.out.println("=================================================");
        System.out.print("Silahkan Pilih Menu (1/2/3) : ");
        pilihan = keyboard.nextInt();

        switch (pilihan) {
            case 1:
                int panjang, lebar;
                System.out.println("=================================================");
                System.out.println("Menghitung Luas Persegi Panjang");
                System.out.println();
                System.out.print("Masukkan Panjang : ");
                panjang = keyboard.nextInt();
                System.out.print("Masukkan Lebar : ");
                lebar = keyboard.nextInt();
                PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
                pp.luas();
                pp.tampil();
                System.out.print("Apakah anda ingin mengulang? (y/n) : ");
            ulg = keyboard.next();
            System.out.println("=================================================");
                break;
        
            case 2:
                int s;
                System.out.println("=================================================");
                System.out.println("Menghitung Luas Bujur Sangkar");
                System.out.println();
                System.out.print("Masukkan Sisi : ");
                s = keyboard.nextInt();
                BujurSangkar bujursangkar = new BujurSangkar(s);
                bujursangkar.luas();
                bujursangkar.tampil();
                System.out.print("Apakah anda ingin mengulang? (y/n) : ");
            ulg = keyboard.next();
            System.out.println("=================================================");
                break;
                
             case 3:
                int r;
                System.out.println("=================================================");
                System.out.println("Menghitung Luas Lingkaran");
                System.out.println();
                System.out.print("Masukkan Jari - jari : ");
                r = keyboard.nextInt();
                Lingkaran lingkaran = new Lingkaran(r);
                lingkaran.luas();
                lingkaran.tampil();
               System.out.print("Apakah anda ingin mengulang? (y/n) : ");
            ulg = keyboard.next();
            System.out.println("=================================================");
                break;
        
            default:
            System.out.println("=================================================");
            System.out.println("Pilihan Anda tidak terdaftar");
            System.out.println();
            System.out.print("Apakah anda ingin mengulang? (y/n) : ");
            ulg = keyboard.next();
            System.out.println("=================================================");
                break;
            }
        }
    }
} 