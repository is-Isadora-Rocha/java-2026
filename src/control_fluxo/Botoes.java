package control_fluxo;

public class Botoes {
    public static void main(String[] args) {
        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            default:
                System.out.println("Another day");
                break;
        }

        switch (dia) {
            case 1 -> System.out.println("Dom");
            case 2 -> System.out.println("Seg");
            case 3 -> System.out.println("Ter");
            default -> System.out.println("another day");
        }

        switch (dia) {
            case 1, 7 -> System.out.println("Fim de Semana");
            case 2, 3, 4, 5, 6 -> System.out.println("Dia útil");
            default -> System.out.println("Dia inválido");
        }

        String comando = "iniciar";
        switch (comando){
            case "iniciar" -> System.out.println("Começando");
            case "parar" -> System.out.println("Parando");
            default -> System.out.println("Comando desconhecido");
        }

        String nome = switch (dia) {
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            default -> "Outro dia";
        }; //ponto e vírgula pq é uma atribuição

        System.out.println(nome); //terça

        //BLOCO YIELD
        String tipo = switch (dia) {
            case 1, 7 -> "Fim de semana";
            case 2, 3, 4, 5, 6 -> {
                String msg = "Dia útil";
                System.out.println("Calculando...");
                yield msg;
            }
            default -> throw new IllegalArgumentException("Dia inválido: " + dia);
        };

        //USO DE ENUM NÃO PRECISA DE DEFAULT
        enum Status { ATIVO, INATIVO, BLOQUEADO}

        Status s = Status.ATIVO;
        String txt = switch (s) {
            case ATIVO -> "Ativo";
            case INATIVO -> "Inativo";
            case BLOQUEADO -> "Bloqueado";
        };
    }
}
