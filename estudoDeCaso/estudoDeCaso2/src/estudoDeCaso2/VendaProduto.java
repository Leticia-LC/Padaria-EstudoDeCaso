package estudoDeCaso2;

import java.util.ArrayList;
import java.util.Scanner;


public class VendaProduto extends Produto {

	private ArrayList<Double> valorVenda;


	public VendaProduto() {
		this.valorVenda = new ArrayList<Double>();
    }

    public ArrayList<Double> getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(ArrayList<Double> valorVenda) {
        this.valorVenda = valorVenda;
    }
	
    public void adicionarVenda() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor da venda: ");
        double valor = input.nextDouble();
        this.valorVenda.add(valor);
        System.out.println("Venda adicionada com sucesso!");
        
    }
   
    public void  historicoVendas() {
        int j = 0;
    	System.out.println("Histórico de vendas realizadas:");
        for (Double i : this.valorVenda) {
			j++;
        	System.out.println(j+"º: "+i+" R$");
		}
    }
	
}
