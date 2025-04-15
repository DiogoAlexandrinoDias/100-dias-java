package dia02;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        // Variáveis

        // Convenções de código em Java:
        // - Nomes de variáveis começam com letra minúscula.
        // - Nomes de classes começam com letra maiúscula.

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        // Tipos primitivos:
        // - int: números inteiros (ex: 1, 200)
        // - boolean: valores lógicos (true ou false)
        // - double: números decimais (ex: 8.1, 100.5)

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        // Média calculada por 3 usuários
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("Média de avaliações: " + media);

        String sinopse = """
                Filme: Top Gun: Maverick
                Gênero: Aventura
                Um clássico dos anos 80 com uma continuação emocionante!
                Ano de lançamento: """ + anoDeLancamento;
        System.out.println("\nSinopse:");
        System.out.println(sinopse);

        // Palavras reservadas como "class", "if" e "for" não podem ser usadas como nomes de variáveis.

        /*
         * Exemplo de erro:
         * int class = 10; // Erro! "class" é uma palavra reservada.
         *
         * Se quisermos guardar a média dividida por 2 em um tipo int,
         * precisamos fazer um casting (conversão de tipo), pois a média é um double.
         */

        int classificacao = (int) (media / 2);
        System.out.println("Classificação indicativa: " + classificacao);
    }
}
