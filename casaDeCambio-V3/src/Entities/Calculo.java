package Entities;

import java.util.Scanner;

public class Calculo {
	//atributos publicos e staticos das moedas.
	public static final double dolar = 4.91;
	public static final double euro = 5.38;
	public static final double yuan = 0.68;
	//atributos publicos
	public double quantidade;
	public int escolhaDeOpcao;
	//metodo que ira selecionar com base na (escolhaDeCompra) o caso que sera executado.
	public void comprarMoeda(int escolhaDeCompra,Scanner sc) {
		switch (escolhaDeCompra) {
		case '1':
			informarQuantidade(sc);
			//Imprimo uma mensagem do valor a ser pago e executa o metodo corespondete da (escolhaDeCompra) dolar.
			System.out.printf("O valor a ser pago é de R$: %.2f%n", comprarDolar(quantidade));
			System.out.println("Obrigado pela preferencia!!");
			System.out.println("==================================\n");
			break;
		case '2':
			informarQuantidade(sc);
			//Imprimo uma mensagem do valor a ser pago e executa o metodo corespondete da (escolhaDeCompra) euro.
			System.out.printf("O valor a ser pago é de R$: %.2f%n", comprarEuro(quantidade)); 
			System.out.println("Obrigado pela preferencia!!");
			System.out.println("==================================\n");
			break;
		case '3':			
			informarQuantidade(sc);
			//Imprimo uma mensagem do valor a ser pago e executa o metodo corespondete da (escolhaDeCompra) yuan.
			System.out.printf("O valor a ser pago é de R$: %.2f%n", comprarYuan(quantidade)); 
			System.out.println("Obrigado pela preferencia!!");
			System.out.println("==================================\n");
			break;
		case '4':
			System.out.println("Volte Sempre!!!");
			break;
		default:
			System.out.println("Informe uma escolha valida!!");
			break;
		}
	}
	
	//metodo estatico que calcula o valor a ser pago em reais ao comprar dolar.
	public static double comprarDolar(double valor) {
		return valor * dolar;
	}
	//metodo estatico que calcula o valor a ser pago em reais ao comprar doleuroar.
	public static double comprarEuro(double valor) {
		return valor * euro;
	}
	//metodo estatico que calcula o valor a ser pago em reais ao comprar yuan.
	public static double comprarYuan(double valor) {
		return valor * yuan;
	}
	//metodo para pedir e armazenar a quantidade que deseja ser comprada.
	public void informarQuantidade(Scanner sc) {
		//Imprimir mensagem de quantidade que deseja compar.
		System.out.println("Quanto deseja adquirir: ");
		//armazenar o valor informado no atributo (quantidade) do objeto casaDeCambio.
		quantidade = sc.nextDouble();
	}
	public void iniciarCompra(Scanner sc) {
		//Imprimir mensagem de escolha de compra ou sair.
		System.out.println("Oque deseja fazer?");
		System.out.println("Comprar dolar - 1, Comprar Euro - 2, Comprar Yuan - 3, Sair - 4");
		//Lê o primeiro caractere da entrada do usuário como escolha e atribui à variável escolhaDeOpcao e retorna o caractere escolhido.
		escolhaDeOpcao  = sc.next().charAt(0);		
	}
	
		
}
