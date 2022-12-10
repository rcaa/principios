package quarto;

public class CadastroLoja {

	public static void main(String[] args) {
		Loja loja = new Loja();
		Shopping shopping = new Shopping();
		shopping.addLoja(loja);
	}
}