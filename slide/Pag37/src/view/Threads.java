package view;

import java.util.concurrent.Semaphore;

import controller.Carros;

public class Threads {

	public static void main(String[] args) {
Semaphore semaforo = new Semaphore(1);
		for (int threadId = 1; threadId <= 4; threadId++) {
			
			Thread threadP = new Carros(threadId,semaforo);
			threadP.start();
		}
		
	}

}
