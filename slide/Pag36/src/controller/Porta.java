package controller;
import java.util.concurrent.Semaphore;

public class Porta extends Thread {
	private int threadId;
	private Semaphore semaforo;
	private static int c=200;
	public Porta(int threadId, Semaphore semaforo) {
		this.threadId = threadId;
		this.semaforo = semaforo;
	}
	public void run() {
		login();
	}
	
	
	public void login() {
		int p=0;
		int t=0;
		t = (int) ((int) ((Math.random() * 3)));
		
		if (c<200) {
			p = (int) ((int) ((Math.random() * 3)+4));
			c=c-p;
			System.out.println( threadId + " andou" + p);
			
		}else {
				try {
					semaforo.acquire(t);
					System.out.println("A Pessoa " + threadId + " passou pela porta.");
				}catch (InterruptedException e) {
					e.printStackTrace();
				}finally {
					semaforo.release();
				}
				
		}	
	}
}