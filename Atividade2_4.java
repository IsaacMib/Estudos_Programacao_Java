package FPB;

import java.util.Scanner;

public class Atividade2_4 {
	
    private static Scanner scanner;

	public static void main(String[] args) {
        scanner = new Scanner(System.in);
        
        System.out.print("Digite o salário bruto: ");
        double salarioBruto = scanner.nextDouble();
        
        System.out.print("Digite o valor da prestação: ");
        double prestacao = scanner.nextDouble();
        
        double maxPrestacao = salarioBruto * 0.3;
        
        if (prestacao <= maxPrestacao) {
            System.out.println("Empréstimo concedido!");
        } else {
            System.out.println("Empréstimo não pode ser concedido!");
        }}}