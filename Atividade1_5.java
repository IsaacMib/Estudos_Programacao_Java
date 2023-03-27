package FPB;

import java.util.Scanner;

public class Atividade1_5 {
	
	private static Scanner entrada;
	
	public static void main(String[] args) {
		
		// número de pães vendidos
		System.out.println("Quantidade de Paes vendidas: ");
		int numPaes = entrada.nextInt();
		
		// número de broas vendidos
		System.out.println("Quantidade de Broas vendidas: "); 
		int numBroas = entrada.nextInt();
		
		// custo de um pão
        double CustoPao = 0.12; 
        
        // custo de uma broa
        double CustoBroa = 1.50; 
        
        // calcular o valor total arrecadado
        double totalCollected = (numPaes * CustoPao) + (numBroas * CustoBroa);
        
        // calcular o valor a ser economizado
        double savings = totalCollected * 0.10;
        
        // calcular valor a ser depositado
        double amountToDeposit = totalCollected - savings;
        
        // exibir resultados
        System.out.println("\r\n" + "Valor total arrecadado: R$ " + totalCollected);
        System.out.println("Valor economizado: R$ " + savings);
        System.out.println("Valor a ser depositado: R$ " + amountToDeposit);
    }}