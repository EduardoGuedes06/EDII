
public class Cachorro {
	private int idade;
	private String raca = new String();
	private float peso;
	
	Cachorro(){}
	Cachorro(String tipoRaca){
		raca = tipoRaca;
	}
	
	Cachorro(int idadeCachorro, String tipoRaca, float pesoCachorro){
		idade = idadeCachorro;
		raca = tipoRaca;
		peso = pesoCachorro;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if (idade < 0) {
			System.out.println("Idade inválida");
		}else {
			this.idade = idade;
		}
		
	}
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Cachorro [idade=" + idade + ", raca=" + raca + ", peso=" + peso + "]";
	}
	

}
