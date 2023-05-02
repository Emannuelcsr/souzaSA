package Classes;

public class FuncionarioEnsinoSuperior extends FuncionarioEnsinoMedio {
	
	//Atributo do funcionario que possui o ensino superior.
	private String universidade;
	//***************************************************************


	//Métodos Getters e Setters
	public String getUniversidade() {
		return universidade;
	}

	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}
	//***************************************************************

	
	/*Construtor da classe com nome,codigo, escola de ensino basico,escola de ensino medio - classe pai, 
	 e a universidade.	
	*/
	public FuncionarioEnsinoSuperior(String nome,int codigo,String escolaEnsinoBasico, String escolaEnsinoMedio, 
			String universidade) {
		super(nome,codigo ,escolaEnsinoBasico, escolaEnsinoMedio);
		this.universidade = universidade;
		RendaTotal(100); // 100% de aumento por se tratar de um funcionario com ensino superior.
		}
}
