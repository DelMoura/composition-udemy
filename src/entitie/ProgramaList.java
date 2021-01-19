package entitie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classe.Empregados;

public class ProgramaList {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("How many employess will be registered?: ");

		List<Empregados> list = new ArrayList<>();

		int registro = teclado.nextInt();

		for (int i = 0; i < registro; i++) {
			System.out.println("");
			System.out.println("Employee: #" + (i + 1));
			System.out.print("ID: ");
			teclado.nextLine();
			int id = teclado.nextInt();

			System.out.print("NAME: ");
			teclado.nextLine();
			String nome = teclado.nextLine();

			System.out.print("SALARY:");
			double salario = teclado.nextDouble();

			Empregados emp = new Empregados(id, nome, salario);

			list.add(emp);

		}

		System.out.println("");

		System.out.println("Enter the employee id that will have salary increase: ");

		Integer empregado = teclado.nextInt();
		Integer position = local(list, empregado);

		if (position != null) {

			System.out.print("Enter the percentage:");

			Double porcentagem = teclado.nextDouble();
			list.get(position).increaseSalary(porcentagem);

		} else {
			System.out.print("This id does not exist!");

			System.out.println("");

		}

		System.out.println("");
		System.out.println("List of Employees: ");
		for (Empregados obj : list) {
			System.out.println(obj);

		}

	}

	public static Integer local(List<Empregados> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}

		}
		return null;
	}

}
