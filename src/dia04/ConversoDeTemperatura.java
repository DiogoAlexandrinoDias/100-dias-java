package dia04;

import java.util.Scanner;

public class ConversoDeTemperatura {
    public static void main(String[] args) {
        int opc = 0;
        System.out.println("Digite a temperatura do dia");
        int celsius ;

        String menu = """
                "conversor de temperatura
                1 - Kelvin
                2 - Fahrenheit
                3 - Sair
                """;
        Scanner leitura = new Scanner(System.in);


        while (opc != 3){
            System.out.println(menu);
            System.out.println("Digite a opção que gostaria");
            opc = leitura.nextInt();
            if (opc == 1){
                System.out.println("Digite a temperatura do dia");
                celsius =leitura.nextInt();
                float conversoDeKelvin = (float) (celsius + 273.15);
                System.out.println("Sua temperatura do dia em Kelvin e de"+ conversoDeKelvin+"K");
            } else if (opc == 2) {
                System.out.println("Digite a temperatura do dia");
                celsius =leitura.nextInt();
                int conversoDeFahrenheit = (celsius * 9/5) + 32;
                System.out.println("Sua temperatura do dia em Kelvin e de"+ conversoDeFahrenheit+"°F");
            }

        }
    }
}
