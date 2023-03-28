package FPB;

import java.util.Scanner;

public class Atividade2_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de litros vendidos: ");
        double litros = sc.nextDouble();

        System.out.print("Digite o tipo de combustível: ");
        char tipo = sc.next().charAt(0);

        double preco;
        if (tipo == 'A') {
            if (litros <= 20) {
                preco = litros * 2.90 * 0.97; // desconto de 3%
            } else {
                preco = litros * 2.90 * 0.95; // desconto de 5%
            }
        } else { // tipo == 'G'
            if (litros <= 20) {
                preco = litros * 3.30 * 0.96; // desconto de 4%
            } else {
                preco = litros * 3.30 * 0.94; // desconto de 6%
            }
        }

        System.out.printf("Valor a ser pago: R$ %.2f", preco);
        sc.close();
    }
}
