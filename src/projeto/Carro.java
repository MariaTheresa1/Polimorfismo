package projeto;

public class Carro {
	private Integer velocidade;
	private Integer delta = 5;
	public final Integer velocidadeMaxima;
			
	public Carro(Integer velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public boolean acelerar() {
		if(getVelocidade() + getDelta() > velocidadeMaxima) {
			setVelocidade(velocidadeMaxima);
		} else {
			setVelocidade(getVelocidade() + getDelta());			
		}
		return true;
	}
	
	public boolean frear() {
		if(getVelocidade() >= delta) {
			setVelocidade(getVelocidade() - 5);
			return true;
		} else {
			setVelocidade(0);			
		}
		return false;
	}

	public Integer getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(Integer velocidade) {
		this.velocidade = velocidade;
	}

	public Integer getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public Integer getDelta() {
		return delta;
	}

	public void setDelta(Integer delta) {
		this.delta = delta;
	}
	
}
