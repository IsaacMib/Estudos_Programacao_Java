package FPB;

import java.util.Scanner;

public class Atividade2_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a matrícula do aluno: ");
        String matricula = sc.nextLine();

        System.out.print("Digite a nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a nota 3: ");
        double nota3 = sc.nextDouble();

        System.out.print("Digite a média dos exercícios: ");
        double me = sc.nextDouble();

        double ma = (nota1 + nota2 * 2 + nota3 * 3 + me) / 7;

        String conceito;

        if (ma >= 9.0) {
            conceito = "A";
        } else if (ma >= 7.5) {
            conceito = "B";
        } else if (ma >= 6.0) {
            conceito = "C";
        } else if (ma >= 4.0) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        System.out.println("Matrícula: " + matricula);
        System.out.println("Média de aproveitamento: " + ma);
        System.out.println("Conceito: " + conceito);

        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }

        sc.close();
    }}