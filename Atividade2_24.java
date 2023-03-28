package FPB;

import java.util.Scanner;

public class Atividade2_24 {
    private static Scanner input;

	public static void main(String[] args) {
		
        input = new Scanner(System.in);
        
        System.out.print("Digite a hora de início do jogo (0-24): ");
        int horaInicio = input.nextInt();
        
        System.out.print("Digite a hora do final do jogo (0-24): ");
        int horaFinal = input.nextInt();
        
        int duracao;
        
        if (horaInicio < horaFinal) {
            duracao = horaFinal - horaInicio;
        } else {
            duracao = 24 - horaInicio + horaFinal;
        }
        
        System.out.println("A duração do jogo foi de " + duracao + " horas.");
    }}