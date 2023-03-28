package Revision;

import java.util.Scanner;

public class Atividade2_26 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a velocidade maxima permitida: ");
		int velocidadeMaxima = input.nextInt();
		
		System.out.print("Digite a velocidade do motorista: ");
		int velocidadeMotorista = input.nextInt();
		
		int diferencaVelocidade = velocidadeMotorista - velocidadeMaxima;
		
		if (diferencaVelocidade <= 10) {
			System.out.println("Multa de R$50,00.");
		} else if (diferencaVelocidade <=30) {
			System.out.println("Multa de R$100,00.");
		} else {
			System.out.println("Multa de R$200,00.");
		}
		
		input.close();
}}