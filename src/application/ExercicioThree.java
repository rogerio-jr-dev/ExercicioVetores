package application;

import entities.DadosPessoais;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioThree {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        double sum = 0.0;
        DadosPessoais[] dados = new DadosPessoais[n];
        for (int i = 0; i < dados.length; i++) {
            System.out.printf("Dados da %da pessoa: ", i + 1);
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double high = sc.nextDouble();
            dados[i] = new DadosPessoais(name, age, high);
            sum += dados[i].getHigh();
        }
        double menorQte = 0.0;
        for (int i = 0; i < dados.length; i++) {
            if (dados[i].getAge() < 16) {
                menorQte++;
            }
        }
        double percentualMenor = 100.00 / dados.length * menorQte;
        System.out.println();
        System.out.printf("Altura média: %.2f%n", sum / dados.length);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenor);
        for (int i = 0; i < dados.length; i++) {
            if (dados[i].getAge() < 16) {
                System.out.println(dados[i].getName());
            }
        }

        sc.close();
    }
}
