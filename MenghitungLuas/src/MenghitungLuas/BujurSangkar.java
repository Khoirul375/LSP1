/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MenghitungLuas;

/**
 *
 * @author LAB
 */
public class BujurSangkar {
    int s, luas;

    BujurSangkar(int _s) {
        s = _s;
    }

    public int luas() {
        luas = s * s;
        return luas;
    }

    public void tampil() {
        System.out.println();
        System.out.println("Sisi = " + s);
        System.out.println("Luas Bujur Sangkar Adalah = " + luas);
        System.out.println("=================================================");
    }
}