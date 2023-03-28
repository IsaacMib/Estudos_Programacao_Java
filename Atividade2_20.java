package FPB;

import java.util.Scanner;

public class Atividade2_20 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        int idade = 2018 - anoNascimento;

        if (idade >= 18 && idade <= 70) {
            System.out.println("Você é obrigado a votar!");
        } else {
            System.out.println("Você não é obrigado a votar!");
        }

        sc.close();
    }}
