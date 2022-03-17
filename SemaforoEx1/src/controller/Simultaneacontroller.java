package controller;
import java.util.concurrent.Semaphore;

public class Simultaneacontroller extends Thread {
	private int threadId;
	private Semaphore semaforo;
	private static int i= 100;
	
	public Simultaneacontroller(int threadId, Semaphore semaforo,int i) {
		this.threadId = threadId;
		this.semaforo = semaforo;
	}
	public void run() {
		login();
	}
	
	
	public void login() {
		int p=0;
		int s=0;
		int t=0;
		t = (int) ((int) ((Math.random() * 201)));
		

			System.out.println("A Pessoa " + threadId + " está fazendo a login.");
		
		if (t<100) {
			s = (int) ((int) ((Math.random() * 301)));
			System.out.println( threadId + " Login concluido.");
			
			if(s < 250) {
				p = (int) ((int) ((Math.random() * 4)+1));
				try {
					semaforo.acquire();
					if (p<i) {
					i=i-p;
					System.out.println( threadId + " ingressos: " + p + " ingressos restantes: "+i);
				}
					
			else {System.out.println(threadId + " indisponibilidade dos ingressos.");}
				
				}catch (InterruptedException e) {
					e.printStackTrace();
				}finally {
					semaforo.release();
				}
				System.out.println("Compra finalizada.");

				}
				
				else {System.out.println(threadId + " O seu tempo de sessão estourou."); }
				
			}
			
			else {System.out.println(threadId + "  timeout.");}
			
		}
	}