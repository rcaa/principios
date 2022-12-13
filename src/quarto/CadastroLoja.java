package quarto;

public class Main {

	public static void main(String[] args) {
		Loja loja = new Loja();
		Shopping shopping = new Shopping();
		shopping.getLojas().add(loja);
	}
}