package FPB;

import java.util.Scanner;

public class Atividade1_2 {
	private static Scanner scanner;
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		System.out.print("Insira a temperatura em Fahrenheit: ");
		
		double fahrenheit = scanner.nextDouble();
		double celsius = (fahrenheit - 32) * 5 / 9;
		
		System.out.println("Temperatura em Celsius: " + celsius);
		}}