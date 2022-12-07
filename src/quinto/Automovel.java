package quinto;

public class Automovel {

	private String placa;
	private String modelo;
	private String tipoCombustivel;
	private String chassi;
	
	public Automovel(String placa, String modelo, String tipoCombustivel, String chassi) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.tipoCombustivel = tipoCombustivel;
		this.chassi = chassi;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
}