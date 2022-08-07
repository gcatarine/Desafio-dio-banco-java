
public class ContaCorrente extends Conta{
	
	@Override
	public void imprimirExtrato() {
		System.out.printIn("*** Extrato Conta Corrente ***");
	    super.imprimirInfosComuns();
	}
}