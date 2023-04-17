package FPB;

import java.util.Scanner;

public class Q01 {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		int valor1, valor2, resultado = 0;
		String op;

		do {
			System.out.print("Digite o primeiro número: ");
			valor1 = entrada.nextInt();

			System.out.print("Digite o segundo número: ");
			valor2 = entrada.nextInt();

			System.out.print("Digite a operação a ser realizado: ");
			op = entrada.next();

			switch (op) {
			case "+":
				resultado = valor1 + valor2;
				System.out.println("O Resultado da Soma : " + resultado);
				break;

			case "-":
				resultado = valor1 - valor2;
				System.out.println("O Resultado da Subtração : " + resultado);
				break;

			case "/":
				resultado = valor1 / valor2;
				System.out.println("O Resultado da Divisão : " + resultado);
				break;

			case "*":
				resultado = valor1 * valor2;
				System.out.println("O Resultado da Subtração : " + resultado);
				break;

			default:
				System.out.println("Valor Negado!");

			}

			if (resultado > 0) {
				System.out.println("Resultado Maior que zero");
			} else if (resultado < 0) {
				System.out.println("Resultado Menor que zero");
			} else {
				System.out.println("Resultado igual a zero");
			}

			System.out.println("Deseja Continuar ?");
			valor1 = entrada.nextInt();
		} while (valor1 != -999);
		System.out.println("Fim");

		entrada.close();

	}
}
