package projeto;

public class Main {
	public static void main(String[] args) {
		
		CarroEsportivo carroDaMaria = new CarroEsportivo(180);
		
		// Exemplo 1: Sobrecarga
		System.out.println("Quantidade de passageiros: " + carroDaMaria.getPassageiros());
		carroDaMaria.adicionarPassageiros();
		carroDaMaria.adicionarPassageiros(3);
		System.out.println("Quantidade de passageiros: " + carroDaMaria.getPassageiros());
		
		// Exemplo 2: Sobrecarga
		carroDaMaria.removerPassageiros();
		carroDaMaria.removerPassageiros(3);
		System.out.println("Quantidade de passageiros: " + carroDaMaria.getPassageiros());
		
	}
}
