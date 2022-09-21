
public class Restaurante {
	
	private String nome;
	private int qtdLugares;
	
	public String getNome() {
		return nome;
	}
	@Override
	public String toString() {
		return "Restaurante [nome=" + nome + ", qtdLugares=" + qtdLugares + "]";
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdLugares() {
		return qtdLugares;
	}
	public void setQtdLugares(int qtdLugares) {
		this.qtdLugares = qtdLugares;
	}
	
}
