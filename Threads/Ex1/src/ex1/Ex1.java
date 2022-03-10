/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author beatr
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        MinhaRunnable minhaRunnable1 = new MinhaRunnable();
        MinhaRunnable minhaRunnable2 = new MinhaRunnable();
        MinhaRunnable minhaRunnable3 = new MinhaRunnable();
        MinhaRunnable minhaRunnable4 = new MinhaRunnable();
        MinhaRunnable minhaRunnable5 = new MinhaRunnable();
        
        Thread t1 = new Thread(minhaRunnable1, " 1");
        Thread t2 = new Thread(minhaRunnable2, " 2");
        Thread t3 = new Thread(minhaRunnable2, " 3");
        Thread t4 = new Thread(minhaRunnable2, " 4");
        Thread t5 = new Thread(minhaRunnable2, " 5");
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
    
}
