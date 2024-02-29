package CarrinhoDeCompras;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcao;

		Fatura fatura = new Fatura();
		Item item1 = new Item();
		Item item2 = new Item();
		Item item3 = new Item();

		Produto p1 = new Produto();
		p1.setNome("Vans Old Skool");
		p1.setCodigo(21893);
		p1.setPreco(329.00);

		Produto p2 = new Produto();
		p2.setNome("Air Jordan");
		p2.setCodigo(21891);
		p2.setPreco(459.00);

		Produto p3 = new Produto();
		p3.setNome("All Star");
		p3.setCodigo(21892);
		p3.setPreco(200.00);
		
		do {
			System.out.println("Bem vindo a loja!\n" 
				+ "\n(1) - Comprar"
				+ "\n(2) - Ver fatura"
				+ "\n(3) - Encerrar programa"
				+ "\n\nDigite a opção desejada: ");
			opcao = sc.nextInt();
			
			switch(opcao) {
			case 1: System.out.println("\nOpções de produtos: \n" + p1.toString() + "\n" + p2.toString() + "\n" + p3.toString());
			System.out.println("\nDigite o código do produto que deseja comprar: ");
			int codigo = sc.nextInt();
			
			if(codigo == p1.getCodigo()) {
				System.out.println("\nInforme a quantidade que quer comprar do produto: ");
				item1.qnt = sc.nextInt();
				item1.produto = p1;
				fatura.inserirItem(item1);
			} else if(codigo == p2.getCodigo()) {
				System.out.println("\nInforme a quantidade que quer comprar do produto: ");
				item2.qnt = sc.nextInt();
				item2.produto = p2;
				fatura.inserirItem(item2);
			}else if(codigo == p3.getCodigo()) {
				System.out.println("\nInforme a quantidade que quer comprar do produto: ");
				item3.qnt = sc.nextInt();
				item3.produto = p3;
				fatura.inserirItem(item3);
			}else {
					System.out.println("\nCódigo invalido!\n");
				}break;
			
			case 2: fatura.imprimirCompra();break;
			
			case 3: System.out.println("\nPrograma encerrado, obrigado por comprar na nossa loja!");
			}
		}while (opcao !=3);
		
		sc.close();
		
	}
}