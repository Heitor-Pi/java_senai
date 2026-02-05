package aula4;

import java.util.Scanner;

public class For {
    static void main() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 5; i++){
            System.out.println("O valor de i é: "+i);
        }

        System.out.println(" ");

        for (int i = 0; i <= 10; i++){
            System.out.println("O valor de i é: "+i);
            i++;
        }

        System.out.println(" ");

        for (int i = 1; i <= 10; i++){
            System.out.println("O valor de i é: "+i);
            i++;
        }
    }
}
