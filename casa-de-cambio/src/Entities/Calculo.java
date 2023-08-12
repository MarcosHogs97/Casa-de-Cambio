package Entities;

import java.util.Scanner;

public class Calculo {
	
	public static final double dolar = 4.91;
	public static final double euro = 5.38;
	public static final double yuan = 0.68;
	
	int escolhaDeCompra;
	double quantidade;
	
	public void iniciarAplicativo(Scanner sc) {
		System.out.println("Escolha a moeda que deseja comprar: ");
		System.out.println("Dolar: 1, Euro: 2, Yuan: 3, Sair: 4");
		escolhaDeCompra = sc.nextInt();
		if(escolhaDeCompra != 4) {
			System.out.println("Quanto deseja adquirir: ");
			quantidade = sc.nextDouble();
			comprarMoeda();
		}
	}
	
	public void comprarMoeda() {
		switch (escolhaDeCompra) {
		case 1:
			System.out.printf("O valor a ser pago é de R$: %.2f", comprarDolar(quantidade)); 
			break;
		case 2:
			System.out.printf("O valor a ser pago é de R$: %.2f", comprarEuro(quantidade)); 
			break;
		case 3:
			
			System.out.printf("O valor a ser pago é de R$: %.2f", comprarYuan(quantidade)); 
			break;
		case 4:
			System.out.printf("Obrigado e volte sempre!!!"); 
			break;

		default:
			System.out.println("Informe uma escolha valida!!");
			break;
		}
	}
	
	public static double comprarDolar(double valor) {
		return valor * dolar;
	}
	public static double comprarEuro(double valor) {
		return valor * euro;
	}
	public static double comprarYuan(double valor) {
		return valor * yuan;
	}
		
}
