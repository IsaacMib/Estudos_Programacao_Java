package FPB;

import java.util.Scanner;

public class Atividade2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o sexo: ");
        char sexo = input.next().charAt(0);
        
        if (sexo == 'M') {
            System.out.println("Masculino");
        } else if (sexo == 'F') {
            System.out.println("Feminino");
        } else {
            System.out.println("Sexo inválido.");
        }
        
        input.close();
    }}