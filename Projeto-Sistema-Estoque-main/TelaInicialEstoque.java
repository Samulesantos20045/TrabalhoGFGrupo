package projetos.atividadeEstoque;

import java.util.Scanner;

public class TelaInicialEstoque {
	
	static Scanner sc = new Scanner(System.in);
	
	static void selecionarOpcao() {
		int opcao;
		do {	
			System.out.println("0 - Sair");
			System.out.println("1 - Cadastrar Insumo");
			System.out.println("2 - Pesquisar no Estoque");
			System.out.println("3 - Baixa Estoque ");

			opcao =  Integer.parseInt(sc.nextLine());

			switch(opcao) {
			case 1 :
				TelaEstoqueInsumo.opcoesCadastro();
				break;
			case 2:
				pesquisarEstoque();
				break;
			case 3 : 

			default:
				System.out.println("Não existe essa opção");
			}
		}while(opcao != 0);		

	}
	static void pesquisarEstoque() {

		System.out.println(" *Somente pesquisar por nome do produto* ");
		System.out.println(" Pesquisar por :  ");
		String resultPesquisa = GerenciadorIngredientes.PesquisarIngredientes(sc.nextLine());
		if(resultPesquisa.isBlank()) {
			System.out.println("Não há nenhum item com esse nome");
		}else {
			System.out.println(resultPesquisa);
		}


	}

}
