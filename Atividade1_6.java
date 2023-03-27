package FPB;

import java.util.Scanner;

public class Atividade1_6 {
	
	private static Scanner scanner;
	
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		
		int numero = scanner.nextInt();
		int antecessor = numero - 1;
		int sucessor = numero + 1;
		
		System.out.println("Antecessor: " + antecessor);
		System.out.println("Sucessor: " + sucessor);
	    }}