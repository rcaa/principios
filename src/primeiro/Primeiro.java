package primeiro;

public class Primeiro {

	void sendMail(ContaBancaria conta, String msg) {
		Cliente cliente = conta.getCliente();
		String endereco = cliente.getMailAddress();
		System.out.println("Envia mail");
	}
}