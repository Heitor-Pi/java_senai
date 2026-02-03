import java.util.Scanner;

public class IMC {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome");
        String nome = sc.next();
        System.out.println(nome);

        System.out.println("Digite a sua idade");
        int idade = Integer.parseInt(sc.next());
        System.out.println(idade);

        System.out.println("Digite o seu peso");
        float peso = Float.parseFloat(sc.next());
        System.out.println(peso);


        System.out.println("Digite a sua altura");
        float altura = Float.parseFloat(sc.next());
        System.out.println(altura);

        float imc = (peso / (altura * altura));
        System.out.println("Seu IMC é: ");
        System.out.println(imc);

        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        }else if(imc >= 18.5 && imc < 24.9){
            System.out.println("Peso normal");
        }else if(imc >= 25 && imc < 29.9){
            System.out.println("Sobrepeso");
        }else if(imc >= 30 && imc < 34.9){
            System.out.println("Obesidade grau I");
        }else if(imc >= 35 && imc < 39.9){
            System.out.println("Obesidade grau II");
        }else if(imc >= 40){
            System.out.println("Obesidade grau III");
        }else{
            System.out.println("IMC inválido");
        }
    }
}
