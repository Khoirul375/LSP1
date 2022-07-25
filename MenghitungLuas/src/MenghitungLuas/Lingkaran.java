/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MenghitungLuas;

/**
 *
 * @author LAB
 */
public class Lingkaran {
    int r;
    float luas;

    Lingkaran(int _r) {
        r = _r;
    }

    public float luas() {
        luas = 3.14f * r * r;
        return luas;
    }

    public void tampil() {
        System.out.println();
        System.out.println("Jari - jari = " + r);
        System.out.println("Luas Lingkaran Adalah = " + luas);
        System.out.println("=================================================");
    }
}