package methodclasseabstrata;

public class Fusion extends Carro{

   public Fusion(String fabricante, String tipoVeiculo){
       this.fabricante = fabricante;
       this.tipoVeiculo = tipoVeiculo;
   
       System.out.println("Fabricante:"+this.fabricante);
       System.out.println("O modelo é: "+this.tipoVeiculo);
       System.out.println("Seu veiculo é: FUSION");
              
   }
      
}
