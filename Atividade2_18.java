package FPB;

import java.util.Scanner;

public class Atividade2_18 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int idadeJoao, idadeJose, idadeMaria;

    System.out.println("Digite a idade do João:");
    idadeJoao = input.nextInt();

    System.out.println("Digite a idade do José:");
    idadeJose = input.nextInt();

    System.out.println("Digite a idade da Maria:");
    idadeMaria = input.nextInt();

    if (idadeJoao < idadeJose && idadeJoao < idadeMaria) {
      System.out.println("O caçula da família é o João");
    } else if (idadeJose < idadeJoao && idadeJose < idadeMaria) {
      System.out.println("O caçula da família é o José");
    } else {
      System.out.println("O caçula da família é a Maria");
    }

    input.close();
  }}