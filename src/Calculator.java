import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.printf("Hello and welcome!\n");

        System.out.println("Insira o primeiro número:");

        Scanner inputNumero1 = new Scanner(System.in);
        Double numero1 = inputNumero1.nextDouble();

        double soma, subtracao, multiplicacao, divisao;

        System.out.println("Insira o segundo número:");

        Scanner inputNumero2 = new Scanner(System.in);
        Double numero2 = inputNumero2.nextDouble();

        System.out.println("Escolha a operacao:");
        Scanner inputOperacao = new Scanner(System.in);
        String operacao = inputOperacao.nextLine();

        if (operacao == "/") {
            double valor = numero1 / numero2;
            System.out.println("Divisao =" + valor);
        } else if (operacao == "%") {
            double valor = numero1 * numero2;
            System.out.println("Multiplicacao =" + valor);
        } else if (operacao == "+") {
            double valor = numero1 + numero2;
            System.out.println("Soma =" + valor);
        } else {
            double valor = numero1 - numero2;
            System.out.println("Subtracao =" + valor);
        }
    }
}