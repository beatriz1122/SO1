
package ex2;

import java.util.Random;

public class Ex2 {
    
    public static void main(String[] args) {	
    int matrix[][] =  new int [3][5];
    Random random = new Random();
    System.out.println("Matrizes:");
	for (int i = 0; i <= 0; i++){
            for( int j = 0; j <= 4; j++){
            matrix[i][j] = random.nextInt(10);
            System.out.println(matrix[i][j] +" ");}
System.out.println();
}

    }
}
 
     