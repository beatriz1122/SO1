package view;

import java.util.concurrent.Semaphore;

import controller.Porta;

public class Threads {

	public static void main(String[] args) {
Semaphore semaforo = new Semaphore(1);
int c=200;
		for (int threadId = 1; threadId <= 4; threadId++) {
			
			Thread threadP = new Porta(threadId,semaforo);
			threadP.start();
		}
		
	}

}

