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
public class pembelian extends Barang {
    static double harga_jual;
    
    public void setHargaJual(double hj) {
        harga_jual = hj;
    }
    public double getHargaJual () {
        return harga_jual;
    }
    //Jika getHargaPokok pada class barang menggunakan modifer public
    private double getHargaPokok () {
        return harga_pokok;
    }
    
    public static void main(String [] args) {
        pembelian proses = new pembelian();
        proses.setKodeBarang("B01");
        proses.setNamaBarang("Nokia 105");
        proses.setKodeSuplier("S01");
        proses.setHargaPokok(200000);
        
        proses.setHargaJual( ( 0.1 * proses.getHargaPokok() ) + proses.getHargaPokok());
        
        System.out.println("=== Penjualan Barang ===");
        System.out.println("Kode Barang : " + proses.getKodeBarang());
        System.out.println("Nama Barang : " + proses.getNamaBarang());
        //System.out.println("Kode Suplier : " + proses.getKodeSuplier());
        System.out.println("Harga Jual : " + proses.getHargaJual());        
    }
}
