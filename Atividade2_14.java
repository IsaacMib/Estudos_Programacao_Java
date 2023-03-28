package FPB;

import java.util.Scanner;

public class Atividade2_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        
        if (num1 == num2) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
            int maior = num1 > num2 ? num1 : num2;
            System.out.println("O número " + maior + " é o maior.");
        }
        
        sc.close();
    }}