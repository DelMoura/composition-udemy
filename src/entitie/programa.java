package entitie;

import java.util.Scanner;

import classe.Quartos;

public class programa {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("QUANTOS QUARTOS SERÁ RESERVADO?: ");

		int reserva = teclado.nextInt();

		int disponivel = 0;

		Quartos vetor[] = new Quartos[10];

		for (int i = 0; i < reserva; i++) {
			disponivel = i + 1;
			System.out.print("Rent#" + disponivel + "\n");

			teclado.nextLine();

			System.out.print("Name: ");
			String nome = teclado.nextLine();

			System.out.print("Email: ");
			String email = teclado.nextLine();

			System.out.print("Rom: ");
			int rom = teclado.nextInt();

			vetor[rom] = new Quartos(nome, email);

		}

		System.out.println("Busy Rooms: ");
		for (int j = 0; j < 10; j++) {
			if (vetor[j] != null) {
				System.out.println(j + ": " + vetor[j]);
			}

		}

	}

}
