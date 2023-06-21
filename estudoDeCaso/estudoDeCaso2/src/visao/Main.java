package visao;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.tree.AbstractLayoutCache;

import controle.ProdutoDAO;
import modelo.Produto;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer op = 0;
		Integer Eop = 0;
		String estr = "";
		String str = "";
		ProdutoDAO dao = ProdutoDAO.getInstancia();

		Integer codigoProduto;
		String nomeProduto;
		Double valorCompra;
		Integer quantidadeProduto;

		while(op!=4) {
			do {
				menu();
				str = in.nextLine();
				op = Integer.valueOf(str);
				while (op < 1 || op > 4) {
					System.out.println("Erro");
					System.out.println("Digite Novamente: ");
					op = null;
					str = in.nextLine();
					op = Integer.valueOf(str);
				}
	
				switch (op) {
				case 1: {
	
					break;
				}
	
				case 2: {
					ArrayList<Produto> produtos = dao.listarProdutos();
					for (Produto produto : produtos) {
						System.out.println(produto.getNomeProduto());
					}
					System.out.println("------------");
					System.out.println("Adicionar Produto ao estoque [1]");
					System.out.println("Modificar Produto do estoque [2]");
					System.out.println("Remover Produto do estoque [3]");
					System.out.println("Voltar ao Menu [4]");
					System.out.println("-> ");
					estr = in.nextLine();
					Eop = Integer.valueOf(estr);
					switch (Eop) {
					case 1: {
						
						System.out.println("Digite o Código o produto: ");
						Integer codigoPr = Integer.valueOf(in.nextLine());
						System.out.println("Digite o Nome o produto: ");
						String nomeP = in.nextLine();
						System.out.println("Digite o Valor de compra do produto: ");
						Double valorC = Double.valueOf(in.nextLine());
						Produto p = new Produto(codigoPr, nomeP, valorC);
						dao.inserir(p);
						break;
					}
	
					case 2: {
						dao.alterar(null);
						break;
					}
	
					case 3: {
						dao.excluir(null);
						break;
					}
	
					case 4: {
						break;
					}
	
					}
	
					break;
	
				}
				
			case 3: {
				Produto produto = new Produto();
				System.out.print("Codigo produto: ");
				codigoProduto = Integer.valueOf(in.nextLine());
				System.out.print("Nome produto: ");
				nomeProduto = in.nextLine();
				System.out.print("Valor compra: ");
				valorCompra = Double.valueOf(in.nextLine());
				System.out.print("Quantidade: ");
				quantidadeProduto = Integer.valueOf(in.nextLine());

				produto.setCodigoProduto(codigoProduto);
				produto.setNomeProduto(nomeProduto);
				produto.setValorCompra(valorCompra);

				dao.inserir(produto);

				break;
			}
			case 4:{
				System.out.println("!!!Fim do Algoritmo!!!");
				break;
			}
			}
			
			

			/**
			 * System.out.print("Deseja voltar[s/n]: "); str = in.nextLine();
			 **/

			} while (str.equals("s"));
		}
	}

	public static void menu() {
		System.out.printf("%21s\n%9s\n%18s\n%4s", "Histórico de vendas[01]", "Estoque[02]", "Cadastrar vendas[03]","Sair[4]",
				"OP: ");
	}
}
