package methodclasseabstrata;

public class Edge extends Carro {    

   public Edge(String fabricante, String tipoVeiculo){
       this.fabricante = fabricante;
       this.tipoVeiculo = tipoVeiculo;
   
       System.out.println("Fabricante:"+this.fabricante);
       System.out.println("O modelo é: "+this.tipoVeiculo);
       System.out.println("Seu veiculo é: EDGE");
              
   }
}
