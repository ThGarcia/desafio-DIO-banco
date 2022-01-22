
public class Main {

	public static void main(String[] args) {
		
		Cliente thiago = new Cliente();
		thiago.setNome("Thiago");
		Cliente rafael = new Cliente();
		rafael.setNome("Rafael");

		Conta cc = new ContaCorrente(thiago);
		Conta cp = new ContaPoupanca(rafael);
		
		cc.depositar(100);
		cc.transferir(75, cp);
		
		System.out.println("================================");
		cc.imprimirExtrato();
		System.out.println("================================");
		cp.imprimirExtrato();
		System.out.println("================================");
		
	}

}