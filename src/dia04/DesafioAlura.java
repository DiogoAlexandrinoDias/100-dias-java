package dia04;

import java.util.Scanner;

public class DesafioAlura {
    public static void main(String[] args) {
        String nome = "Diogo";
        String tipoConta = "Corrente";
        double saldo = 200.00;
        int opecao = 0;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");

        Scanner leitura =  new Scanner(System.in);

        String menu = """
                Operações
                
                1- Consultar saldos
                2- Transferir valor
                3- Receber valor
                4- Sair
                """;




        while (opecao != 4 ){
            System.out.println(menu);
            opecao = leitura.nextInt();
            if (opecao == 1){
                System.out.println("Esse e o seu saldo R$" + saldo);
            } else if (opecao == 2 ) {
                System.out.println("Digite a quantidade que vai tranferir");
                double  transferir;
                transferir = leitura.nextInt();
                if (transferir > saldo){
                    System.out.println("Essa tranferencia não pode ser feita por ser maior que saldo do conta");
                    System.out.println("Esse e seu saldo atual R$" + saldo);
                }else {
                    double Transferido = saldo-transferir;
                    System.out.println("Transação foi feita com sucesso");
                    System.out.println("Esse e seu saldo atual R$" + Transferido );
                }
            } else if (opecao == 3) {
                System.out.println("Digite a quantidade que vc Recebeu");
                double receber ;
                receber = leitura.nextDouble();
                double saldoRecebido = saldo + receber ;
                System.out.println("Esse e seu saldo atual R$" + saldoRecebido);
            }else {
                System.out.println("saindo do app");
            }

        }

    }
}
