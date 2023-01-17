package projeto;

public class Carro {
	
	private Integer velocidade;
	private Integer delta = 5;
	public final Integer velocidadeMaxima;
	
	private Integer passageiros;
	private Integer passageirosMax;
	
	public Carro(Integer velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
		passageiros = 0;
		passageirosMax = 4;
	}
	
	public boolean acelerar() {
		if(velocidade + delta > velocidadeMaxima) {
			velocidade = velocidadeMaxima;
		} else {
			velocidade += delta;			
		}
		return true;
	}
	
	public boolean frear() {
		if(velocidade >= delta) {
			velocidade -= 5;
			return true;
		} else {
			velocidade = 0;			
		}
		return false;
	}
	
	public void adicionarPassageiros(){
        if(this.passageiros < this.passageirosMax){
            this.passageiros += 1;
        } else {
            System.out.println("Carro lotado");
        }
    }
	
	public void adicionarPassageiros(int passageiros){
        if(this.passageiros + passageiros <= passageirosMax){
            this.passageiros += passageiros;
        } else {
            System.out.println("Carro lotado");
        }
    }
	
	public void removerPassageiros(){
        if(this.passageiros <= this.passageirosMax){
            this.passageiros -= 1;
        } else {
        	this.passageiros = 0;
        }
    }
	
	public void removerPassageiros(int passageiros){
        if(this.passageiros - passageiros > 0){
            this.passageiros -= passageiros;
        } else {
        	this.passageiros = 0;
        }
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

	public Integer getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(Integer passageiros) {
		this.passageiros = passageiros;
	}

	public Integer getPassageirosMax() {
		return passageirosMax;
	}

	public void setPassageirosMax(Integer passageirosMax) {
		this.passageirosMax = passageirosMax;
	}	
	
}
