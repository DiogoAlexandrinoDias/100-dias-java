package dia03;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        //Scaner = Receber um dado do usuario de fora (Teclado para terminal)
        Scanner leitura =  new Scanner(System.in);

        // pedindo uma filme para usuario
        System.out.println("Digite seu filme favorito");

        // recebendo e falando o filme que foi digitado
        String filme = leitura.nextLine();
        System.out.println(filme);
        System.out.println("Qual ano de lançamento");
        // recebendo e ano do filme mas com variavel de INT
        int anoDeLancamento = leitura.nextInt();
        System.out.println(anoDeLancamento);
        // recebendo a nota do filme mas com variavel de double
        System.out.println("Diga sua avalição para o filme");
        double avalicao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avalicao);
    }
}
