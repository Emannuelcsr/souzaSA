package Classes;

public abstract  class Funcionarios {
	
	//Atributos dos funcionarios.
	protected String nome;
	protected double renda=1000;
	protected int codigo;
	//***************************************************************
	
	
	//Métodos Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getRenda() {
		return renda;
	}
	
	public void setRenda(double renda) {
		this.renda = renda;
	}
	//***************************************************************
	
	
	//Construtor para o nome e o codigo.
	public Funcionarios(String nome,int codigo) {
		this.nome=nome;	
		this.codigo=codigo;
	}	
	//***************************************************************
	
	//Construtor para a renda
	public Funcionarios(double renda) {
		this.renda=renda;
	}
	//***************************************************************

	
	//Método que retorna a renda de um funcionario
	public void RendaTotal(double porcentagem) {
	    this.renda = this.renda *(1+porcentagem/100);
	    }
	//***************************************************************
	
}