package segundo;

public class Segundo {

	public void imprimeDataContratacao(Funcionario func) {
		Date data = func.getDataContratacao();
		String msg = data.toString();
		String msg = func.getDataContratacaoFormatada();
		System.out.println(msg);
	}

	@Override
	public String toString() {
		return "Segundo []";
	}
}