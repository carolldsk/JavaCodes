package funcionarios;

public class Teste {
	
	public static void main(String[] args) {
		/*Funcionario f1 =  new Funcionario(545, "Joao1");
		f1.setNome("Joao");
		f1.setNumero(123);
		System.out.println(f1.getNome());
		System.out.println(f1.getNumero());
	
		
		Motorista m1 = new Motorista(4454, "Tester");
		
		m1.setNome("Luiz");
		m1.setNumero(12543);
		System.out.println(m1.getNome());
		System.out.println(m1.getNumero());
		m1.trabalha();
		m1.dirige();
		
		
		Funcionario f2 = new Funcionario (758, "Maria");
		System.out.println(f2.getNome());
		
		Motorista m2 = new Motorista (75558, "Mariaaw");
		System.out.println(m2.getNome());*/
		
		
		
		
		Funcionario f1 =  new Funcionario();
		f1.setNome("Joao");
		f1.setNumero(123);
		
		Funcionario[] arrayFunc = new Funcionario[3]; 
		
		arrayFunc[0] = f1;
		
		arrayFunc[1] = new Funcionario(742, "Carol");
		
		arrayFunc[2] = new Motorista(1048, "Novo motorista");
		System.out.println(arrayFunc[0].getNome());
		System.out.println(arrayFunc[1].getNome());
		arrayFunc[2].trabalha();
		
		
		ControleBonificacao cb = new ControleBonificacao();
		cb.registra(f1);
		cb.registra(arrayFunc[2]);
		
		System.out.println(cb.getTotalBonificacao());
		
		
		
		
		
	}
}
