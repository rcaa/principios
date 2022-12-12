package quinto;

public class Automovel extends Veiculo{

	private String placa;
	private String chassi;
	
	public Automovel(String placa, String modelo, String tipoCombustivel, String chassi) {
		super(modelo, tipoCombustivel);
		this.placa = placa;
		this.chassi = chassi;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
}