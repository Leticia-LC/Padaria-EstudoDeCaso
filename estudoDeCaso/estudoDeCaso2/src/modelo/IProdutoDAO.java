package modelo;

import java.util.ArrayList;

public interface IProdutoDAO {
	
	public boolean inserir(Produto p);

	public boolean alterar(Produto p, long xxx);

	public boolean excluir(Produto p, long xxx);

	public ArrayList<Produto> listarProdutos();

}
