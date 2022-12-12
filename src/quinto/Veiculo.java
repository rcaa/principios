package quinto;

public class Veiculo {
    
    private String modelo;
    private String tipoCombustivel; 
    private String tipo;

    public Veiculo(String tipo, String modelo, String tipoCombustivel){
        super();
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.tipo = tipo;
	}

    public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
