package FPB;

import java.util.Scanner;

public class Atividade1_7 {
	
	private static Scanner scanner;
	
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		
		String nome = scanner.nextLine();
		
		System.out.print("Digite o seu peso: ");
		
		double peso = scanner.nextDouble();
		
		System.out.print("Digite a sua altura: ");
		
		double altura = scanner.nextDouble();
		double imc = peso / (altura * altura);
		
		System.out.println("Nome: " + nome);
		System.out.println("Peso: " + peso + " kg");
		System.out.println("Altura: " + altura + " m");
		System.out.println("IMC: " + imc);
	    }}