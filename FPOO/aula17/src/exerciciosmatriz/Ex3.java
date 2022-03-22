package exerciciosmatriz;

public class Ex3 {	

	public static void main(String[] args) {
		
		// 3 Leia uma matriz de 3 x 3 elementos. Calcule e imprima a sua transposta
		
		int matriz1[][] = {{3, 5, 7}, {1, 2, 9}, {4, 6, 8}};
		
		System.out.println("Matriz: ");
		for(int i = 0; i < matriz1.length; i++) {
			for(int j = 0; j < matriz1[0].length; i++) {
				System.out.println("\t" + matriz1[i][j]);
			}
			
			System.out.println();
		}
		
		int linhas = matriz1.length;
		int colunas = matriz1[0].length;
		int matriz2[][] = new int[colunas][linhas];
		
		for(int i = 0; i < matriz1.length; i++) {
			for(int j = 0; j < matriz1[0].length; i++) {
				matriz2[j][i] = matriz1[i][j];
			}
		}
		
		System.out.println("Matriz transposta: ");
		for(int i = 0; i < matriz2.length; i++) {
			for(int j = 0; j < matriz2[0].length; i++) {
				System.out.println("\t" + matriz2[i][j]);
			}
			
			System.out.println();
		}
	}
}