package FPB;

import java.util.Scanner;

public class Atividade2_7 {
	
    private static Scanner scanner;

	public static void main(String[] args) {
		
        scanner = new Scanner(System.in);
        
        System.out.print("Digite o tipo de combustível: ");
        String tipoCombustivel = scanner.nextLine();
        
        System.out.print("Digite a capacidade do tanque em litros: ");
        double capacidadeTanque = scanner.nextDouble();
        
        double precoLitro;
        
        if (tipoCombustivel.equalsIgnoreCase("G")) {
            precoLitro = 3.79;
        } else if (tipoCombustivel.equals("A")) {
            precoLitro = 2.90;
        } else {
            System.out.println("Tipo de combustível inválido!");
            return;
        }
        
        double valorTotal = capacidadeTanque * precoLitro;
        
        System.out.println("O valor total gasto para encher o tanque é de R$ " + valorTotal);
    }}