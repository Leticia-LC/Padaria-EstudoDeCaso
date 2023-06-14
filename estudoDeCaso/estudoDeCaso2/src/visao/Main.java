package visao;

import java.util.Scanner;

import controle.ProdutoDAO;
import modelo.Produto;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer op = 0;
		String str = "";
		ProdutoDAO dao = ProdutoDAO.getInstancia();

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
				produto.setQuantidadeProduto(quantidadeProduto);
				produto.setValorCompra(valorCompra);

				dao.inserir(produto);

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
