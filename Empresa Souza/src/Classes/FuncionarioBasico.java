package Classes;

public class FuncionarioBasico extends Funcionarios {
	
	
	//Atributo do funcionario que possui o ensino basico.
	private String escolaEnsinoBasico;
	//***************************************************************
	
		
	//Métodos Getters e Setters
	public String getEscolaEnsinoBasico() {
		return escolaEnsinoBasico;
	}

	public void setEscolaEnsinoBasico(String escolaEnsinoBasico) {
		this.escolaEnsinoBasico = escolaEnsinoBasico;
	}
	//***************************************************************
	
	
	//Construtor da classe com nome e codigo da classe pai,e a escola
	public FuncionarioBasico(String nome, int codigo,String escolaEnsinoBasico) {
		super(nome,codigo);
		this.escolaEnsinoBasico=escolaEnsinoBasico;
		RendaTotal(10); //10% de aumento por se tratar de um funcionario com o ensino basico.
	}	
	//***************************************************************
	
}
