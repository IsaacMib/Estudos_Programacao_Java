package Revision;

import java.util.Scanner;

public class Atividade2_27 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		System.out.println(
				"Pense em um animal: le�o, cavalo, homem, macaco, morcego, baleia, avestruz, pinguim, �guia, tartaruga, crocodilo ou cobra.");
		System.out.print("O animal que voc� pensou � um mam�fero? (s/n): ");
		String resposta = input.nextLine().toLowerCase();

		if (resposta.equalsIgnoreCase("s")) {
			System.out.print("O animal que voc� pensou � quadr�pede? (s/n): ");
			resposta = input.nextLine().toLowerCase();

			if (resposta.equalsIgnoreCase("s")) {
				System.out.print("O animal que voc� pensou � carn�voro? (s/n): ");
				resposta = input.nextLine().toLowerCase();

				if (resposta.equalsIgnoreCase("s")) {
					System.out.println("O animal que voc� pensou � um le�o.");
				} else {
					System.out.println("O animal que voc� pensou � um cavalo.");
				}
			} else {
				System.out.print("O animal que voc� pensou � b�pede? (s/n): ");
				resposta = input.nextLine().toLowerCase();

				if (resposta.equalsIgnoreCase("s")) {
					System.out.print("O animal que voc� pensou � on�voro? (s/n): ");
					resposta = input.nextLine().toLowerCase();

					if (resposta.equalsIgnoreCase("s")) {
						System.out.println("O animal que voc� pensou � um homem.");
					} else {
						System.out.println("O animal que voc� pensou � um macaco.");
					}
				} else {
					System.out.println("O animal que voc� pensou � um morcego.");
				}
			}
		} else {
			System.out.print("O animal que voc� pensou � uma ave? (s/n): ");
			resposta = input.nextLine().toLowerCase();

			if (resposta.equalsIgnoreCase("s")) {
				System.out.print("O animal que voc� pensou � uma ave n�o-voadora? (s/n): ");
				resposta = input.nextLine().toLowerCase();

				if (resposta.equalsIgnoreCase("s")) {
					System.out.print("O animal que voc� pensou � uma ave tropical? (s/n): ");
					resposta = input.nextLine().toLowerCase();

					if (resposta.equalsIgnoreCase("s")) {
						System.out.println("O animal que voc� pensou � uma avestruz.");
					} else {
						System.out.println("O animal que voc� pensou � um pinguim.");
					}
				} else {
					System.out.print("O animal que voc� pensou � uma ave de rapina? (s/n): ");
					resposta = input.nextLine().toLowerCase();

					if (resposta.equalsIgnoreCase("s")) {
						System.out.println("O animal que voc� pensou � uma �guia.");
					} else {
						System.out.println("O animal que voc� pensou � um pato.");
					}
				}
			} else {
				System.out.print("O animal que voc� pensou � um r�ptil? (s/n): ");
				resposta = input.nextLine().toLowerCase();

				if (resposta.equalsIgnoreCase("s")) {
					System.out.print("O animal que voc� pensou tem casco? (s/n): ");
					resposta = input.nextLine().toLowerCase();

					if (resposta.equalsIgnoreCase("s")) {
						System.out.println("O animal que voc� pensou � uma tartaruga.");

					} else {
						System.out.println("O animal que voc� pensou � carnivoro? (s/n): ");
						resposta = input.nextLine().toLowerCase();

						if (resposta.equalsIgnoreCase("s")) {
							System.out.println("O animal que voc� pensou � um Crocodilo.");
						} else {
							System.out.println("O animal que voc� pensou � uma Cobra");
						}
					}
				} else {
					System.out.println("Animal n�o identificado.");
					return;
				}
			}
		}
	}
}