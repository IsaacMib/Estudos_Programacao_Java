package FPB;

import java.util.Scanner;

public class Atividade1_3 {
	private static Scanner scanner;
	
public static void main(String[] args) {
	
		scanner = new Scanner(System.in);
		
		System.out.print("Insira a temperatura em Celsius: ");
		
		double celsius = scanner.nextDouble();
	    double fahrenheit = (celsius * 9 / 5) + 32;
	    
	    System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
	    }}