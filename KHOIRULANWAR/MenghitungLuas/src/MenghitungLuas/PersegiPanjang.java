/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MenghitungLuas;

/**
 *
 * @author LAB
 */
public class PersegiPanjang {
    int panjang, lebar, luas;

    PersegiPanjang(int _panjang, int _lebar) {
        panjang = _panjang;
        lebar = _lebar;
    }

    public int luas() {
        luas = panjang * lebar;
        return luas;
    }

    public void tampil() {
        System.out.println();
        System.out.println("Panjang = " + panjang);
        System.out.println("Lebar = " + lebar);
        System.out.println("Luas Persegi Panjang Adalah = " + luas);
        System.out.println("=================================================");
    }
}