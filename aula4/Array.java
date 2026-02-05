package aula4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array {
    static void main() {
       Scanner sc = new Scanner(System.in);
//
//
//        List<String> nomes = new ArrayList();
//        nomes.add("Heitor");
//        nomes.add("Marcelinha");
//        nomes.add("Gislene");
//
//        System.out.println(nomes);
//        System.out.println(nomes.get(1));

       List<Integer> numeros = new ArrayList();

        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();
        numeros.add(num1);
        numeros.add(num2);

        System.out.println(numeros.get(0) + numeros.get(1));
//
//            numeros.add(3);
//            numeros.add(7);
//            numeros.add(11);
//            numeros.add(18);
//
//        for (int num : numeros){
//            numeros.forEach();
//        }

//            System.out.println("Digite um número: ");
//            Double numero = sc.nextDouble();
//            numeros.add(numero);
//            System.out.println(numeros);




//    public class Desafio{
////        static void main() {
////            List<Double> numeros = new ArrayList();
////            Scanner sc = new Scanner(System.in);
////
////
////            System.out.println("Acerte um número da lista: ");
////            Double numero = sc.nextDouble();
////
////            numeros.add(numero);
//
//        }
    }
}
