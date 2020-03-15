package methodclasseabstrata;

public class Client {

    public static void main(String[] args) {
        CreatorFactoryCarro factory = new FactoryCarro();
        String fabricante = "FORD";
        String tipoVeiculo = "Seda";
        factory.getCarro(fabricante,tipoVeiculo);
    }

}
