/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rekeningbank;

/**
 *
 * @author Decarabia
 */
public class RekeningBank {
    
    private String noRekening;
    private String namaRekening;
    private double saldo;
    
    public static int totalRekening = 0;
    
    public RekeningBank(String noRek, String namaRek, double saldoAwal){
        this.noRekening = noRek;
        this.namaRekening = namaRek;
        
        
        if(saldoAwal >= 50000){
            this.saldo = saldoAwal;
        }else{
            System.out.println("ERROR : Ancok Saldo awal minimal 50k, Saldo di reset ke 0");
        }
        
        totalRekening++;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(double saldo){
        if(saldo >= 0){
            this.saldo = saldo;
        }else {
            System.out.println("Error : saldo tidak boleh kosong atau negatif");
        }
    }
    
    public String getNoRekening(){
        return this.noRekening; 
    }
    
    public String getNamaRekening(){
        return this.namaRekening;
    }
    
    public void transfer(double nominal, RekeningBank tujuan){
        if (nominal <= 0){
            System.out.println("Error : Saldo harus lebih dari 0.");
        }else if (nominal > this.saldo){
            System.out.println("Error Transfer gagal cuk saldo " +this.namaRekening+ " Saldo Tidak Cukup");
        }else{
            this.saldo -= nominal;
            tujuan.saldo += nominal;
            System.out.println("Transfer Rp : " +nominal+ " dari " +this.namaRekening + " ke " + tujuan.getNamaRekening() + " Berhasil");
        }
    }
    
}
