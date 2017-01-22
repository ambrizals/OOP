
/**
 *
 * @author Ambrizal
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author Ambrizal
 */
public class Barang {
    /* Variable */
    String kode_barang;
    String nama_barang;
    double hargamodal_barang;
    
    /* Konstruktor, Parameter */
    Barang (String kdbrg, String nbrg, double hmbrg) {
        this.kode_barang = kdbrg;
        this.nama_barang = nbrg;
        this.hargamodal_barang = hmbrg;
    }
    
    /* Method */
    public static void main(String [] args) {
        /* Object */
        Barang tambah = new Barang("BRG01", "Nokia 105", 250000);
        
        System.out.println("=== Barang Masuk ===");
        System.out.println("Nama Barang : " + tambah.kode_barang);
        System.out.println("Nama Barang : " + tambah.nama_barang);
        System.out.println("Harga Modal Barang : " + tambah.hargamodal_barang);
    }
}


