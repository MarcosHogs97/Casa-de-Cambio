package Aplication;
//Desenvolvedor: Marcos Henrique O. G. da Silva.
//Github: https://github.com/MarcosHogs97/Casa-de-Cambio

import java.util.Scanner;

import Entities.Calculo;

public class CasaDeCabioAplication {

	public static void main(String[] args) {
		// Crie um objeto Scanner para ler as entradas do usuário.
		Scanner sc = new Scanner(System.in);
		// Crie um objeto do tipo Calculo.
		Calculo casaDeCambio = new Calculo();
		
		//Imprimir mensagem de escolha de compra ou sair.
		System.out.println("Escolha a moeda que deseja comprar: ");
		System.out.println("Dolar: 1, Euro: 2, Yuan: 3, Sair: 4");
		
		//armazena a escolha na variavel (escolhaDeCompra).
		int escolhaDeCompra = sc.nextInt();
		
		//faz uma comparação logica que se for diferente de 4 o if sera executado.
		if(escolhaDeCompra != 4) {
			
			//Imprimir mensagem de quantidade que deseja compar.
			System.out.println("Quanto deseja adquirir: ");
			
			//armazenar o valor informado no atributo (quantidade) do objeto casaDeCambio.
			casaDeCambio.quantidade = sc.nextDouble();
			
			//executar o metodo que calculo o valor a ser pago com base na (escolhaDeCompra) e (quantidade) informadas.
			casaDeCambio.comprarMoeda(escolhaDeCompra);
		}
		System.out.println("Obrigado e volte sempre!!!"); 	
		sc.close();

	}

}
