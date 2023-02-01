package entities;

public class Produto {
	
	public String name;
	public double price;
	public int qtd;
	
	public double totalValueInStock() {
		return price * qtd;
	}
	
	public void addPodutos(int qtd) {
		this.qtd += qtd;
	}
	
	public void removeProdutos(int qtd) {
		this.qtd -= qtd;
	
	}
	public String toString() {
		return name
			+ ",$ "
			+ String.format("%.2f",price)
			+ ", "
			+ qtd
			+"units,Total: & "
			+ String.format("%.2f",totalValueInStock());
			
	}

}
