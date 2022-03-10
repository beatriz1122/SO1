/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

public class MinhaRunnable implements Runnable {

    public void run() { 
        String name = Thread.currentThread().getName();
        System.out.println(name);
        
    }
}
