package FPB;

import java.util.Scanner;

public class Atividade2_6 {
	
    private static Scanner scanner;

	public static void main(String[] args) {
		
        scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        if (numero % 3 == 0) {
            System.out.println(numero + " é múltiplo de 3.");
        } else {
            System.out.println(numero + " não é múltiplo de 3.");
        }}}