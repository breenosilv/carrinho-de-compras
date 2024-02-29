package CarrinhoDeCompras;

public class Produto {
		private String nome;
		private int codigo;
		private double preco;
		
		
		public Produto() {
			this.nome = "";
			this.codigo = 0;
			this.preco = 0.00;
		}
		
		public Produto(String nome, int codigo, double preco) {
			this.nome = nome;
			this.codigo =  codigo;
			this.preco = preco;
		}
		
		public String toString() {
			return "\nNome: " + nome + "\nCodigo: " + codigo + "\nPreço: R$" + preco;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

}
