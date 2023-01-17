package projeto;

public class Main {
	public static void main(String[] args) {
		
		CarroPasseio carroDaMaria = new CarroPasseio(180);
		CarroEsportivo carroDoGustavo = new CarroEsportivo(250);

		// Exemplo 1: Sobrecarga
		System.out.println("Quantidade de passageiros: " + carroDaMaria.getPassageiros());
		System.out.println("\nAdicionando passageiros...");
		carroDaMaria.adicionarPassageiros();
		carroDaMaria.adicionarPassageiros(3);
		System.out.println("Quantidade de passageiros: " + carroDaMaria.getPassageiros());
		
		// Exemplo 2: Sobrecarga
		System.out.println("\nRemovendo passageiros...");
		carroDaMaria.removerPassageiros();
		carroDaMaria.removerPassageiros(3);
		System.out.println("Quantidade de passageiros: " + carroDaMaria.getPassageiros());
		
		System.out.println("\n------------------------------------------\n");
		
		// Exemplo 1: Sobrescrita
		System.out.println("Velocidade do carro da Maria: " + carroDaMaria.getVelocidade());
		System.out.println("\nAcelerando...");
		carroDaMaria.acelerar();	
		carroDaMaria.acelerar();		
		System.out.println("Velocidade do carro da Maria: " + carroDaMaria.getVelocidade());
		
		System.out.println("\n------------------------------------------\n");

		System.out.println("Velocidade do carro do Gustavo: " + carroDoGustavo.getVelocidade());
		System.out.println("\nAcelerando...");
		carroDoGustavo.acelerar();
		carroDoGustavo.acelerar();
		System.out.println("Velocidade do carro do Gustavo: " + carroDoGustavo.getVelocidade());
		
		System.out.println("\n------------------------------------------\n");
		
		// Exemplo 2: Sobrescrita
		System.out.println("Velocidade do carro da Maria: " + carroDaMaria.getVelocidade());
		System.out.println("\nFreando...");
		carroDaMaria.frear();	
		carroDaMaria.frear();		
		System.out.println("Velocidade do carro da Maria: " + carroDaMaria.getVelocidade());
		
		System.out.println("\n------------------------------------------\n");

		System.out.println("Velocidade do carro do Gustavo: " + carroDoGustavo.getVelocidade());
		System.out.println("\nFreando...");
		carroDoGustavo.frear();
		carroDoGustavo.frear();
		System.out.println("Velocidade do carro do Gustavo: " + carroDoGustavo.getVelocidade());
		
	}
}
