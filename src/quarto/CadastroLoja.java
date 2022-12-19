package quarto;

public static void main(String[] args) {
	Loja loja = new Loja();
	Shopping shopping = new Shopping();
	shopping.getLojas().add(loja);
	shopping.addLoja(loja);
}
