package aula3;

import java.util.Scanner;

public class ifElse {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua nota 1:");
        float nota1 = sc.nextFloat();
        System.out.println("Digite sua nota 2:");
        float nota2 = sc.nextFloat();
        System.out.println("Digite sua nota 3:");
        float nota3 = sc.nextFloat();

        float media = ( nota1 + nota2 + nota3 ) / 3;
        System.out.println("Sua média é: "+media);

        if(media < 4){
            System.out.println("Reprovado");
        }else if (media <= 6){
            System.out.println("Recuperação");
        } else if (media > 6){
            System.out.println("Aprovado");
        } else {
            System.out.println("Média invalida");
        }
    }
}
