package FPB;

import java.util.Scanner;

public class Atividade1_4 {
	
	private static Scanner scanner;
	
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		System.out.print("Informe o valor total da compra: ");
		
		double totalValue = scanner.nextDouble();
		
		System.out.print("Digite o número de parcelas: ");
		
		int numInstallments = scanner.nextInt();
		
		double installmentValue = totalValue / numInstallments;
		
		System.out.println("Valor da prestação: " + installmentValue);

}}
