/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Act2punto2;

/**
 *
 * @author Windows
 */
public class Pin extends Thread {
    @Override
    public void run(){
        while (true) {
            System.out.println("PIN");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
