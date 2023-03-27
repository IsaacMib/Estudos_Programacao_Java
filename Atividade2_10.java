package FPB;

import java.util.Scanner;

public class Atividade2_10 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o ano de fabricação do veículo: ");
        int ano = input.nextInt();
        
        System.out.print("Informe o preço de tabela do veículo: ");
        double preco = input.nextDouble();
        
        double taxa;
        
        if (ano < 2010) {
            taxa = 0.01;
        } else {
            taxa = 0.015;
        }
        
        double imposto = preco * taxa;
        
        System.out.printf("O imposto a ser pago na transferência do veículo é de R$ %.2f", imposto);
        
        input.close();
    }}
