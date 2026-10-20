package exercise.Strings;

public class LogLevels {
    public static String message(String logLine) {

        /*
        int pos = logLine.indexOf(":");  // salvo a posição do " : "
        String atual = logLine.substring(pos + 1); // procura o : em cada texto e o +1 anda uma casa a partir dali
        return atual.trim();
         */

        // #1
        return logLine.substring(logLine.indexOf(":") + 1).trim();
    }

    public static String logLevel(String logLine) {
        int fecha = logLine.indexOf("]"); //var armazena o "]" variavel nas posições => [ERROR>]<, [WARNING>]<...
        return logLine.substring(1, fecha).toLowerCase(); // substring 1 pq o [ é fixo
    }

    public static String reformat(String logLine) {
        String mensagem = message(logLine); //chama o method que devolve o texto depois do ":"
        String nivel = logLevel(logLine); //chama o method acima que devolve a palavra entre colchetes

        return mensagem + " (" + nivel + ")"; //concatena
    }
}

/*

#1 -> LogLevels.message("[ERROR]: Invalid operation")
// => "Invalid operation"

#2 -> retornar o nível de log de uma linha de log, que deve ser retornado em minúsculas:
* LogLevels.logLevel("[ERROR]: Invalid operation")
// => "error"

#3 -> reformata a linha de log, colocando a mensagem primeiro e o nível de log entre parênteses em seguida:
LogLevels.reformat("[INFO]: Operation completed")
// => "Operation completed (info)"

*/

