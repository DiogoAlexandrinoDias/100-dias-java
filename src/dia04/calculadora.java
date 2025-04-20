package dia04;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        int opcao = 0;
        float num1, num2;
        Scanner leitura = new Scanner(System.in);

        String menu = """
                Menu da calculadora:
                1 - Somar
                2 - Subtrair
                3 - Multiplicar
                4 - Dividir
                5 - Sair
                """;

        while (opcao != 5) {
            System.out.println(menu);
            System.out.print("Digite a opção desejada: ");
            opcao = leitura.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.println("Digite os números abaixo:");
                System.out.print("Número 1: ");
                num1 = leitura.nextFloat();
                System.out.print("Número 2: ");
                num2 = leitura.nextFloat();

                switch (opcao) {
                    case 1 -> {
                        float soma = num1 + num2;
                        System.out.printf("Resultado: %.2f%n", soma);
                    }
                    case 2 -> {
                        float subtracao = num1 - num2;
                        System.out.printf("Resultado: %.2f%n", subtracao);
                    }
                    case 3 -> {
                        float multiplicacao = num1 * num2;
                        System.out.printf("Resultado: %.2f%n", multiplicacao);
                    }
                    case 4 -> {
                        if (num2 != 0) {
                            float divisao = num1 / num2;
                            System.out.printf("Resultado: %.2f%n", divisao);
                        } else {
                            System.out.println("Erro: divisão por zero!");
                        }
                    }
                }
            } else if (opcao != 5) {
                System.out.println("Opção inválida!");
            }
        }
        System.out.println("Saindo...");
    }
}
