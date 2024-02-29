package CarrinhoDeCompras;

import java.util.ArrayList;

public class Fatura {
	private ArrayList<Item> compras;
	
	public Fatura(){
		this.compras = new ArrayList<>();
	}
	
	public void inserirItem(Item item) {
		this.compras.add(item);
	}
	
	public void imprimirCompra() {
		double valorTotal = 0;
		
		for(Item itemCompra: compras) {
		String nomeProduto = itemCompra.getProduto().getNome();
		int codProduto = itemCompra.getProduto().getCodigo();	
		double precoProduto = itemCompra.getProduto().getPreco();
		int qtd = itemCompra.getQnt();
		
		System.out.println("\nProduto: " + nomeProduto);
		System.out.println("Código: " + codProduto);
		System.out.println("Valor: R$" + precoProduto);
		System.out.println("Quantidade " + qtd);
		System.out.println("Parcial: R$" + itemCompra.calculaQntPreco(itemCompra.getProduto()));
		
		valorTotal += itemCompra.calculaQntPreco(itemCompra.getProduto());
		
		System.out.println("======================================");
		}
		System.out.println("O total da sua compra é R$ " + valorTotal + "\n");
	}
}
