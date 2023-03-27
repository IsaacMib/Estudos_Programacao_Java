package FPB;

import java.util.Scanner;

public class Atividade1_1 {
	
	private static Scanner scanner;
	
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		System.out.print("Digite o Primeiro Número: ");
		
		double num1 = scanner.nextDouble();
		System.out.print("Digite o Segundo Número: ");
		
		double num2 = scanner.nextDouble();
		double sum = num1 + num2;
		double difference = num1 - num2;
		double product = num1 * num2;
		double quotient = num1 / num2;
		
		System.out.println("Soma: " + sum);
		System.out.println("Subtração: " + difference);
		System.out.println("Multiplicação: " + product);
		System.out.println("Divisão: " + quotient);
		    }}