package dia04;

import java.util.Scanner;

public class ConversoDeTemperatura {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner leitura = new Scanner(System.in);

        String menu = """
                Conversor de temperatura
                1 - Kelvin
                2 - Fahrenheit
                3 - Sair
                """;

        System.out.println("Digite a temperatura em Celsius:");
        int celsius = leitura.nextInt();

        while (opcao != 3) {
            System.out.println(menu);
            System.out.println("Digite a opção desejada:");
            opcao = leitura.nextInt();

            if (opcao == 1) {
                float conversaoKelvin = celsius + 273.15f;
                System.out.println("Sua temperatura em Kelvin é de " + conversaoKelvin + " K");
            } else if (opcao == 2) {
                float conversaoFahrenheit = (celsius * 9.0f / 5.0f) + 32;
                System.out.println("Sua temperatura em Fahrenheit é de " + conversaoFahrenheit + " °F");
            } else if (opcao == 3) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
