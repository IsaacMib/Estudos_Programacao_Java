package FPB;

import java.util.Scanner;

public class Atividade2_13 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if(num >= 100 && num <= 200){
            System.out.println("O número está no intervalo entre 100 e 200");
        } else {
            System.out.println("O número não está no intervalo entre 100 e 200");
        }
        
        sc.close();
    }}