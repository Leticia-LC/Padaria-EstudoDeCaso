package controle;

import java.util.ArrayList;

import modelo.IProdutoDAO;
import modelo.Produto;

// Estoque
public class ProdutoDAO implements IProdutoDAO {

	private static ProdutoDAO instancia;
	private static ArrayList<Produto> produtos;
	
	private ProdutoDAO() {}

	public static ProdutoDAO getInstancia() {

		if (instancia == null) {
			instancia = new ProdutoDAO();

			produtos = new ArrayList<>();

			// produtos pre cadastrados

			Produto p1 = new Produto();
			p1.setNomeProduto("Pastel de carne com queijo cheddar");
			p1.setValorCompra(8.50);
			p1.setCodigoProduto(23456787);
			produtos.add(p1);
			Produto p2 = new Produto();
			p2.setNomeProduto("Torta mineira de abacaxi e coco");
			
			p2.setValorCompra(45.00);
			p2.setCodigoProduto(23456433);
			produtos.add(p2);
			Produto p3 = new Produto();
			p3.setNomeProduto("Bolo RedVelvet com geleia de frutas vermelhas");
			p3.setValorCompra(60.50);
			p3.setCodigoProduto(468434566);

		}

		return instancia;
	}

	@Override
	public boolean inserir(Produto p) {

		if (p != null) {
			produtos.add(p);
			return true;
		}

		return false;
	}

	@Override
	public boolean alterar(Produto p) {

		for (Produto produto : produtos) {
			if (produto.getCodigoProduto() == p.getCodigoProduto()) {
				produto.setNomeProduto(p.getNomeProduto());
				produto.setQuantidadeProduto(p.getQuantidadeProduto());
				produto.setValorCompra(p.getValorCompra());
			}
		}

		return false;
	}

	@Override
	public boolean excluir(Produto p) {

		for (Produto produto : produtos) {
			if (produto.getCodigoProduto() == p.getCodigoProduto()) {
				produtos.remove(produto);
				return true;
			}
		}

		return false;
	}

	@Override
	public ArrayList<Produto> listarProdutos() {
		return produtos;
	}

}
