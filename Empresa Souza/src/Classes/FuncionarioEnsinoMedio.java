package Classes;

public class FuncionarioEnsinoMedio extends FuncionarioBasico{
	
	
	//Atributo do funcionario que possui o ensino medio.
	private  String escolaEnsinoMedio;
	//***************************************************************

	
	//Métodos Getters e Setters
	public String getEscolaEnsinoMedio() {
		return escolaEnsinoMedio;
	}

	public void setEscolaEnsinoMedio(String escolaEnsinoMedio) {
		this.escolaEnsinoMedio = escolaEnsinoMedio;
	}
	//***************************************************************

		
	/*Construtor da classe com nome,codigo, escola de ensino basico - classe pai, e 
	  o colegio do ensino medio.
	*/
	public FuncionarioEnsinoMedio(String nome, int codigo, String escolaEnsinoBasico,String escolaEnsinoMedio) {
		super(nome,codigo,escolaEnsinoBasico);
		this.escolaEnsinoMedio=escolaEnsinoMedio;
		RendaTotal(50);// 50 % de aumento por se tratar de um funcionario com ensino medio
	}
	//***************************************************************
	
	
}
