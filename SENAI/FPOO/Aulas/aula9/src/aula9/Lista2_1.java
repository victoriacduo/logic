package aula9;

public class Lista2_1 {

	public static void main(String[] args) {
		mostrar();

	}

	public static void mostrar() {
		int[] teste = new int[5];

		teste[0] = 2;
		teste[1] = 4;
		teste[2] = 5;
		teste[3] = 6;
		teste[4] = 8;

		System.out.println("Indice\tValor");

		for (int i = 0; i < 5; i++) {
			System.out.println(i + "\t" + teste[i]);

		}
	}

}