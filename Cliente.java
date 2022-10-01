package projeto;

public class Cliente extends Pessoa {
	//ATRIBUTOS
	
	private String conta = "633-5";
	private String agencia = "4658-8";
	private Double saldo = 10000.00;
	private Double pendencia = 0.0;
	
	//GET AND SET
	
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Double getPendencia() {
		return pendencia;
	}
	public void setPendencia(Double pendencia) {
		this.pendencia = pendencia;
	}
	
	
}
