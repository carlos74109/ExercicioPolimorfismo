package Entidades;

public class FuncionarioTercerizado extends Funcionario {
	
	protected Double adicional;

	public FuncionarioTercerizado() {
		super();
	}

	public FuncionarioTercerizado(String nome, Integer hora, Double valorPorhora, Double adicional) {
		super(nome, hora, valorPorhora);
		this.adicional = adicional;
	}

	public Double getAdicional() {
		return adicional;
	}

	public void setAdicional(Double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public double pagamento() {
		double media = adicional * 1.1;
		return super.pagamento() + media;
		
	}
	
}
