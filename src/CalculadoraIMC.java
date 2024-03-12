import java.util.Scanner;

public class CalculadoraIMC{

    public static void main(String[] args) {

        Scanner inputAltura = new Scanner(System.in);
        System.out.printf("Hello and welcome!\n");
        System.out.println("Insira sua altura");
        Double altura = Double.valueOf(inputAltura.nextLine());
        System.out.println("insira seu peso");
        Scanner inputPeso = new Scanner(System.in);
        Double peso = Double.valueOf(inputPeso.nextLine());
        Double imc = (double) Math.round((peso/(altura*altura)));
        System.out.println("Seu IMC é:" + imc);

        }
    }
