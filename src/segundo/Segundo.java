package segundo;

import java.util.Date;

public class Segundo {

	public void imprimeDataContratacao(Funcionario func) {
		String msg = func.getDataContratacaoFormatada();
		System.out.println(msg);
	}
}