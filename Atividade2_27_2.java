package Revision;

import java.util.Scanner;

public class Atividade2_27_2 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String animal;

		System.out.println(
				"Pense em um animal: ");

		System.out.println("O animal que você pensou é mamífero?");
		String resposta1 = sc.next();
		if (resposta1.equalsIgnoreCase("sim")) {
			System.out.println("O animal que você pensou é quadrúpede?");
			String resposta2 = sc.next();
			if (resposta2.equalsIgnoreCase("sim")) {
				System.out.println("O animal que você pensou é carnívoro?");
				String resposta3 = sc.next();
				if (resposta3.equalsIgnoreCase("sim")) {
					animal = "leão";
				} else {
					animal = "cavalo";
				}
			} else {
				System.out.println("O animal que você pensou é bípede?");
				String resposta3 = sc.next();
				if (resposta3.equalsIgnoreCase("sim")) {
					System.out.println("O animal que você pensou é onívoro?");
					String resposta4 = sc.next();
					if (resposta4.equalsIgnoreCase("sim")) {
						animal = "homem";
					} else {
						animal = "macaco";
					}
				} else {
					animal = "morcego";
				}
			}
		} else {
			System.out.println("O animal que você pensou é uma ave?");
			String resposta2 = sc.next();
			if (resposta2.equalsIgnoreCase("sim")) {
				System.out.println("O animal que você pensou não voa?");
				String resposta3 = sc.next();
				if (resposta3.equalsIgnoreCase("sim")) {
					System.out.println("O animal que você pensou é tropical?");
					String resposta4 = sc.next();
					if (resposta4.equalsIgnoreCase("sim")) {
						animal = "avestruz";
					} else {
						animal = "pinguim";
					}
				} else {
					animal = "pato";
				}
			} else {
				System.out.println("O animal que você pensou é um réptil?");
				String resposta3 = sc.next();
				if (resposta3.equalsIgnoreCase("sim")) {
					System.out.println("O animal que você pensou tem casco?");
					String resposta4 = sc.next();
					if (resposta4.equalsIgnoreCase("sim")) {
						animal = "tartaruga";
					} else {
						System.out.println("O animal que você pensou é carnívoro?");
						String resposta5 = sc.next();
						if (resposta5.equalsIgnoreCase("sim")) {
							animal = "crocodilo";
						} else {
							animal = "cobra";
						}
					}
				} else {
					System.out.println("Animal não identificado.");
					return;
				}
			}
		}

		System.out.println("O animal que você pensou é " + animal + ".");
	}

}
