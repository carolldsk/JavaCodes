package funcionarios;

public class Funcionario {
	int numero;
	String nome;
	
	Funcionario(){
		
	}
	
	
	
	Funcionario(int xNumero, String xNome){
		numero =  xNumero;
		nome   =  xNome;

	}
	
	void trabalha() {
		System.out.println("Funcionario que trabalha");
	}
	public int getNumero() {
		// TODO Auto-generated method stub
		return numero;
	}
	
	public String getNome() {
		// TODO Auto-generated method stub
		return nome;
	}
	
	public void setNome(String string) {
		// TODO Auto-generated method stub
		
	}
	
	public void setNumero(int i) {
		// TODO Auto-generated method stub
		
	}



	public int getBonificacao() {
		return  10;
	}
}
