package String;

public class BuilderString {
    public static void main(String[] args) {

        // O problema da concatenação em laço
        //Como String é imutável, cada += cria um objeto novo e descarta o anterior:

        String resultado = "";

        for (int i = 0; i < 10000; i++) {
            resultado += i;  // cria 10.000 Strings intermediárias
        }

        //A SOLUÇÃO
        //StringBuilder é uma String mutável: altera o mesmo objeto, sem criar cópias.

        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < 10000; i++) {
            sb2.append(i);
        }

        resultado = sb2.toString(); // no final, converte para String

        System.out.println(resultado);

        //############################
        //#### MÉTODOS PRINCIPAIS ####
        //############################

        StringBuilder sb = new StringBuilder("Java");
        sb.append(" é legal");        // "Java é legal"
        sb.insert(0, ">> ");          // ">> Java é legal"
        sb.reverse();                 // inverte tudo
        sb.setCharAt(0, 'X');         // troca um caractere
        sb.deleteCharAt(0);           // remove um caractere
        sb.length();                  // tamanho
        sb.toString();                // vira String
    }
}
