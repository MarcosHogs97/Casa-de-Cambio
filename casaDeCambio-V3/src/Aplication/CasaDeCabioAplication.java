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
		
		System.out.println("Seja bem vindo");
		do{			
			casaDeCambio.iniciarCompra(sc);
		//faz uma comparação logica que se for diferente de 4 o if sera executado.
		if(casaDeCambio.escolhaDeOpcao != 4) {
			//executar o metodo que calculo o valor a ser pago com base na (escolhaDeCompra) e (quantidade) informadas.
			casaDeCambio.comprarMoeda(casaDeCambio.escolhaDeOpcao,sc);
		}else {
		System.out.println("Obrigado e volte sempre!!!");
		}
		}while(casaDeCambio.escolhaDeOpcao != '4'); 
		
		sc.close();

	}

}
