package primeiro;

public class Primeiro {

	void sendMail(Cliente cliente, String msg) {
		String endereco = cliente.getMailAddress();
		System.out.println("Envia mail");
	}
}