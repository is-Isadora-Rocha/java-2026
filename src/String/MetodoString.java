package String;

public class MetodoString {
    public static void main(String[] args) {
        // String pool -> reaproveitam o mesmo objeto | pegadinha do (==)
        String a = "java";
        String b = "java";
        String c = new String("java");

        System.out.println(a == b); // true  (mesmo objeto no pool)
        System.out.println(a == c); // false (new cria objeto novo)
        System.out.println(a.equals(c)); //true, conteúdo igual

        /*para comparar textos, usar sempre .equals() (ou .equalsIgnoreCase()).
        (==) compara endereço, igual nos arrays e wrappers.*/

        String senha = "abc";
        if (senha.equals("abc")) {}
        if ("abc".equals(senha)) {} //não dá NPE se senha for null

        // ##########################
        // #### TAMANHO E ACESSO ####
        // ##########################

        String s = "Java"; //[0]J[1]a[2]v[3]a
        s.length(); // 4
        s.charAt(0); //'J'
        //s.charAt(4); -> Error: SIOOBE


        // ###################################
        // #### MAIUSCULAS, MIN E ESPAÇOS ####
        // ###################################

        //trim e strip -> remover espaços nas extremidades

        "java".toUpperCase();        // "JAVA"
        "JAVA".toLowerCase();        // "java"
        "  oi  ".trim();             // "oi"  (remove espaços das pontas)
        "  oi  ".strip();            // "oi"

        // ###################################
        // #### BUSCAR DENTRO DO TEXTO #######
        // ###################################

        String n = "banana";

        n.indexOf("n"); //2
        n.lastIndexOf("n"); //4 (última)
        n.contains("nan"); //true
        n.startsWith("ba");      // true
        n.endsWith("na");        // true
        n.isEmpty();             // false (length == 0)
        "   ".isBlank();         // true  (vazia ou só espaços, Java 11+)

        // #####################
        // #### RECORTAR #######
        // #####################

        String v = "programação";

        v.substring(3); // gramacao (do índice 3 até o fim)
        v.substring(0, 4); //prog (do 0 até ANTES do 4)

        // #############################
        // #### TROCAR E DIVIDIR #######
        // #############################

        "banana".replace("a", "o"); //bonono

        String csv = "Ana,Bia,Caio";
        //split devolve um array
        String[] partes = csv.split(","); // ["Ana", "Bia", "Caio"]
        System.out.println(partes[1]); //Bia

        // #####################
        // #### COMPARAR #######
        // #####################

        "abc".equals("abc");              // true
        "abc".equalsIgnoreCase("ABC");    // true
        "a".compareTo("b");               // negativo (a vem antes de b)

        // #####################
        // #### CONVERTER ######
        // #####################

        String.valueOf(123);        // "123"  (int -> String)
        Integer.parseInt("123");    // 123    (String -> int)
        Double.parseDouble("3.5");  // 3.5

        "Java".toCharArray();       // ['J','a','v','a'] (String -> char[])
        String.join("-", "a", "b", "c");   // "a-b-c"
        "ab".repeat(3);    // "ababab"

        // #####################
        // #### FORMATAR #######
        // #####################

        String msg = String.format("Olá, %s! Você tem %d anos.", "Isadora", 24); //Olá, Isadora! Você tem 24 anos.
        double preco = 19.9;
        String p = String.format("R$ %.2f", preco);  // "R$ 19.90"
    }
}
