package modelo;

public class Produto {

	private Integer codigoProduto;
	private String nomeProduto;
	private Double valorCompra;
	
	public Produto(){}
	
	public Produto(Integer codigoProduto, String nomeProduto, Double valorCompra) {
		this.codigoProduto = codigoProduto;
		this.nomeProduto = nomeProduto;
		this.valorCompra = valorCompra;
	}
	
	public Integer getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(Integer codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public Double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(Double valorCompra) {
		this.valorCompra = valorCompra;
	}
}
