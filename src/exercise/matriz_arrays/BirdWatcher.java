package exercise.matriz_arrays;

public class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    // CONFERIR OS NUMEROS DA SEMANA PASSADA
    public static int[] getLastWeek() {             // alguem chama = BirdWather.getLastWeek();
        return new int[] { 0, 2, 5, 3, 7, 8, 4 };   // java cria o array new int [] {0,2...} | tbm poderia ser escrito como int[]semana = new int[] {0, 2...}
        // return = method devolvendo o array - entrega para quem chamou
        // dentro de um return pode criar um array explicitamente com new int[]
    }

    // CONFERIR QUANTAS AVES VISITARAM HOJE
/*  o primeiro elemento sendo a contagem do dia mais antigo
    e o último elemento sendo a contagem de hoje.
    { 2, 5, 0, 7, 4, 1 }  => 1
*/
    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1]; // 6 - 1 = 5;

/*    valores:   2    5    0    7    4    1
      índice:    0    1    2    3    4    5

      o tamanho é 6 (length), mas o indice é de 0 a 5
      birdsPerDay.length       // 6  → quantidade
      birdsPerDay.length - 1   // 5  → índice do último

      Sem o -1 cairia no 6, no qual não existe
*/
    }


    //AUMENTAR A CONTADE DO DIA DE HOJE => { 2, 5, 0, 7, 4, >1< }  => 2 => { 2, 5, 0, 7, 4, 2 }
    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    //SE ALGUM DIA SEM PASSAROS
    public boolean hasDayWithoutBirds() {
        for (int count : birdsPerDay) {
            if (count == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;
        //int limite = numberOfDays;
        /*if (numberOfDays > birdsPerDay.length) {
            limite = birdsPerDay.length;
        } */

        int limite = Math.min(numberOfDays, birdsPerDay.length);

        for (int i = 0; i < limite; i++) {
            total += birdsPerDay[i];
        }
        return total;
    }

    // int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 }; = 2 (5,7)
    // um dia movimentado >= 5
    public int getBusyDays() {   //o que esse method faz
        int diasMovimentados = 0;  //para guardar a soma

        for (int mov : birdsPerDay) {  // cada volta, o mov recebe a contagem de passaros de um dia
            if (mov >= 5){  // se for maior ou igual a 5 faça
                diasMovimentados++;  //soma 1
            }
        }
        return diasMovimentados; //2
    }

}
