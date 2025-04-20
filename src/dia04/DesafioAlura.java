package dia04;

import java.util.Scanner;

public class DesafioAlura {
    public static void main(String[] args) {
        String nome = "Diogo";
        String tipoConta = "Corrente";
        double saldo = 200.00;
        int opcao = 0; // Corrigido nome da variável

        System.out.println("***********************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: R$" + saldo);
        System.out.println("***********************");

        Scanner leitura = new Scanner(System.in);

        String menu = """
                \nOperações:
                1- Consultar saldo
                2- Transferir valor
                3- Receber valor
                4- Sair
                Digite sua opção: """;

        while (opcao != 4) {
            System.out.print(menu);
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1 -> // Consultar saldo
                        System.out.printf("\nSaldo atual: R$%.2f%n", saldo);

                case 2 -> { // Transferência
                    System.out.print("\nValor a transferir: R$");
                    double valorTransferencia = leitura.nextDouble();

                    if (valorTransferencia > saldo) {
                        System.out.println("\nErro: Saldo insuficiente!");
                    } else {
                        saldo -= valorTransferencia; // Atualiza saldo
                        System.out.printf("\nTransferência realizada!\nNovo saldo: R$%.2f%n", saldo);
                    }
                }

                case 3 -> { // Recebimento
                    System.out.print("\nValor recebido: R$");
                    double valorRecebido = leitura.nextDouble();
                    saldo += valorRecebido; // Atualiza saldo
                    System.out.printf("\nDepósito realizado!\nNovo saldo: R$%.2f%n", saldo);
                }

                case 4 -> // Saída
                        System.out.println("\nEncerrando sistema...");

                default ->
                        System.out.println("\nOpção inválida!");
            }
        }
        leitura.close();
    }
}