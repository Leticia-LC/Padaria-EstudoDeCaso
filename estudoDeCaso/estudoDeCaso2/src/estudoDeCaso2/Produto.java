package estudoDeCaso2;

public class Produto {

	private Integer codigoProduto;
	private String nomeProduto;
	private Double valorCompra;
	private Integer quantidadeProduto;
	Produto(){}
	public Produto(Integer codigoProduto, String nomeProduto, Double valorCompra, Integer quantidadeProduto) {
		this.codigoProduto = codigoProduto;
		this.nomeProduto = nomeProduto;
		this.valorCompra = valorCompra;
		this.quantidadeProduto = quantidadeProduto;
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
	public Integer getQuantidadeProduto() {
		return quantidadeProduto;
	}
	public void setQuantidadeProduto(Integer quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	
	
	
	
}
