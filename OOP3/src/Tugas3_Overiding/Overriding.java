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
public class Overriding {
    static int cnsts, cnstc;
    public static void main(String[] args) {
        server status_s = new server();
        channel status_c = new channel();
        cnsts = 1;
        cnstc = 0;
        
        if (cnsts == 1) {
            status_s.online();
            if (cnstc == 1) {
                status_c.online();
            }
            else {
                status_c.offline();
            }
        }
        else {
            status_s.offline();
        }
    }
}
