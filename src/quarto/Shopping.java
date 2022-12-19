package quarto;

import java.util.ArrayList;
import java.util.List;

public List<Loja> getLojas() {
	return lojas;
}

public void addLoja(Loja loja) {
	this.getLojas().add(loja);
}
}