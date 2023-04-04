package FPB;

import java.util.Scanner;

public class Atividade2_22 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o sabor do sorvete: ");
        char sabor = sc.next().charAt(0);
        
        System.out.print("Informe o número de bolas do sorvete: ");
        int numBolas = sc.nextInt();
        
        double preco = 0;
        
        if (sabor == 'C') {
            if (numBolas >= 3) {
                preco = 2.5 * numBolas * 0.9;
                System.out.println("Desconto de 10% aplicado!");
            } else {
                preco = 2.5 * numBolas * 0.95;
                System.out.println("Desconto de 5% aplicado!");
            }
        } else if (sabor == 'M') {
            preco = 2.8 * numBolas;
        } else {
            System.out.println("Sabor inválido!");
        }
        
        if (preco > 0) {
            System.out.printf("Valor a pagar: R$ %.2f", preco);
        }
        
        sc.close();
    }}
