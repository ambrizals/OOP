/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3_Overloading;

/**
 *
 * @author Ambrizal
 */
public class Hitung {
    public static void main(String[] args) {
        LuasBangun hitung  = new LuasBangun();   
        
        hitung.persegi(3);
        hitung.segitiga(4,5);
        hitung.persegipanjang(4, 9);
    }
}
