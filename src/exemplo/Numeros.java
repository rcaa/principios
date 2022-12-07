package exemplo;

public class Numeros {

	public static int gerarInteiroAleatorio() {
		return (int) (Math.random() * 100);
	}
	
	public static void main(String[] args) {
		int aleatorio = Numeros.gerarInteiroAleatorio();
		System.out.println(aleatorio);
	}

}
