/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Act2punto2;

/**
 *
 * @author Windows
 */
public class Main {
    public static void main(String[] args) {
        Pin hiloPin = new Pin();
        Pon hiloPon = new Pon();

        hiloPin.start();
        hiloPon.start();
    }
}

// No se visualizan de manera ordenada aunque tu pongas las dos funciones ordenadas y una vez