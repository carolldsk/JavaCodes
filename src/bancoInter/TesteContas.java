package bancoInter;

public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		System.out.println(cc.getTipo());
		cc.deposita(100);
		cc.saque(10);
		
		
		ContaPoupanca cp = new ContaPoupanca();
		System.out.println(cp.getTipo());
		cp.deposita(100);
		cp.saque(10);
		
		System.out.println(cp.getSaldo());
		
	}
	
	
}
