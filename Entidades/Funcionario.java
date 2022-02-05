package Entidades;

public class Funcionario {
	
	protected String nome;
	protected Integer hora;
	protected Double valorPorhora;
	
	
	public Funcionario() {
		super();
	}


	public Funcionario(String nome, Integer hora, Double valorPorhora) {
		super();
		this.nome = nome;
		this.hora = hora;
		this.valorPorhora = valorPorhora;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getHora() {
		return hora;
	}


	public void setHora(Integer hora) {
		this.hora = hora;
	}


	public Double getValorPorhora() {
		return valorPorhora;
	}


	public void setValorPorhora(Double valorPorhora) {
		this.valorPorhora = valorPorhora;
	}
	
	
	public double pagamento() {
		return valorPorhora * hora;
	}
	
	@Override
	public String toString() {
		return "Nome: "+nome+ ", Pagamento: " + pagamento();
	}
	
}
