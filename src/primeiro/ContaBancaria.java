package primeiro;

public class ContaBancaria {

	private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	void enviarEmailParaCliente(String mensagem) {
		String destinatario = cliente.getMailAddress();
		new Primeiro().enviarEmail(destinatario, mensagem);
	}
}
