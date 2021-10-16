package projetos.atividadeEstoque;

import java.util.Scanner;

public class TelaEstoqueInsumo {

	public static void main(String[] args) {

		opcoesCadastro();
		
	}

	private static Scanner sc = new Scanner(System.in);
	static Insumo insumo = new Insumo();

	static void opcoesCadastro() {


		int opcao;
		System.out.println("ESTOQUE\n");

		do {
			System.out.println("Opções para estoque. Opção desejada: ");
			System.out.println("====================================\n");
			System.out.println("0 - Voltar");
			System.out.println("1 - Cadastrar Insumo");
			System.out.println("2 - Editar Insumo");
			System.out.println("3 - Consultar Insumo");
			System.out.println("4 - Excluir Insumo");

			opcao = Integer.parseInt(sc.nextLine());
			System.out.println("Voce escolheu a opção: " + opcao);
			switch (opcao) {
			case 0:
				System.out.println("Voltou ao menu ");
				break;
			case 1:
				cadastrarInsumo();
				break;
			case 2:
				editarInsumo();
				break;
			case 3:
				consultarInsumo();
				break;
			case 4:
				excluirInsumo();
				break;
			default:
				System.out.println("Opção inválida " + opcao);
				break;
			}
		} while (opcao != 0);
	}

	public static void cadastrarInsumo() {

		System.out.println("Cadastrar novo insumo. Entre com os dados: ");
		System.out.println("=====================================\n");
		System.out.println("Código do Sistema: ");
		insumo.codSistema = Integer.parseInt(sc.nextLine());

		System.out.println("Nome: ");
		insumo.nome = sc.nextLine();

		System.out.println("Categoria: ");
		System.out.println("1- bebidas");
		System.out.println("2- carnes");
		System.out.println("3- condimentos");
		System.out.println("4- embalagens");
		System.out.println("5- frios");
		System.out.println("6- leites e derivados");
		System.out.println("7- liquidos");
		System.out.println("8- massas");
		System.out.println("9- verduras");
		System.out.println("10- outros");
		insumo.categoria = Byte.parseByte(sc.nextLine());

		System.out.println("Preço de Custo: ");
		insumo.pCusto = Double.parseDouble(sc.nextLine());

		System.out.println("Medida: ");
		System.out.println("1- UN");
		System.out.println("2- KG");
		System.out.println("3- LT");
		insumo.medida = Byte.parseByte(sc.nextLine());

		System.out.println("Estoque Mínimo: ");
		insumo.estoqueM = Double.parseDouble(sc.nextLine());

		System.out.println("Estoque Atual: ");
		insumo.estoqueA = Double.parseDouble(sc.nextLine());

		System.out.println("Situação do Estoque: ");
		if (insumo.estoqueA >= insumo.estoqueM) {
			System.out.println("Regular");

		}else if (insumo.estoqueA <= insumo.estoqueM) {
			System.out.println("Abaixo do Mínimo");
		}else if (insumo.estoqueA < 0) {
			System.out.println("Negativo / Insuficiente");
		}

		System.out.println("\nINSUMO CADASTRADO COM SUCESSO!");
		System.out.println("================================================");
		System.out.println("Código do Sistema   : " + insumo.codSistema);
		System.out.println("Nome                : " + insumo.nome);
		System.out.println("Categoria           : " + insumo.categoria);
		System.out.println("Preço de Custo      : " + insumo.pCusto);
		System.out.println("Medida              : " + insumo.medida);
		System.out.println("Estoque Mínimo      : " + insumo.estoqueM);
		System.out.println("Estoque Atual       : " + insumo.estoqueA);
		System.out.println("Situação do Estoque : " + insumo.sitEstoque);
		System.out.println("================================================");

		GerenciadorIngredientes.listIns.add(insumo);
	}

	public static void editarInsumo() {


		GerenciadorIngredientes.consultarEstoque();
		System.out.println("Deseja alterar o item : ");
		int indexRem = Integer.parseInt(sc.nextLine());


		System.out.println("Digite o número para alterar no cadastro do insumo: ");
		System.out.println("===================================================");
		System.out.println("1 - Código do Sistema");
		System.out.println("2 - Nome");
		System.out.println("3 - Categoria");
		System.out.println("4 - Preço de Custo");
		System.out.println("5 - Medida");
		System.out.println("6 - Estoque Mínimo");
		System.out.println("7 - Estoque Atual");

		int opcao = Integer.parseInt(sc.nextLine());

		switch(opcao) {
		case 1 :
			System.out.println("Código do Sistema: ");
			GerenciadorIngredientes.listIns.get(indexRem).codSistema = Integer.parseInt(sc.nextLine());
			break;
		case 2: 
			System.out.println("Nome: ");
			GerenciadorIngredientes.listIns.get(indexRem).nome = sc.nextLine();
			break;
		case 3: 
			System.out.println("Categoria: ");
			System.out.println("1- bebidas");
			System.out.println("2- carnes");
			System.out.println("3- condimentos");
			System.out.println("4- embalagens");
			System.out.println("5- frios");
			System.out.println("6- leites e derivados");
			System.out.println("7- liquidos");
			System.out.println("8- massas");
			System.out.println("9- verduras");
			System.out.println("10- outros");
			GerenciadorIngredientes.listIns.get(indexRem).categoria = Byte.parseByte(sc.nextLine());
			break;
		case 4: 
			System.out.println("Preço de Custo: ");
			GerenciadorIngredientes.listIns.get(indexRem).pCusto = Double.parseDouble(sc.nextLine());
			break;
		case 5:
			System.out.println("Medida: ");
			System.out.println("1- UN");
			System.out.println("2- KG");
			System.out.println("3- LT");
			GerenciadorIngredientes.listIns.get(indexRem).medida = Byte.parseByte(sc.nextLine());
			break;
		case 6: 
			System.out.println("Estoque Mínimo: ");
			GerenciadorIngredientes.listIns.get(indexRem).estoqueM = Double.parseDouble(sc.nextLine());
			break;
		case 7: 
			System.out.println("Estoque Atual: ");
			GerenciadorIngredientes.listIns.get(indexRem).estoqueA = Double.parseDouble(sc.nextLine());
			break;

		default: 
			System.out.println("Opção invalida");
			break;
		} 
	}


	public static void consultarInsumo() {
		GerenciadorIngredientes.consultarEstoque();
	}

	public static void excluirInsumo() {

		System.out.println("Deseja excluir \n 1. Todos da lista \n 2. Somente um dos itens");
		int opcao = Integer.parseInt(sc.nextLine());
		switch(opcao) {
		case 1: 
			GerenciadorIngredientes.listIns.removeAll(GerenciadorIngredientes.listIns);
		case 2: 

			GerenciadorIngredientes.consultarEstoque();
			System.out.println("Deseja remover o item : ");
			int indexRem = Integer.parseInt(sc.nextLine());
			GerenciadorIngredientes.listIns.remove(indexRem);


		}

	}
}

