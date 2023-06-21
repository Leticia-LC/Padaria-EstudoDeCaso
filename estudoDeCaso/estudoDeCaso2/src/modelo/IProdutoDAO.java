package modelo;

import java.util.ArrayList;

import controle.ProdutoDAO;

	

public interface IProdutoDAO {
	
	
	
	public boolean inserir(Produto p) ;
	

	public boolean alterar(Produto p);

	public boolean excluir(Produto p);

	public ArrayList<Produto> listarProdutos();

}
