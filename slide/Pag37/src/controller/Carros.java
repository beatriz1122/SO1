package controller;
import java.util.concurrent.Semaphore;

public class Carros extends Thread {
	private int threadId;
	private Semaphore semaforo;
	public Carros(int threadId, Semaphore semaforo) {
		this.threadId = threadId;
		this.semaforo = semaforo;
	}
	public void run() {
		login();
	}
	
	
	public void login() {		

				try {
					System.out.println("Carro " + threadId + " chagou ao cruzamento.");
					semaforo.acquire();
					if(threadId == 1) {System.out.println("Carro " + threadId + " foi para baixo.");}
					else {if(threadId == 2) {System.out.println("Carro " + threadId + " foi para esquerda.");}
					else {if(threadId == 3) {System.out.println("Carro " + threadId + " foi para direita.");}
					else {System.out.println("Carro " + threadId + " foi para cima.");
					}	
				}
			}
				}catch (InterruptedException e) {
					e.printStackTrace();
				}finally {
					semaforo.release();
		}	System.out.println("Carro " + threadId + " passou.");			
	} 
}
