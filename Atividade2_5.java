package FPB;

import java.util.Scanner;

public class Atividade2_5 {
	
    private static Scanner scanner;

	public static void main(String[] args) {
        scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println(numero + " é um número par.");
        } else {
            System.out.println(numero + " é um número ímpar.");
        }}}