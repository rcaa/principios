package segundo;

import java.util.Date;

public class Funcionario {

	private Date dataContratacao;

	public Date getDataContratacao() {
		return dataContratacao;
	}

	public String getTextoDataContratacao() {
		return dataContratacao.toString();
	}
}
