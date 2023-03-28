package FPB;

import java.util.Scanner;

public class Atividade2_17 {
	
    private static Scanner input;

	public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();
        
        if (num2 == 0) {
            System.out.println("Não é possível realizar a divisão por zero.");
        } else {
            double resultado = num1 / num2;
            System.out.println("O resultado da divisão é: " + resultado);
        }}}
