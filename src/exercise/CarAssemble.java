package exercise;

public class CarAssemble {

    // calcular a taxa de produção por hora
    public double productionRatePerHour(int speed){

        double taxaSucesso = switch (speed){ //variavel taxa recebe o speed
            case 1, 2, 3, 4 -> 1.0;
            case 5, 6, 7, 8 -> 0.9;
            case 9          -> 0.8;
            case 10         -> 0.77;
            default         -> 0.0;
        };

        double producaoBruta = speed * 221;  //produção bruta recebe o valor da porcentagem * carro por hora
        return producaoBruta * taxaSucesso;
        }

        public int workingItemsPerMinute(int speed) {
        double porHora = productionRatePerHour(speed); //variavel recebe o retorno do method por hora
        return (int) (porHora / 60); //transforma o method por hora em minuto
    }
}
