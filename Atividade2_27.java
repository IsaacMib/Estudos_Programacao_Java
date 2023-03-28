package Revision;

import java.util.Scanner;

public class Atividade2_27 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		System.out.println(
				"Pense em um animal: leão, cavalo, homem, macaco, morcego, baleia, avestruz, pinguim, águia, tartaruga, crocodilo ou cobra.");
		System.out.print("O animal que você pensou é um mamífero? (s/n): ");
		String resposta = input.nextLine().toLowerCase();

		if (resposta.equalsIgnoreCase("s")) {
			System.out.print("O animal que você pensou é quadrúpede? (s/n): ");
			resposta = input.nextLine().toLowerCase();

			if (resposta.equalsIgnoreCase("s")) {
				System.out.print("O animal que você pensou é carnívoro? (s/n): ");
				resposta = input.nextLine().toLowerCase();

				if (resposta.equalsIgnoreCase("s")) {
					System.out.println("O animal que você pensou é um leão.");
				} else {
					System.out.println("O animal que você pensou é um cavalo.");
				}
			} else {
				System.out.print("O animal que você pensou é bípede? (s/n): ");
				resposta = input.nextLine().toLowerCase();

				if (resposta.equalsIgnoreCase("s")) {
					System.out.print("O animal que você pensou é onívoro? (s/n): ");
					resposta = input.nextLine().toLowerCase();

					if (resposta.equalsIgnoreCase("s")) {
						System.out.println("O animal que você pensou é um homem.");
					} else {
						System.out.println("O animal que você pensou é um macaco.");
					}
				} else {
					System.out.println("O animal que você pensou é um morcego.");
				}
			}
		} else {
			System.out.print("O animal que você pensou é uma ave? (s/n): ");
			resposta = input.nextLine().toLowerCase();

			if (resposta.equalsIgnoreCase("s")) {
				System.out.print("O animal que você pensou é uma ave não-voadora? (s/n): ");
				resposta = input.nextLine().toLowerCase();

				if (resposta.equalsIgnoreCase("s")) {
					System.out.print("O animal que você pensou é uma ave tropical? (s/n): ");
					resposta = input.nextLine().toLowerCase();

					if (resposta.equalsIgnoreCase("s")) {
						System.out.println("O animal que você pensou é uma avestruz.");
					} else {
						System.out.println("O animal que você pensou é um pinguim.");
					}
				} else {
					System.out.print("O animal que você pensou é uma ave de rapina? (s/n): ");
					resposta = input.nextLine().toLowerCase();

					if (resposta.equalsIgnoreCase("s")) {
						System.out.println("O animal que você pensou é uma águia.");
					} else {
						System.out.println("O animal que você pensou é um pato.");
					}
				}
			} else {
				System.out.print("O animal que você pensou é um réptil? (s/n): ");
				resposta = input.nextLine().toLowerCase();

				if (resposta.equalsIgnoreCase("s")) {
					System.out.print("O animal que você pensou tem casco? (s/n): ");
					resposta = input.nextLine().toLowerCase();

					if (resposta.equalsIgnoreCase("s")) {
						System.out.println("O animal que você pensou é uma tartaruga.");

					} else {
						System.out.println("O animal que você pensou é carnivoro? (s/n): ");
						resposta = input.nextLine().toLowerCase();

						if (resposta.equalsIgnoreCase("s")) {
							System.out.println("O animal que você pensou é um Crocodilo.");
						} else {
							System.out.println("O animal que você pensou é uma Cobra");
						}
					}
				} else {
					System.out.println("Animal não identificado.");
					return;
				}
			}
		}
	}
}