package funcionarios;

public class Diretor extends Funcionario implements Autenticavel {
	
	private  String senha = "123";
	
	public int getBonificacao() {
		return 60;
	}
	
	
	public boolean autentica(String senha) {
		if(this.senha != senha) {
			return false;
		}
		else {
			return true;
		}
	}
	
	

}
