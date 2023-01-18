package projeto;

public class CarroEsportivo extends Carro {
	
	public CarroEsportivo(Integer velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(20);
	}
	
	public boolean acelerar() {
		boolean acelerar1 = super.acelerar();
		boolean acelerar2 = super.acelerar(); 
		return acelerar1 || acelerar2;
	}
	
	public boolean frear() {
		if(getVelocidade() >= getDelta()) {
			setVelocidade(getVelocidade() - getDelta());			
			return true;
		} else {
			setVelocidade(0);			
		}
		return false;
	}
}
