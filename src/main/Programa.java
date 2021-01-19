package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("ENTER CLIENT DATA:");
		System.out.print("Name:");
		String name = teclado.nextLine();
		System.out.print("Email:");
		String email = teclado.nextLine();
		System.out.print("birth:");
		Date birth = sdf.parse(teclado.next());

		Client cliente = new Client(name, email, birth);

		System.out.println("ENTER ORDER DATE:");
		System.out.print("status:");
		OrderStatus status = OrderStatus.valueOf(teclado.next());

		System.out.print("How many items to this order? ");
		int n = teclado.nextInt();

		Date moment = new Date();

		Order order = new Order(moment, status, cliente);
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name:");
			teclado.nextLine();
			String productName = teclado.nextLine();
			System.out.print("Product price: ");
			Double price = teclado.nextDouble();
			System.out.print("Quantity: ");
			teclado.nextLine();
			Integer productQuantity = teclado.nextInt();

			Product product = new Product(productName, price);
			OrderItem it = new OrderItem(productQuantity, price, product);

			order.addItem(it);

		}
		System.out.println(order);

	}

}
