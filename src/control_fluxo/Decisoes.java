package control_fluxo;

public class Decisoes {
    public static void main(String[] args) {
        int idade = 20;
        boolean temDocumento = true;

        if (idade >= 18 && temDocumento) {
            System.out.println("Pode entrar");
        } else {
            System.out.println("Não pode entrar");
        }

        if (temDocumento) {
            if (idade >= 18) {
                System.out.println("Pode entrar");
            }
        }

        String status = (idade >= 18) ? "adulto" : "menor";
        System.out.println(status);


        int nota = 7;
        if (nota >= 9) {
            System.out.println("Excelente!");
        } else if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado!");
        }

        // COMPARAR STRING
        String senha = "abc";
        if (senha.equals("abc")) { }
        if (senha == "abc") { } // compara referência, não o conteúdo
    }
}