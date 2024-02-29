package CarrinhoDeCompras;

public class Item {
	
	int qnt, codigop;
	Produto produto;
	Fatura fatura;
	
	public Item() {
		this.produto = new Produto();
		this.qnt = 0;
		this.codigop = 0;
	}
	
	public double calculaQntPreco(Produto produto) {
		return produto.getPreco()*getQnt();
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getCodigop() {
		return codigop;
	}

	public void setCodigop(int codigop) {
		this.codigop = codigop;
	}

}


