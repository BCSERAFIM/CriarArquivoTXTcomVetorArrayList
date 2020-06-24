package entities;

public class  Item {
	private String nome;
	private double precoUnitario;
	private int quantidade;
	
	public Item () {
		
	}
	
	public Item(String nome, double precoUnitario, int quantidade) {
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double valorTotal() {
		return precoUnitario * quantidade;
	}

	public String toString() {
		return nome
				+","
				+String.format("%.2f",precoUnitario)
				+","
				+quantidade
				+","
				+String.format("%.2f",valorTotal());
	}
}
