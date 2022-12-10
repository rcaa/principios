package quinto;

public class Barco implements Transporte {

	private String modelo;
	private String tipoCombustivel;

	public Barco(tring modelo, String tipoCombustivel) {
		super();
		this.modelo = modelo;
		this.tipoCombustivel = tipoCombustivel;
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
}