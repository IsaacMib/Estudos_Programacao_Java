package Revision;

import java.util.Scanner;

public class Atividade2_27_2 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String animal;

		System.out.println(
				"Pense em um animal: ");

		System.out.println("O animal que voc� pensou � mam�fero?");
		String resposta1 = sc.next();
		if (resposta1.equalsIgnoreCase("sim")) {
			System.out.println("O animal que voc� pensou � quadr�pede?");
			String resposta2 = sc.next();
			if (resposta2.equalsIgnoreCase("sim")) {
				System.out.println("O animal que voc� pensou � carn�voro?");
				String resposta3 = sc.next();
				if (resposta3.equalsIgnoreCase("sim")) {
					animal = "le�o";
				} else {
					animal = "cavalo";
				}
			} else {
				System.out.println("O animal que voc� pensou � b�pede?");
				String resposta3 = sc.next();
				if (resposta3.equalsIgnoreCase("sim")) {
					System.out.println("O animal que voc� pensou � on�voro?");
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
			System.out.println("O animal que voc� pensou � uma ave?");
			String resposta2 = sc.next();
			if (resposta2.equalsIgnoreCase("sim")) {
				System.out.println("O animal que voc� pensou n�o voa?");
				String resposta3 = sc.next();
				if (resposta3.equalsIgnoreCase("sim")) {
					System.out.println("O animal que voc� pensou � tropical?");
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
				System.out.println("O animal que voc� pensou � um r�ptil?");
				String resposta3 = sc.next();
				if (resposta3.equalsIgnoreCase("sim")) {
					System.out.println("O animal que voc� pensou tem casco?");
					String resposta4 = sc.next();
					if (resposta4.equalsIgnoreCase("sim")) {
						animal = "tartaruga";
					} else {
						System.out.println("O animal que voc� pensou � carn�voro?");
						String resposta5 = sc.next();
						if (resposta5.equalsIgnoreCase("sim")) {
							animal = "crocodilo";
						} else {
							animal = "cobra";
						}
					}
				} else {
					System.out.println("Animal n�o identificado.");
					return;
				}
			}
		}

		System.out.println("O animal que voc� pensou � " + animal + ".");
	}

}
