package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
public class Projeto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Produto produto = new Produto();
		System.out.println("Enter produto data: ");
		System.out.println("name ");
		produto.name = sc.nextLine();
		System.out.print("Price: ");
		produto.price = sc.nextDouble();
		System.out.println("qtd: ");
		produto.qtd = sc.nextInt();
		
		
		
		System.out.println("Produto data:"  + produto);
		
		System.out.println();
		System.out.print("INFORME A QUANTIDADE NO ESTOQUE");
		int qtd = sc. nextInt();
		produto.addPodutos(qtd);
		
		System.out.println();
		System.out.println("Update data:"+ produto);
		
		System.out.println();
		System.out.print("Enter the numero of produtos to be removed from stock:");
		qtd = sc. nextInt();
		produto.removeProdutos(qtd);
		
		
		System.out.println();
		System.out.println("Update data:"+ produto);
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
