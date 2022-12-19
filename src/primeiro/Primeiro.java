package primeiro;

public class Primeiro {

	void sendMail(ContaBancaria conta, String msg) {
		Cliente cliente = conta.getCliente();
	void sendMail(Cliente cliente, String msg) {
		String endereco = cliente.getMailAddress();
		System.out.println("Envia mail");
			}
	}
}