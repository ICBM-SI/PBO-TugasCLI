/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sewabajuprofesi;
import java.util.Scanner;
import model.BajuKhusus;
import model.BajuProfesi;

public class SewaBajuProfesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BajuProfesi baju = new BajuKhusus(
            "Seragam Dokter",
            "Dokter",
            50000
        );

        System.out.println("=== PENYEWAAN BAJU PROFESI ===");

        baju.tampilkan();

        System.out.print("Nama Penyewa : ");
        String namaPenyewa = input.nextLine();

        System.out.print("Lama Sewa (hari) : ");
        int lamaSewa = input.nextInt();

        int total = baju.harga * lamaSewa;

        System.out.println("=== STRUK PENYEWAAN ===");
        System.out.println("Nama Penyewa : " + namaPenyewa);
        System.out.println("Baju         : " + baju.nama);
        System.out.println("Profesi      : " + baju.profesi);
        System.out.println("Lama Sewa    : " + lamaSewa + " hari");
        System.out.println("Total        : Rp" + total);

        input.close();
    }
}