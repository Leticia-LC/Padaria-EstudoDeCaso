package controle;

import java.util.ArrayList;

import modelo.IProdutoDAO;
import modelo.Produto;

// Estoque
public class ProdutoDAO implements IProdutoDAO {

	private static ProdutoDAO instancia;
	private static ArrayList<Produto> produtos;

	public static ProdutoDAO getInstancia() {

		if (instancia == null) {
			instancia = new ProdutoDAO();
			
			produtos = new ArrayList<>();
			
			// produtos pre cadastrados
			
			Produto p = new Produto();
			p.setNomeProduto("Pastel");
			produtos.add(p);
		}

		return instancia;
	}

	@Override
	public boolean inserir(Produto p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alterar(Produto p, long xxx) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excluir(Produto p, long xxx) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Produto> listarProdutos() {
		return produtos;
	}

}
