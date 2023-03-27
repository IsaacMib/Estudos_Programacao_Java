package FPB;

import java.util.Scanner;

public class Atividade2_11 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        double caixa, qtd, pr, totalCompra, valorFinal;
        String formaPagamento;

        System.out.print("Digite a quantidade de dinheiro: R$");
        caixa = sc.nextDouble();

        System.out.print("Digite a quantidade de produtos a serem comprados: ");
        qtd = sc.nextDouble();

        System.out.print("Digite o preço de cada produto: R$");
        pr = sc.nextDouble();

        totalCompra = qtd * pr;

        if (totalCompra > 0.8 * caixa) { // se a compra ultrapassa 80% do valor em caixa
            formaPagamento = "a prazo";
            
            
            valorFinal = totalCompra * 1.1; // valor com 10% de juros
        } else { // se a compra é até 80% do valor em caixa
            formaPagamento = "a vista";
            valorFinal = totalCompra * 0.95; // valor com 5% de desconto
        }

        System.out.println("Forma de pagamento escolhida: " + formaPagamento);
        System.out.printf("Valor total a ser pago: R$%.2f", valorFinal);

        sc.close();
    }}
