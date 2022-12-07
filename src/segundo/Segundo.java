package segundo;

import java.util.Date;

public class Segundo {

	public void imprimeDataContratacao(Funcionario func) {
		Date data = func.getDataContratacao();
		String msg = data.toString();
		System.out.println(msg);
	}
}