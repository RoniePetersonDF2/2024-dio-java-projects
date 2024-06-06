public class Main {

	public static void main(String[] args) {
		try {
			Cliente c1 = new Cliente();
			c1.setNome("João");
			
			Conta cc1 = new ContaCorrente(c1);
			Conta pp1 = new ContaPoupanca(c1);
			
			cc1.depositar(100);
			cc1.transferir(35, pp1);
			
			cc1.imprimirExtrato();
			pp1.imprimirExtrato();
			
			Cliente c2 = new Cliente();
			c2.setNome("Maria");
			Conta pp2 = new ContaPoupanca(c2);
			
			pp2.depositar(60);
			pp2.imprimirExtrato();
			
			
			Banco b1 = new Banco("BCB");
			b1.adicionarConta(cc1);
			b1.adicionarConta(pp1);
			b1.adicionarConta(pp2);
			
			System.out.println("Imprimindo contas");
			System.out.println(b1);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
