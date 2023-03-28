package FPB;

import java.util.Scanner;

public class Atividade2_12 {
	
    private static int codigo;

	public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int numHorasTrab;
        double salario, excessoPag = 0.0;

        System.out.print("Digite o código do operário: ");
        setCodigo(sc.nextInt());

        System.out.print("Digite o número de horas trabalhadas: ");
        numHorasTrab = sc.nextInt();

        salario = numHorasTrab * 10.0;

        if (numHorasTrab > 50) {
            excessoPag = (numHorasTrab - 50) * 20.0;
            salario += excessoPag;
        }

        System.out.println("O salário total do operário é: R$ " + salario);
        System.out.println("O valor do salário excedente é: R$ " + excessoPag);

        sc.close();
    }

	public static int getCodigo() {
		return codigo;
	}

	public static void setCodigo(int codigo) {
		Atividade2_12.codigo = codigo;
	}}