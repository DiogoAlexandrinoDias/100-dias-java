package dia03;

import java.util.Scanner;

public class DesafioAlura {
    public static void main(String[] args) {
        Scanner leitura =  new Scanner(System.in);
        String nome = "Jacqueline Oliveira";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.00;

        String menu = """
                Operações
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair """;
        System.out.println(menu);

        System.out.println("Digite a Operações que deseja ");
        int Operacaoes = leitura.nextInt();
        System.out.println(Operacaoes);

        class Receber 

        if (Operacaoes == 2) {
            System.out.println("digite quanto recebeu");
            double Receber = leitura.nextDouble();
            double valorrecebido = saldoInicial + Receber;
            System.out.println(valorrecebido);
        } else if (Operacaoes == 3) {
            System.out.println("digite quanto Transferiu");
            double Transferir = leitura.nextDouble();
            double valortranferido = saldoInicial - Transferir;
            System.out.println(valortranferido);
        } else if (Operacaoes == 1 ) {
            boolean valorAtual = s

        }


    }
}
