package dia02;

public class Condicional {
    public static void main(String[] args) {

        // Variáveis do filme
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        // if = estrutura condicional
        // A gente usa o if pra verificar se uma condição é verdadeira
        // Se for, o código dentro do bloco { } é executado

        // Verifica se o filme é lançamento
        // Aqui a gente checa se o ano é 2022 ou mais recente
        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            // else = senão
            // Se a condição do if for falsa, o código dentro do else é executado
            System.out.println("Filme retrô que vale a pena assistir");
        }

        // Verificação de acesso ao filme usando operador lógico E (&&)
        // Aqui a gente está checando duas condições AO MESMO TEMPO:
        // 1 - O filme está incluído no plano?
        // 2 - O tipo do plano é "plus"?
        // Ambas precisam ser verdadeiras para liberar o acesso
        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }

        // Versão alternativa usando operador lógico OU (||)
        // || = OU lógico
        // Se PELO MENOS uma das condições for verdadeira, o código dentro do if é executado
        /*
        if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
        */

        // Explicação dos operadores:
        // - && (E lógico): as DUAS condições precisam ser verdadeiras
        // - || (OU lógico): APENAS UMA precisa ser verdadeira
    }
}
