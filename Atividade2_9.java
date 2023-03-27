package FPB;

import java.util.Scanner;

public class Atividade2_9 {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a altura em metros: ");
        double altura = sc.nextDouble();
        
        System.out.print("Informe o sexo (M ou F): ");
        String sexo = sc.next();
        
        double pesoIdeal;
        
        if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("O peso ideal para um homem com %.2f m de altura é %.2f kg.", altura, pesoIdeal);
        } else if (sexo.equalsIgnoreCase("F")) {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("O peso ideal para uma mulher com %.2f m de altura é %.2f kg.", altura, pesoIdeal);
        } else {
            System.out.println("Sexo inválido. Informe M para masculino ou F para feminino.");
        } 
        sc.close();
    }}