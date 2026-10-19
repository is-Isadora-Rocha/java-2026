package String;

public class SobreString {
    public static void main(String[] args) {
        //IMUTABILIDADE -> Uma String nunca muda depois de criada. All method que “altera” devolve uma nova String.

        String nome = "Isadora";
        nome.toUpperCase(); //printa Isadora  -> Porque toUpperCase() devolve uma nova String, mas não guardou o resultado.
        nome = nome.toLowerCase(); // -> guardou o resultado
        System.out.println(nome); //ISADORA

        String s = "java";
        s.toUpperCase();
        s = s.toUpperCase();
        System.out.println(s);

        //length() - tamanho
        String ling = "Java";
        System.out.println(ling.length()); //4

        //charAt() - obter caractere pela posição
        System.out.println(ling.charAt(0)); //J

        //contains() - verifica se contém texto - A busca diferencia letras maiúsculas de minúsculas.
        String frase = "Estou estudando Java";
        System.out.println(frase.contains("Java")); //true

        //isEmpty() = verifica se o tamanho é zero
        //isBlank() = apenas por espaços em branco
        String a = "";
        String b = "   ";

        System.out.println(a.isEmpty()); // true
        System.out.println(b.isEmpty()); // false

        System.out.println(a.isBlank()); //true
        System.out.println(b.isBlank()); // true

    }
}
