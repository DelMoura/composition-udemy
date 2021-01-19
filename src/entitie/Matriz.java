package entitie;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] vetor = new int[10];
		int count = 0;

		int n = teclado.nextInt();
		vetor[0] = n;

		int contador = 0;
		int segundoContador = 0;
		int repetidor = 0;
		int aux = 0;
		for (int i = 1; i <= 9; i++) {
			int numeros = teclado.nextInt();
			aux = numeros;
			vetor[i] = numeros;
			contador++;
			for (int j = 0; j < contador; j++) {
				if (vetor[j] == numeros) {
					segundoContador++;
					repetidor = vetor[j];

				}

			}

		}

		System.out.println(repetidor);
	}
}