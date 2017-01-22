/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author Ambrizal
 */
public class Barang {
    String kode_barang;
    String nama_barang;
    String kode_suplier;
    static double harga_pokok;
    
    public void setKodeBarang(String kbrg) {
        kode_barang = kbrg;
    }
    public void setNamaBarang(String nbrg) {
        nama_barang = nbrg;
    }
    public void setKodeSuplier(String ksp) {
        kode_suplier = ksp;
    }
    public void setHargaPokok (double hpk) {
        harga_pokok = hpk;
    }
    public String getKodeBarang () {
        return kode_barang;
    }
    public String getNamaBarang() {
        return nama_barang;
    }
    public String getKodeSuplier() {
        return kode_suplier;
    }
    private double getHargaPokok() {
        return harga_pokok;
    }
    
    public static void main (String [] args) {
        Barang tambah = new Barang();
        Barang pembelian = new Barang();
        
        tambah.setKodeBarang("B01");
        tambah.setNamaBarang("Nokia 105");
        tambah.setKodeSuplier("S01");
        tambah.setHargaPokok(200000);
        
        System.out.println("=== Barang Masuk ===");
        System.out.println("Kode Barang : " + tambah.getKodeBarang());
        System.out.println("Nama Barang : " + tambah.getNamaBarang());
        System.out.println("Kode Suplier : " + tambah.getKodeSuplier());
        System.out.println("Harga Pokok : " + tambah.getHargaPokok());
    }
}
