package FPB;

import java.util.Scanner;

public class Atividade2_23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o índice de poluição: ");
        int indice = sc.nextInt();

        if (indice >= 5 && indice < 30) {
            System.out.println("Índice de poluição aceitável.");
        } else if (indice >= 30 && indice < 40) {
            System.out.println("Indústrias do 1º grupo intimadas a suspenderem suas atividades.");
        } else if (indice >= 40 && indice < 50) {
            System.out.println("Indústrias do 1º e 2º grupos intimadas a suspenderem suas atividades.");
        } else if (indice >= 50) {
            System.out.println("Todos os 3 grupos de indústrias devem paralisar suas atividades.");
        } else {
            System.out.println("Índice de poluição inválido.");
        }

        sc.close();
    }}