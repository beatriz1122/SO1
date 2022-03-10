


public class vetor {
	public static void main(String[] args) {
		int[] vetor = new int[1000];
		
		for(int i=0; i < 1000; i++)
			vetor[i] = (int) (Math.random() * 100)+1;
		
		
		new VetorThread(vetor, 1).start();
		new VetorThread(vetor, 2).start();
		
	}
}