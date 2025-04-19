package dia04;

import java.io.File;
import java.util.Scanner;

public class ConversoDeDinherio {
    public static void main(String[] args) {
        int moedaUsada = 0;
        int opcaoDeconvercao = 0;
        double valorEmUSD;
        double valorEmEUR;
        double valorEmGBP;
        double valorEmJPY;
        double valorEmCNY;
        double valorEmCHF;
        double valorEmAUD;
        double valorEmCAD;
        double valorEmARS;
        double valorEmBRL;

        Scanner leitura = new Scanner(System.in);
        String menu = """
                Bem vindo ao converto de moeda
                
                Escolhaa uma das moedas a baixo
                
                1-  USD     |Dólar Americano	|Estados Unidos
                2-  EUR     |Euro	            |Zona do Euro
                3-  GBP     |Libra Esterlina	|Reino Unido
                4-  JPY     |Iene Japonês	    |Japão
                5-  CNY     |Yuan Chinês	    |China
                6-  CHF     |Franco Suíço	    |Suíça
                7-  AUD     |Dólar Australiano  |Austrália
                8-  CAD     |Dólar Canadense	|Canadá
                9-  ARS     |Peso Argentino	    |Argentina
                10- BRL     |Real Brasileiro	|Brasil
                
                """;

        String listaDEmoedas;

        while (moedaUsada != 11) {
            System.out.println(menu);
            System.out.println("Digite a opção que gostaria");
            moedaUsada = leitura.nextInt();

            if (moedaUsada == 1) {
                while (opcaoDeconvercao != 11) {
                    System.out.println("Digite em qual moeda vai ser convertido");
                    opcaoDeconvercao = leitura.nextInt();
                    if (opcaoDeconvercao == 1) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmUSD = leitura.nextDouble();


                    } else if (opcaoDeconvercao == 2) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmUSD = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 3) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmUSD = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 4) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmUSD = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 5) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmUSD = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 6) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmUSD = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 7) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmUSD = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 8) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmUSD = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 9) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmUSD = leitura.nextDouble();
                    }
                }
            } else if (moedaUsada == 2) {
                while (opcaoDeconvercao != 11) {
                    System.out.println("Digite o valor a ser convertido");
                    opcaoDeconvercao= leitura.nextInt();
                    if (opcaoDeconvercao == 1) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmEUR = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 2) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmEUR = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 3) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmEUR = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 4) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmEUR = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 5) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmEUR = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 6) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmEUR = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 7) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmEUR = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 8) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmEUR = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 9) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmEUR = leitura.nextDouble();
                    }
                }

            } else if (moedaUsada == 3) {
                while (opcaoDeconvercao != 11) {
                    System.out.println("Digite o valor a ser convertido");
                    valorEmGBP = leitura.nextDouble();
                    if (opcaoDeconvercao == 1) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmGBP = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 2) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmGBP = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 3) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmGBP = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 4) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmGBP = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 5) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmGBP = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 6) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmGBP = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 7) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmGBP = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 8) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmGBP = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 9) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmGBP = leitura.nextDouble();
                    }
                }

            } else if (moedaUsada == 4) {
                while (opcaoDeconvercao != 11) {
                    System.out.println("Digite o valor a ser convertido");
                    valorEmJPY = leitura.nextDouble();
                    if (opcaoDeconvercao == 1) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmJPY = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 2) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmJPY = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 3) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmJPY = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 4) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmJPY = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 5) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmJPY = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 6) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmJPY = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 7) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmJPY = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 8) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmJPY = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 9) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmJPY = leitura.nextDouble();
                    }
                }

            } else if (moedaUsada == 5) {
                while (opcaoDeconvercao != 11) {
                    System.out.println("Digite o valor a ser convertido");
                    valorEmCNY = leitura.nextDouble();
                    if (opcaoDeconvercao == 1) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmCNY = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 2) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmCNY = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 3) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmCNY = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 4) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmCNY = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 5) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmCNY = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 6) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmCNY = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 7) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmCNY = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 8) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmCNY = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 9) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmCNY = leitura.nextDouble();
                    }
                }

            } else if (moedaUsada == 6) {
                while (opcaoDeconvercao != 11) {
                    System.out.println("Digite o valor a ser convertido");
                    valorEmCHF = leitura.nextDouble();
                    if (opcaoDeconvercao == 1) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmCHF = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 2) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmCHF = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 3) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmCHF = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 4) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmCHF = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 5) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmCHF = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 6) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmCHF = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 7) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmCHF = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 8) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmCHF = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 9) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmCHF = leitura.nextDouble();
                    }
                }

            } else if (moedaUsada == 7) {
                while (opcaoDeconvercao != 11) {
                    System.out.println("Digite o valor a ser convertido");
                    valorEmAUD = leitura.nextDouble();
                    if (opcaoDeconvercao == 1) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmAUD = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 2) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmAUD = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 3) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmAUD = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 4) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmAUD = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 5) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmAUD = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 6) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmAUD = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 7) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmAUD = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 8) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmAUD = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 9) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmAUD = leitura.nextDouble();
                    }
                }

            } else if (moedaUsada == 8) {
                while (opcaoDeconvercao != 11) {
                    System.out.println("Digite o valor a ser convertido");
                    valorEmCAD = leitura.nextDouble();
                    if (opcaoDeconvercao == 1) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmCAD = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 2) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmCAD = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 3) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmCAD = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 4) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmCAD = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 5) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmCAD = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 6) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmCAD = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 7) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmCAD = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 8) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmCAD = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 9) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmCAD = leitura.nextDouble();
                    }
                }

            } else if (moedaUsada == 9) {
                while (opcaoDeconvercao != 11) {
                    System.out.println("Digite o valor a ser convertido");
                    valorEmARS = leitura.nextDouble();
                    if (opcaoDeconvercao == 1) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmARS = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 2) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmARS = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 3) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmARS = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 4) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmARS = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 5) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmARS = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 6) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmARS = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 7) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmARS = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 8) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmARS = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 9) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmARS = leitura.nextDouble();
                    }
                }

            } else if (moedaUsada == 10) {
                while (opcaoDeconvercao != 11) {
                    System.out.println("Digite o valor a ser convertido");
                    opcaoDeconvercao = leitura.nextInt();
                    if (opcaoDeconvercao == 1) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmBRL = leitura.nextDouble();
                        double resultado = valorEmBRL / 5.10 ;
                        System.out.println("Seu valor em reis para fica de $" + resultado);
                    } else if (opcaoDeconvercao == 2) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmBRL = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 3) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmBRL = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 4) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmBRL = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 5) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmBRL = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 6) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmBRL = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 7) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmBRL = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 8) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmBRL = leitura.nextDouble();
                    } else if (opcaoDeconvercao == 9) {
                        System.out.println("Digite o valor a ser convertido");
                        valorEmBRL = leitura.nextDouble();
                    }
                }

            }
        }
    }
}
