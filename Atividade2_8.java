package FPB;

import java.util.Scanner;

public class Atividade2_8 {
	
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o peso dos peixes (em kg): ");
        double peso = input.nextDouble();
        
        double excesso = peso - 50.0;
        double multa = 0.0;
        
        if (excesso > 0.0) {
            multa = excesso * 4.0;
            System.out.println("Peso excedente: " + excesso + " kg");
            System.out.println("Valor da multa: R$ " + multa);
        } else {
            System.out.println("Peso dentro do regulamento.");
        }
        
        input.close();
    }}