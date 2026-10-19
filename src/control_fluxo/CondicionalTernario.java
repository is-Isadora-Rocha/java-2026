package control_fluxo;

public class CondicionalTernario {
    public static void main(String[] args) {
        //String resultado = (condição) ? verdadeiro : falso;

        //Doar se salario > 5000
        double salario = 6000;

        //String msgDoar = "Vou doar 500 conto";
        //String msgNaoDoar = "Ainda não tenho condições";
        //String resultado = salario > 5000 ? msgDoar : msgNaoDoar;

        String resultado = salario > 500 ? "Eu vou dar 500" : "Ainda não tenho condições";
        System.out.println(resultado);



    }
}
