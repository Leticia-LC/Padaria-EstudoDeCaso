package modelo;

import java.util.ArrayList;

public class VendaProduto {

	private String nomeVendedor;
	private String nomeCliente;
	private ArrayList<Produto> produtosVenda;

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public ArrayList<Produto> getProdutosVenda() {
		return produtosVenda;
	}

	public void setProdutosVenda(ArrayList<Produto> produtosVenda) {
		this.produtosVenda = produtosVenda;
	}

}
