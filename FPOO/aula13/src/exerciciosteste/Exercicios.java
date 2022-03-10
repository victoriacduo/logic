package exerciciosteste;

import java.io.IOException;
import java.util.Random;

public class Exercicios {
	
	static Random rand = new Random();

	public static void main(String[] args) throws IOException {
		
		int x[][] = new int[5][5];
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 5; j++) {
					x[i][j] = rand.nextInt(100);
			
				}
			
			}
					
			for(int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++)
					System.out.print(x[i][j]+"\t");
				System.out.println();
			}

	}

}