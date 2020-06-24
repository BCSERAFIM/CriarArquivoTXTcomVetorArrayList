package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Item;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Item> item = new ArrayList<>();
		
		String path = "c:\\temp\\file.txt";
		
		System.out.print("Entre com a quantidade de itens: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Inserir item # "+i);
			System.out.print("Nome Produto: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço Unitario produto: ");
			double precoUnitario = sc.nextDouble();
			System.out.print("Quantidade de Compra: ");
			int quantidade = sc.nextInt();
			item.add(new Item(nome,precoUnitario,quantidade));
			for (Item total : item) {
				total.valorTotal();
		}
		}
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for (Item print : item) {
			bw.write(print.getNome()+", "+print.valorTotal());
			bw.newLine();
			}
		}
									
		catch (IOException e) {
			e.printStackTrace();
		}
		
		sc.close();
		
	}
}
