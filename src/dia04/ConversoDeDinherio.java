package dia04;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ConversoDeDinherio {
    public static void main(String[] args) {

        int moedaUsada = 0;
        int opcaoDeconvercao = 0;
        double valorInfomrado;

        String[] moedas = {
                "$ ",        // USD (índice 0)
                "€ ",        // EUR (índice 1)
                "£ ",        // GBP (índice 2)
                "¥ ",        // JPY (índice 3)
                "CN¥ ",      // CNY (índice 4)
                "Fr. ",      // CHF (índice 5)
                "A$ ",       // AUD (índice 6)
                "C$ ",       // CAD (índice 7)
                "ARS$ ",     // ARS (índice 8)
                "R$ "        // BRL (índice 9)
        };

        String[] moedasAbreviadas = {
                "USD",  // Índice 0
                "EUR",  // Índice 1
                "GBP",  // Índice 2
                "JPY",  // Índice 3
                "CNY",  // Índice 4
                "CHF",  // Índice 5
                "AUD",  // Índice 6
                "CAD",  // Índice 7
                "ARS",  // Índice 8
                "BRL"   // Índice 9
        };

        double[] taxasDeCambio = {
                1.00,    // USD (índice 0)
                0.93,    // EUR (índice 1)
                0.80,    // GBP (índice 2)
                157.50,  // JPY (índice 3)
                7.25,    // CNY (índice 4)
                0.89,    // CHF (índice 5)
                1.51,    // AUD (índice 6)
                1.36,    // CAD (índice 7)
                911.50,  // ARS (índice 8)
                5.42     // BRL (índice 9)
        };

        Scanner leitura = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        String menu = """
                Bem-vindo ao conversor de moeda
                
                Escolha uma das moedas abaixo:
                
                1-  USD     |Dólar Americano    |Estados Unidos
                2-  EUR     |Euro               |Zona do Euro
                3-  GBP     |Libra Esterlina    |Reino Unido
                4-  JPY     |Iene Japonês       |Japão
                5-  CNY     |Yuan Chinês        |China
                6-  CHF     |Franco Suíço       |Suíça
                7-  AUD     |Dólar Australiano  |Austrália
                8-  CAD     |Dólar Canadense    |Canadá
                9-  ARS     |Peso Argentino     |Argentina
                10- BRL     |Real Brasileiro    |Brasil
                
                """;


        while (moedaUsada != 11) {
            System.out.println(menu);
            System.out.println("Digite a opção da moeda que deseja utilizar:");
            moedaUsada = leitura.nextInt();

            if (moedaUsada == 1) {
                while (opcaoDeconvercao != 11) {
                    System.out.println("Digite para qual moeda será convertido:");
                    opcaoDeconvercao = leitura.nextInt();
                    if (opcaoDeconvercao == 1) {
                        System.out.println("Você já se encontra nessa moeda. Escolha outra.");
                    } else if (opcaoDeconvercao == 2) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[0] / taxasDeCambio[1]);
                        System.out.println("Seu valor em " + moedasAbreviadas[1] + " é de " + moedas[1] + df.format(resultado));
                    } else if (opcaoDeconvercao == 3) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[0] / taxasDeCambio[2]);
                        System.out.println("Seu valor em " + moedasAbreviadas[2] + " é de " + moedas[2] + df.format(resultado));
                    } else if (opcaoDeconvercao == 4) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[0] / taxasDeCambio[3]);
                        System.out.println("Seu valor em " + moedasAbreviadas[3] + " é de " + moedas[3] + df.format(resultado));
                    } else if (opcaoDeconvercao == 5) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[0] / taxasDeCambio[4]);
                        System.out.println("Seu valor em " + moedasAbreviadas[4] + " é de " + moedas[4] + df.format(resultado));
                    } else if (opcaoDeconvercao == 6) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[0] / taxasDeCambio[5]);
                        System.out.println("Seu valor em " + moedasAbreviadas[5] + " é de " + moedas[5] + df.format(resultado));
                    } else if (opcaoDeconvercao == 7) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[0] / taxasDeCambio[6]);
                        System.out.println("Seu valor em " + moedasAbreviadas[6] + " é de " + moedas[6] + df.format(resultado));
                    } else if (opcaoDeconvercao == 8) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[0] / taxasDeCambio[7]);
                        System.out.println("Seu valor em " + moedasAbreviadas[7] + " é de " + moedas[7] + df.format(resultado));
                    } else if (opcaoDeconvercao == 9) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[0] / taxasDeCambio[8]);
                        System.out.println("Seu valor em " + moedasAbreviadas[8] + " é de " + moedas[8] + df.format(resultado));
                    } else if (opcaoDeconvercao == 10) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[0] / taxasDeCambio[9]);
                        System.out.println("Seu valor em " + moedasAbreviadas[9] + " é de " + moedas[9] + df.format(resultado));
                    }
                }
            } else if (moedaUsada == 2) {
                while (opcaoDeconvercao != 11) {
                    System.out.println("Digite para qual moeda será convertido:");
                    opcaoDeconvercao = leitura.nextInt();
                    if (opcaoDeconvercao == 1) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[1] / taxasDeCambio[0]);
                        System.out.println("Seu valor em " + moedasAbreviadas[0] + " é de " + moedas[0] + df.format(resultado));
                    } else if (opcaoDeconvercao == 2) {
                        System.out.println("Você já se encontra nessa moeda. Escolha outra.");
                    } else if (opcaoDeconvercao == 3) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[1] / taxasDeCambio[2]);
                        System.out.println("Seu valor em " + moedasAbreviadas[2] + " é de " + moedas[2] + df.format(resultado));
                    } else if (opcaoDeconvercao == 4) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[1] / taxasDeCambio[3]);
                        System.out.println("Seu valor em " + moedasAbreviadas[3] + " é de " + moedas[3] + df.format(resultado));
                    } else if (opcaoDeconvercao == 5) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[1] / taxasDeCambio[4]);
                        System.out.println("Seu valor em " + moedasAbreviadas[4] + " é de " + moedas[4] + df.format(resultado));
                    } else if (opcaoDeconvercao == 6) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[1] / taxasDeCambio[5]);
                        System.out.println("Seu valor em " + moedasAbreviadas[5] + " é de " + moedas[5] + df.format(resultado));
                    } else if (opcaoDeconvercao == 7) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[1] / taxasDeCambio[6]);
                        System.out.println("Seu valor em " + moedasAbreviadas[6] + " é de " + moedas[6] + df.format(resultado));
                    } else if (opcaoDeconvercao == 8) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[1] / taxasDeCambio[7]);
                        System.out.println("Seu valor em " + moedasAbreviadas[7] + " é de " + moedas[7] + df.format(resultado));
                    } else if (opcaoDeconvercao == 9) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[1] / taxasDeCambio[8]);
                        System.out.println("Seu valor em " + moedasAbreviadas[8] + " é de " + moedas[8] + df.format(resultado));
                    } else if (opcaoDeconvercao == 10) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[1] / taxasDeCambio[9]);
                        System.out.println("Seu valor em " + moedasAbreviadas[9] + " é de " + moedas[9] + df.format(resultado));
                    }
                }
            } else if (moedaUsada == 3) {
                while (opcaoDeconvercao != 11) {
                    System.out.println("Digite para qual moeda será convertido:");
                    opcaoDeconvercao = leitura.nextInt();
                    if (opcaoDeconvercao == 1) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[2] / taxasDeCambio[0]);
                        System.out.println("Seu valor em " + moedasAbreviadas[0] + " é de " + moedas[0] + df.format(resultado));
                    } else if (opcaoDeconvercao == 2) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[2] / taxasDeCambio[1]);
                        System.out.println("Seu valor em " + moedasAbreviadas[1] + " é de " + moedas[1] + df.format(resultado));
                    } else if (opcaoDeconvercao == 3) {
                        System.out.println("Você já se encontra nessa moeda. Escolha outra.");
                    } else if (opcaoDeconvercao == 4) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[2] / taxasDeCambio[3]);
                        System.out.println("Seu valor em " + moedasAbreviadas[3] + " é de " + moedas[3] + df.format(resultado));
                    } else if (opcaoDeconvercao == 5) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[2] / taxasDeCambio[4]);
                        System.out.println("Seu valor em " + moedasAbreviadas[4] + " é de " + moedas[4] + df.format(resultado));
                    } else if (opcaoDeconvercao == 6) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[2] / taxasDeCambio[5]);
                        System.out.println("Seu valor em " + moedasAbreviadas[5] + " é de " + moedas[5] + df.format(resultado));
                    } else if (opcaoDeconvercao == 7) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[2] / taxasDeCambio[6]);
                        System.out.println("Seu valor em " + moedasAbreviadas[6] + " é de " + moedas[6] + df.format(resultado));
                    } else if (opcaoDeconvercao == 8) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[2] / taxasDeCambio[7]);
                        System.out.println("Seu valor em " + moedasAbreviadas[7] + " é de " + moedas[7] + df.format(resultado));
                    } else if (opcaoDeconvercao == 9) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[2] / taxasDeCambio[8]);
                        System.out.println("Seu valor em " + moedasAbreviadas[8] + " é de " + moedas[8] + df.format(resultado));
                    } else if (opcaoDeconvercao == 10) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[2] / taxasDeCambio[9]);
                        System.out.println("Seu valor em " + moedasAbreviadas[9] + " é de " + moedas[9] + df.format(resultado));
                    }
                }
            } else if (moedaUsada == 4) {
                while (opcaoDeconvercao != 11) {
                    System.out.println("Digite para qual moeda será convertido:");
                    opcaoDeconvercao = leitura.nextInt();
                    if (opcaoDeconvercao == 1) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[3] / taxasDeCambio[0]);
                        System.out.println("Seu valor em " + moedasAbreviadas[0] + " é de " + moedas[0] + df.format(resultado));
                    } else if (opcaoDeconvercao == 2) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[3] / taxasDeCambio[1]);
                        System.out.println("Seu valor em " + moedasAbreviadas[1] + " é de " + moedas[1] + df.format(resultado));
                    } else if (opcaoDeconvercao == 3) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[3] / taxasDeCambio[2]);
                        System.out.println("Seu valor em " + moedasAbreviadas[2] + " é de " + moedas[2] + df.format(resultado));
                    } else if (opcaoDeconvercao == 4) {
                        System.out.println("Você já se encontra nessa moeda. Escolha outra.");
                    } else if (opcaoDeconvercao == 5) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[3] / taxasDeCambio[4]);
                        System.out.println("Seu valor em " + moedasAbreviadas[4] + " é de " + moedas[4] + df.format(resultado));
                    } else if (opcaoDeconvercao == 6) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[3] / taxasDeCambio[5]);
                        System.out.println("Seu valor em " + moedasAbreviadas[5] + " é de " + moedas[5] + df.format(resultado));
                    } else if (opcaoDeconvercao == 7) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[3] / taxasDeCambio[6]);
                        System.out.println("Seu valor em " + moedasAbreviadas[6] + " é de " + moedas[6] + df.format(resultado));
                    } else if (opcaoDeconvercao == 8) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[3] / taxasDeCambio[7]);
                        System.out.println("Seu valor em " + moedasAbreviadas[7] + " é de " + moedas[7] + df.format(resultado));
                    } else if (opcaoDeconvercao == 9) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[3] / taxasDeCambio[8]);
                        System.out.println("Seu valor em " + moedasAbreviadas[8] + " é de " + moedas[8] + df.format(resultado));
                    } else if (opcaoDeconvercao == 10) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[3] / taxasDeCambio[9]);
                        System.out.println("Seu valor em " + moedasAbreviadas[9] + " é de " + moedas[9] + df.format(resultado));
                    }
                }
            } else if (moedaUsada == 5) {
                while (opcaoDeconvercao != 11) {
                    System.out.println("Digite para qual moeda será convertido:");
                    opcaoDeconvercao = leitura.nextInt();
                    if (opcaoDeconvercao == 1) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[4] / taxasDeCambio[0]);
                        System.out.println("Seu valor em " + moedasAbreviadas[0] + " é de " + moedas[0] + df.format(resultado));
                    } else if (opcaoDeconvercao == 2) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[4] / taxasDeCambio[1]);
                        System.out.println("Seu valor em " + moedasAbreviadas[1] + " é de " + moedas[1] + df.format(resultado));
                    } else if (opcaoDeconvercao == 3) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[4] / taxasDeCambio[2]);
                        System.out.println("Seu valor em " + moedasAbreviadas[2] + " é de " + moedas[2] + df.format(resultado));
                    } else if (opcaoDeconvercao == 4) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[4] / taxasDeCambio[3]);
                        System.out.println("Seu valor em " + moedasAbreviadas[3] + " é de " + moedas[3] + df.format(resultado));
                    } else if (opcaoDeconvercao == 5) {
                        System.out.println("Você já se encontra nessa moeda. Escolha outra.");
                    } else if (opcaoDeconvercao == 6) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[4] / taxasDeCambio[5]);
                        System.out.println("Seu valor em " + moedasAbreviadas[5] + " é de " + moedas[5] + df.format(resultado));
                    } else if (opcaoDeconvercao == 7) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[4] / taxasDeCambio[6]);
                        System.out.println("Seu valor em " + moedasAbreviadas[6] + " é de " + moedas[6] + df.format(resultado));
                    } else if (opcaoDeconvercao == 8) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[4] / taxasDeCambio[7]);
                        System.out.println("Seu valor em " + moedasAbreviadas[7] + " é de " + moedas[7] + df.format(resultado));
                    } else if (opcaoDeconvercao == 9) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[4] / taxasDeCambio[8]);
                        System.out.println("Seu valor em " + moedasAbreviadas[8] + " é de " + moedas[8] + df.format(resultado));
                    } else if (opcaoDeconvercao == 10) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[4] / taxasDeCambio[9]);
                        System.out.println("Seu valor em " + moedasAbreviadas[9] + " é de " + moedas[9] + df.format(resultado));
                    }
                }
            } else if (moedaUsada == 6) {
                while (opcaoDeconvercao != 11) {
                    System.out.println("Digite para qual moeda será convertido:");
                    opcaoDeconvercao = leitura.nextInt();
                    if (opcaoDeconvercao == 1) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[5] / taxasDeCambio[0]);
                        System.out.println("Seu valor em " + moedasAbreviadas[0] + " é de " + moedas[0] + df.format(resultado));
                    } else if (opcaoDeconvercao == 2) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[5] / taxasDeCambio[1]);
                        System.out.println("Seu valor em " + moedasAbreviadas[1] + " é de " + moedas[1] + df.format(resultado));
                    } else if (opcaoDeconvercao == 3) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[5] / taxasDeCambio[2]);
                        System.out.println("Seu valor em " + moedasAbreviadas[2] + " é de " + moedas[2] + df.format(resultado));
                    } else if (opcaoDeconvercao == 4) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[5] / taxasDeCambio[3]);
                        System.out.println("Seu valor em " + moedasAbreviadas[3] + " é de " + moedas[3] + df.format(resultado));
                    } else if (opcaoDeconvercao == 5) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[5] / taxasDeCambio[4]);
                        System.out.println("Seu valor em " + moedasAbreviadas[4] + " é de " + moedas[4] + df.format(resultado));
                    } else if (opcaoDeconvercao == 6) {
                        System.out.println("Você já se encontra nessa moeda. Escolha outra.");
                    } else if (opcaoDeconvercao == 7) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[5] / taxasDeCambio[6]);
                        System.out.println("Seu valor em " + moedasAbreviadas[6] + " é de " + moedas[6] + df.format(resultado));
                    } else if (opcaoDeconvercao == 8) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[5] / taxasDeCambio[7]);
                        System.out.println("Seu valor em " + moedasAbreviadas[7] + " é de " + moedas[7] + df.format(resultado));
                    } else if (opcaoDeconvercao == 9) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[5] / taxasDeCambio[8]);
                        System.out.println("Seu valor em " + moedasAbreviadas[8] + " é de " + moedas[8] + df.format(resultado));
                    } else if (opcaoDeconvercao == 10) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[5] / taxasDeCambio[9]);
                        System.out.println("Seu valor em " + moedasAbreviadas[9] + " é de " + moedas[9] + df.format(resultado));
                    }
                }
            } else if (moedaUsada == 7) {
                while (opcaoDeconvercao != 11) {
                    System.out.println("Digite para qual moeda será convertido:");
                    opcaoDeconvercao = leitura.nextInt();
                    if (opcaoDeconvercao == 1) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[6] / taxasDeCambio[0]);
                        System.out.println("Seu valor em " + moedasAbreviadas[0] + " é de " + moedas[0] + df.format(resultado));
                    } else if (opcaoDeconvercao == 2) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[6] / taxasDeCambio[1]);
                        System.out.println("Seu valor em " + moedasAbreviadas[1] + " é de " + moedas[1] + df.format(resultado));
                    } else if (opcaoDeconvercao == 3) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[6] / taxasDeCambio[2]);
                        System.out.println("Seu valor em " + moedasAbreviadas[2] + " é de " + moedas[2] + df.format(resultado));
                    } else if (opcaoDeconvercao == 4) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[6] / taxasDeCambio[3]);
                        System.out.println("Seu valor em " + moedasAbreviadas[3] + " é de " + moedas[3] + df.format(resultado));
                    } else if (opcaoDeconvercao == 5) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[6] / taxasDeCambio[4]);
                        System.out.println("Seu valor em " + moedasAbreviadas[4] + " é de " + moedas[4] + df.format(resultado));
                    } else if (opcaoDeconvercao == 6) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[6] / taxasDeCambio[5]);
                        System.out.println("Seu valor em " + moedasAbreviadas[5] + " é de " + moedas[5] + df.format(resultado));
                    } else if (opcaoDeconvercao == 7) {
                        System.out.println("Você já se encontra nessa moeda. Escolha outra.");
                    } else if (opcaoDeconvercao == 8) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[6] / taxasDeCambio[7]);
                        System.out.println("Seu valor em " + moedasAbreviadas[7] + " é de " + moedas[7] + df.format(resultado));
                    } else if (opcaoDeconvercao == 9) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[6] / taxasDeCambio[8]);
                        System.out.println("Seu valor em " + moedasAbreviadas[8] + " é de " + moedas[8] + df.format(resultado));
                    } else if (opcaoDeconvercao == 10) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[6] / taxasDeCambio[9]);
                        System.out.println("Seu valor em " + moedasAbreviadas[9] + " é de " + moedas[9] + df.format(resultado));
                    }
                }
            } else if (moedaUsada == 8) {
                while (opcaoDeconvercao != 11) {
                    System.out.println("Digite para qual moeda será convertido:");
                    opcaoDeconvercao = leitura.nextInt();
                    if (opcaoDeconvercao == 1) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[7] / taxasDeCambio[0]);
                        System.out.println("Seu valor em " + moedasAbreviadas[0] + " é de " + moedas[0] + df.format(resultado));
                    } else if (opcaoDeconvercao == 2) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[7] / taxasDeCambio[1]);
                        System.out.println("Seu valor em " + moedasAbreviadas[1] + " é de " + moedas[1] + df.format(resultado));
                    } else if (opcaoDeconvercao == 3) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[7] / taxasDeCambio[2]);
                        System.out.println("Seu valor em " + moedasAbreviadas[2] + " é de " + moedas[2] + df.format(resultado));
                    } else if (opcaoDeconvercao == 4) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[7] / taxasDeCambio[3]);
                        System.out.println("Seu valor em " + moedasAbreviadas[3] + " é de " + moedas[3] + df.format(resultado));
                    } else if (opcaoDeconvercao == 5) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[7] / taxasDeCambio[4]);
                        System.out.println("Seu valor em " + moedasAbreviadas[4] + " é de " + moedas[4] + df.format(resultado));
                    } else if (opcaoDeconvercao == 6) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[7] / taxasDeCambio[5]);
                        System.out.println("Seu valor em " + moedasAbreviadas[5] + " é de " + moedas[5] + df.format(resultado));
                    } else if (opcaoDeconvercao == 7) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[7] / taxasDeCambio[6]);
                        System.out.println("Seu valor em " + moedasAbreviadas[6] + " é de " + moedas[6] + df.format(resultado));
                    } else if (opcaoDeconvercao == 8) {
                        System.out.println("Você já se encontra nessa moeda. Escolha outra.");
                    } else if (opcaoDeconvercao == 9) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[7] / taxasDeCambio[8]);
                        System.out.println("Seu valor em " + moedasAbreviadas[8] + " é de " + moedas[8] + df.format(resultado));
                    } else if (opcaoDeconvercao == 10) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[7] / taxasDeCambio[9]);
                        System.out.println("Seu valor em " + moedasAbreviadas[9] + " é de " + moedas[9] + df.format(resultado));
                    }
                }
            } else if (moedaUsada == 9) {
                while (opcaoDeconvercao != 11) {
                    System.out.println("Digite para qual moeda será convertido:");
                    opcaoDeconvercao = leitura.nextInt();
                    if (opcaoDeconvercao == 1) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[8] / taxasDeCambio[0]);
                        System.out.println("Seu valor em " + moedasAbreviadas[0] + " é de " + moedas[0] + df.format(resultado));
                    } else if (opcaoDeconvercao == 2) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[8] / taxasDeCambio[1]);
                        System.out.println("Seu valor em " + moedasAbreviadas[1] + " é de " + moedas[1] + df.format(resultado));
                    } else if (opcaoDeconvercao == 3) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[8] / taxasDeCambio[2]);
                        System.out.println("Seu valor em " + moedasAbreviadas[2] + " é de " + moedas[2] + df.format(resultado));
                    } else if (opcaoDeconvercao == 4) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[8] / taxasDeCambio[3]);
                        System.out.println("Seu valor em " + moedasAbreviadas[3] + " é de " + moedas[3] + df.format(resultado));
                    } else if (opcaoDeconvercao == 5) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[8] / taxasDeCambio[4]);
                        System.out.println("Seu valor em " + moedasAbreviadas[4] + " é de " + moedas[4] + df.format(resultado));
                    } else if (opcaoDeconvercao == 6) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[8] / taxasDeCambio[5]);
                        System.out.println("Seu valor em " + moedasAbreviadas[5] + " é de " + moedas[5] + df.format(resultado));
                    } else if (opcaoDeconvercao == 7) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[8] / taxasDeCambio[6]);
                        System.out.println("Seu valor em " + moedasAbreviadas[6] + " é de " + moedas[6] + df.format(resultado));
                    } else if (opcaoDeconvercao == 8) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[8] / taxasDeCambio[7]);
                        System.out.println("Seu valor em " + moedasAbreviadas[7] + " é de " + moedas[7] + df.format(resultado));
                    } else if (opcaoDeconvercao == 9) {
                        System.out.println("Você já se encontra nessa moeda. Escolha outra.");
                    } else if (opcaoDeconvercao == 10) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[8] / taxasDeCambio[9]);
                        System.out.println("Seu valor em " + moedasAbreviadas[9] + " é de " + moedas[9] + df.format(resultado));
                    }
                }
            } else if (moedaUsada == 10) {
                while (opcaoDeconvercao != 11) {
                    System.out.println("Digite para qual moeda será convertido:");
                    opcaoDeconvercao = leitura.nextInt();
                    if (opcaoDeconvercao == 1) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[9] / taxasDeCambio[0]);
                        System.out.println("Seu valor em " + moedasAbreviadas[0] + " é de " + moedas[0] + df.format(resultado));
                    } else if (opcaoDeconvercao == 2) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[9] / taxasDeCambio[1]);
                        System.out.println("Seu valor em " + moedasAbreviadas[1] + " é de " + moedas[1] + df.format(resultado));
                    } else if (opcaoDeconvercao == 3) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[9] / taxasDeCambio[2]);
                        System.out.println("Seu valor em " + moedasAbreviadas[2] + " é de " + moedas[2] + df.format(resultado));
                    } else if (opcaoDeconvercao == 4) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[9] / taxasDeCambio[3]);
                        System.out.println("Seu valor em " + moedasAbreviadas[3] + " é de " + moedas[3] + df.format(resultado));
                    } else if (opcaoDeconvercao == 5) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[9] / taxasDeCambio[4]);
                        System.out.println("Seu valor em " + moedasAbreviadas[4] + " é de " + moedas[4] + df.format(resultado));
                    } else if (opcaoDeconvercao == 6) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[9] / taxasDeCambio[5]);
                        System.out.println("Seu valor em " + moedasAbreviadas[5] + " é de " + moedas[5] + df.format(resultado));
                    } else if (opcaoDeconvercao == 7) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[9] / taxasDeCambio[6]);
                        System.out.println("Seu valor em " + moedasAbreviadas[6] + " é de " + moedas[6] + df.format(resultado));
                    } else if (opcaoDeconvercao == 8) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[9] / taxasDeCambio[7]);
                        System.out.println("Seu valor em " + moedasAbreviadas[7] + " é de " + moedas[7] + df.format(resultado));
                    } else if (opcaoDeconvercao == 9) {
                        System.out.println("Agora digite seu valor:");
                        valorInfomrado = leitura.nextDouble();
                        double resultado = valorInfomrado * (taxasDeCambio[9] / taxasDeCambio[8]);
                        System.out.println("Seu valor em " + moedasAbreviadas[8] + " é de " + moedas[8] + df.format(resultado));
                    } else if (opcaoDeconvercao == 10) {
                        System.out.println("Você já se encontra nessa moeda. Escolha outra.");
                    }
                }
            }
        }
    }
}