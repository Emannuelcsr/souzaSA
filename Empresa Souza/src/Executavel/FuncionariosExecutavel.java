package Executavel;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Classes.FuncionarioBasico;
import Classes.FuncionarioEnsinoMedio;
import Classes.FuncionarioEnsinoSuperior;
import Classes.Funcionarios;

public class FuncionariosExecutavel {

	public static void main(String[] args) throws InterruptedException {
		
		
		//Array dos funcionarios
		Funcionarios[] funcionarios = new Funcionarios[10];
		//********************************************************************************
		
		
		//Array com os nomes dos funcionarios
		String[]nomes = {"João Lucas", "Maria Aparecida", "José Afonso", "Ana Beatriz", "Pedro Albuquerque", 
				"Mariana Louise", "Lucas Fernando", "Juliana Castro", "Rafael Gastillo", "Carla Perez"};
		//********************************************************************************
		
		
		//Lista para armazenar os nomes dos funcionarios
		List<String> nomesSelecionados = new ArrayList<String>();
		//********************************************************************************

		
		//Gera o codigo do funcionario;
		int codigo=0;
		//********************************************************************************
		
		
		//Array das escolas, colegios e universidades
		String[]EscolaBasica = {"Escola do Saber","Escola São Judas Tadeu","Escola Cristo Rei"};
		String[]ColegioMedio = {"Colegio Bom Jesus","Colegio Dom Bosco","Colegio Positivo"};
		String[]Universidade = {"UFPR","UFSC","UNIAVAN"};
		//********************************************************************************
		
		
		
		//Variaveis para armazenar os salarios
		double somaBasico = 0.0;
		double somaMedio = 0.0;
		double somaSuperior = 0.0;
		double somaTotal = 0.0;
		//********************************************************************************

		
		//for para criar os funcionarios
		for(int i =0 ; i < 10 ; i ++) {
	        String nomeSelecionado;	

			//Seleciona randomicamente uma escola, colegio, universidade.
			Random rand = new Random();	
			String escolaSelecionada = EscolaBasica[rand.nextInt(EscolaBasica.length)];		
			String colegioSelecionado = ColegioMedio[rand.nextInt(ColegioMedio.length)];		
			String universidadeSelecionada = Universidade[rand.nextInt(Universidade.length)];		
			//********************************************************************************
	        
			
	        //Seleciona um nome que ainda nao foi selecionado
			do {
	            nomeSelecionado = nomes[rand.nextInt(nomes.length)];
	        } while (nomesSelecionados.contains(nomeSelecionado));			
		
			
			/*Os 4 primeiros do loop serão funcionarios com escolaridade nivel basico
			 os 4 seguntes serão funcionarios com escolaridade nivel medio
			 e os 2 ultimos serão funcionarios com escolaridade nivel superior
			 Adicionei a impressão para o salario de cada funcionario, juntamente onde ele estudou recentemente
			*/
			if(i<4) {
				funcionarios[i] = new FuncionarioBasico(nomeSelecionado,codigo,escolaSelecionada);
				somaBasico += funcionarios[i].getRenda();
				codigo++;
				System.out.println(funcionarios[i].getNome()+ " recebe R$" + funcionarios[i].getRenda()+
						" que estudou recentemente na "+escolaSelecionada);
			}else if(i<8){
				funcionarios[i] = new FuncionarioEnsinoMedio(nomeSelecionado,codigo,escolaSelecionada,
						colegioSelecionado);
				somaMedio += funcionarios[i].getRenda();
				codigo++;
				System.out.println(funcionarios[i].getNome()+ " recebe R$" + funcionarios[i].getRenda()+
						" que estudou recentemente no "+colegioSelecionado);
			}else {
				funcionarios[i] = new FuncionarioEnsinoSuperior(nomeSelecionado,codigo,escolaSelecionada,
						colegioSelecionado,universidadeSelecionada);
				somaSuperior += funcionarios[i].getRenda();
				codigo++;
				System.out.println(funcionarios[i].getNome()+ " recebe R$" + funcionarios[i].getRenda()+
						" que estudou recentemente na "+universidadeSelecionada);
			}
			nomesSelecionados.add(nomeSelecionado);
            somaTotal = somaBasico+somaMedio+somaSuperior;
		}
		
		Thread.sleep(500);
		//********************************************************************************

		
		/*Impressao na tela a soma dos salarios dos funcionarios para cada nivel de escolaridade e o 
		 salario total gasto pela empresa.
		*/
		System.out.println();
		System.out.println("Salario funcionarios ensino basico: R$" +somaBasico+
				"\nSalario funcionarios ensino medio: R$" +somaMedio+
				"\nSalario funcionarios ensino superior: R$"  +somaSuperior+
				"\n\nSalario total dos funcionarios: R$"+somaTotal);				
		}
       //********************************************************************************	
	}
