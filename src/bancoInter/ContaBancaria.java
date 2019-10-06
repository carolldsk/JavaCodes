package bancoInter;

public abstract class ContaBancaria {
	
	
	private String titular;
	protected double saldo;
	
	public abstract String getTipo();

	/**
	 * @param valor
	 */
	public void saque(double valor){
		saldo -= valor;
	}
	
	/**
	 * @param valor
	 */
	public void deposita(double valor){
		saldo += valor;
	}
	
	/**
	 * @return
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * @param titular
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * @return
	 */
	public double getSaldo(){
		return saldo;
	}
	

}
