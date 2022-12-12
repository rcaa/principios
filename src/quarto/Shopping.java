package quarto;

import java.util.ArrayList;
import java.util.List;

public class Shopping {

	private List<Loja> lojas;

	public Shopping() {
		lojas = new ArrayList<>();
	}

	public List<Loja> getLojas() {
		return lojas;
	}

	public void addLoja(Loja loja) {
		this.getLojas().add(loja);
	}
}