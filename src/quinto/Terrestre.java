package quinto;

public class Terrestre extends Veiculo{

    private String placa;
    private String chassi;

    public Terrestre(String tipo, String modelo, String tipoCombustivel,String placa, String chassi) {
            super(tipo, modelo, tipoCombustivel);
            this.placa = placa;
            this.chassi = chassi;
    }
}
