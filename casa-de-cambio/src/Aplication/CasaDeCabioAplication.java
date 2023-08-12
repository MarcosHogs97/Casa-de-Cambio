package Aplication;
//Desenvolvedor: Marcos Henrique O. G. da Silva.
//Github: https://github.com/MarcosHogs97/Casa-de-Cambio

import java.util.Scanner;

import Entities.Calculo;

public class CasaDeCabioAplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		Calculo cambio = new Calculo();
		
		cambio.iniciarAplicativo(sc);
			
		sc.close();

	}

}
