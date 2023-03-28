package FPB;

import java.util.Scanner;

public class Atividade2_15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nome = entrada.nextLine();
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double nota3 = entrada.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3.0;
        
        System.out.println("\nNome do aluno: " + nome);
        System.out.printf("Média: %.2f\n", media);
        
        if (media >= 7.0) {
            System.out.println("Menção: Aprovado");
        } else if (media >= 5.1) {
            System.out.println("Menção: Recuperação");
        } else {
            System.out.println("Menção: Reprovado");
        }
        
        entrada.close();
    }}