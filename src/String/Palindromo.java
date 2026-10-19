package String;

public class Palindromo {
    public static boolean ehPalindromo (String texto) {
        String limpo = texto.toLowerCase().replace(" ", "");
        String invertido = new StringBuilder(limpo).reverse().toString();
        return limpo.equals(invertido);
    }

    public static void main(String[] args) {
        System.out.println(ehPalindromo("arara")); //true
        System.out.println(ehPalindromo("subi no onibus")); //true
        System.out.println(ehPalindromo("java")); //false
    }
}
