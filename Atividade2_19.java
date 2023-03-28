package FPB;

import java.util.Scanner;

public class Atividade2_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite uma letra: ");
        char letra = input.next().charAt(0);
        
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
            letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("É uma vogal.");
        } else {
            System.out.println("Não é uma vogal.");
        }
        
        input.close();
    }}