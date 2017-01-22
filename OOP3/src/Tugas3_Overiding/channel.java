/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3_Overiding;

/**
 *
 * @author Ambrizal
 */
public class channel extends server {
     //overriding method parent class
    public void online(){
        System.out.println("Channel Server Online !");
    }
    public void offline(){
        System.out.println("Channel Server Offline");
    } 
}
