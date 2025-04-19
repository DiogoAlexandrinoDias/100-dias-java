package dia04;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        int opcao = 0;
        float num1;
        float num2;

        String menu = """
                "Menu da calculadora
                1 - Somar
                2 - Subtração
                3 - Multiplicação
                4 - Divisão
                5 - Sair
                """;
        Scanner leitura = new Scanner(System.in);


        while (opcao!= 5) {
            System.out.println("Digite o opcão deseja" + menu);
            opcao = leitura.nextInt();
            if (opcao == 1) {
                System.out.println("Digite os numero as baixo");
                num1 = leitura.nextFloat();
                num2 = leitura.nextFloat();
                String resultando;
                resultando = "seu resultando seria esse";
                float somar = num1 + num2;
                System.out.println(resultando +" "+ somar);
            } else if (opcao == 2) {
                System.out.println("Digite os numero as baixo");
                num1 = leitura.nextFloat();
                num2 = leitura.nextFloat();
                String resultando;
                resultando = "seu resultando seria esse";
                float subtracao = num1 - num2;
                System.out.println(resultando +" "+ subtracao);
            }else if (opcao == 3) {
                System.out.println("Digite os numero as baixo");
                num1 = leitura.nextFloat();
                num2 = leitura.nextFloat();
                String resultando;
                resultando = "seu resultando seria esse";
                float multiplicacao = num1 * num2;
                System.out.println(resultando +" "+ multiplicacao);
            }else if (opcao == 4) {
                System.out.println("Digite os numero as baixo");
                num1 = leitura.nextFloat();
                num2 = leitura.nextFloat();
                String resultando;
                resultando = "seu resultando seria esse";
                float divisão = num1 / num2;
                System.out.println(resultando +" "+ divisão);
            }

        }
    }
}
