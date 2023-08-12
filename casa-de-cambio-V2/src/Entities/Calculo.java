package Entities;

public class Calculo {
	//atributos publicos e staticos das moedas.
	public static final double dolar = 4.91;
	public static final double euro = 5.38;
	public static final double yuan = 0.68;
	//atributos publicos
	public double quantidade;
	
	//metodo que ira selecionar com base na (escolhaDeCompra) o caso que sera executado.
	public void comprarMoeda(int escolhaDeCompra) {
		switch (escolhaDeCompra) {
		case 1:
			//Imprimo uma mensagem do valor a ser pago e executa o metodo corespondete da (escolhaDeCompra) dolar.
			System.out.printf("O valor a ser pago é de R$: %.2f%n", comprarDolar(quantidade)); 
			break;
		case 2:
			//Imprimo uma mensagem do valor a ser pago e executa o metodo corespondete da (escolhaDeCompra) euro.
			System.out.printf("O valor a ser pago é de R$: %.2f%n", comprarEuro(quantidade)); 
			break;
		case 3:
			//Imprimo uma mensagem do valor a ser pago e executa o metodo corespondete da (escolhaDeCompra) yuan.
			System.out.printf("O valor a ser pago é de R$: %.2f%n", comprarYuan(quantidade)); 
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
		
}
