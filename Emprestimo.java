package projeto;

public class Emprestimo extends Cliente{

	//ATRIBUTOS
	private Double valor = 0.0;
	private int parcelas = 0 ;
	private Double salario = 0.0;
	
	//GET AND SET
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public int getParcelas() {
		return parcelas;
	}
	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	//VOU DECLARAR OS METODOS DENTRO ABA CLIENTE DA NA CLASSE "METODOS"
	
}
