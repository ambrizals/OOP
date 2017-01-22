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
public class LuasBangun { 
    public void persegi (int a){
        System.out.println("Luas Bangun Persegi = "+ (a * a));
    } 

    public void segitiga (int a, int b){
        System.out.println("Luas Bangun Segitiga = " + (0.5 * (a * b)));
    } 

    public void persegipanjang (int a, int b){
        System.out.println("Luas Bangun Persegi Panjang = "+ (a * b));
    } 
}