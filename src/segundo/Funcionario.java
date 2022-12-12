package segundo;

import java.util.Date;

public class Funcionario {

	private Date dataContratacao;

	public Date getDataContratacao() {
		return dataContratacao;
	}

	public String getDataContratacaoFormatada() {
		Date data = this.getDataContratacao();
		return data.toString();
	}
}
