
public class ContaPoupanca extends Conta {

	@Override
	public void imprimirExtrato() {
		System.out.printIn("*** Extrato Conta Poupanca ***");
	    super.imprimirInfosComuns();
	}

	
}
