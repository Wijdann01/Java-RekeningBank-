/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rekeningbank;

/**
 *
 * @author Decarabia
 */
public class MainBank {
    public static void main(String[] args) {
        System.out.println("=== MEMBUAT OBJEK REKENING ===");
        // Buat 2 objek rekening
        RekeningBank rek1 = new RekeningBank("10", "Roki", 500000);
        RekeningBank rek2 = new RekeningBank("12", "Ncep", 200000);

        System.out.println("=== SALDO AWAL ===");
        System.out.println("Saldo " + rek1.getNamaRekening() + ": Rp " + rek1.getSaldo());
        System.out.println("Saldo " + rek2.getNamaRekening() + ": Rp " + rek2.getSaldo());

        System.out.println("=== SKENARIO 1: TRANSFER MELEBIHI SALDO (UJI VALIDASI) ===");
        // Coba transfer 1.000.000 dari rek1 (saldo hanya 500.000)
        rek1.transfer(501000, rek2);

        System.out.println("=== SKENARIO 2: TRANSFER BERHASIL ===");
        // Transfer 170.000 dari rek1 ke rek2
        rek1.transfer(170000, rek2);

        System.out.println("=== SALDO AKHIR ===");
        System.out.println("Saldo Akhir " + rek1.getNamaRekening() + ": Rp " + rek1.getSaldo());
        System.out.println("Saldo Akhir " + rek2.getNamaRekening() + ": Rp " + rek2.getSaldo());

        System.out.println("=== TOTAL REKENING TERBUAT ===");
        // Mengakses variabel static langsung dari nama class
        System.out.println("Total Rekening Terbuat: " + RekeningBank.totalRekening);
    }
}
