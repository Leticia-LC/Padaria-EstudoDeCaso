package controle;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Produto;
import modelo.VendaProduto;

public class VendaDAO extends Produto {

	private ArrayList<VendaProduto> valorVenda;

	public VendaDAO() {
		this.valorVenda = new ArrayList<VendaProduto>();
	}	

	public void adicionarVenda() {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o valor da venda: ");
		double valor = input.nextDouble();
		this.valorVenda.add(valor);
		System.out.println("Venda adicionada com sucesso!");

	}

	public void historicoVendas() {
		int j = 0;
		System.out.println("Histórico de vendas realizadas:");
		for (Double i : this.valorVenda) {
			j++;
			System.out.println(j + "º: " + i + " R$");
		}
	}

}
