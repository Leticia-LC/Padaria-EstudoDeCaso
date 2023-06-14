package visao;

import java.util.ArrayList;
import java.util.Scanner;


import controle.ProdutoDAO;
import modelo.Produto;
import modelo.VendaProduto;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer op = 0;
		String str = "";
		ProdutoDAO dao = new ProdutoDAO();
		
		Integer codigoProduto;
		String nomeProduto;
		Double valorCompra;
		Integer quantidadeProduto;
		
		
		
		do {
			menu();
			str = in.nextLine();
			op = Integer.valueOf(str);
			while (op < 1 || op > 3) {
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
				
				break;
			}
			case 3: {
				System.out.print("Codigo produto: ");
				codigoProduto = in.nextInt();
				System.out.print("Nome produto: ");
				nomeProduto = in.nextLine();
				System.out.print("Valor compra: ");
				valorCompra = in.nextDouble();
				System.out.print("Quantidade: ");
				quantidadeProduto = in.nextInt();
				Produto produto = new Produto(codigoProduto,nomeProduto,valorCompra,quantidadeProduto);
				dao.inserir(produto);
				;		
				
				
				break;
			}
			}

			System.out.print("Deseja voltar[s/n]: ");
			str = in.nextLine();
			
		} while (str.equals("s"));
		
	}
	
	public static void menu() {
		System.out.printf("%21s\n%9s\n%18s\n%4s", "Histórico de vendas[01]", "Estoque[02]", "Cadastrar vendas[03]",
				"OP: ");
	}
}
