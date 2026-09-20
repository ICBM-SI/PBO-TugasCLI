/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class BajuProfesi {
    public String nama;
    public String profesi;
    public int harga;

    public BajuProfesi(String nama, String profesi, int harga) {
        this.nama = nama;
        this.profesi = profesi;
        this.harga = harga;
    }

    public void tampilkan() {
        System.out.println("Nama Baju : " + nama);
        System.out.println("Profesi   : " + profesi);
        System.out.println("Harga     : Rp" + harga);
    }
}
