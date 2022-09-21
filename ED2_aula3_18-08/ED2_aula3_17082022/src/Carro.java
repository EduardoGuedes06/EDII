
public class Carro {
	private String placa;
	private String cidade;
	private int ano;
	private String modelo;
	private double valor;
	
	Carro(){
		this.cidade = "Bragança Paulista";
		this.ano = 2018;
	}
	Carro(String placa, String cidade, int ano, String modelo, double valor){
		this.placa = placa;
		this.cidade = cidade;
		this.ano = ano;
		this.modelo = modelo;
		this.valor = valor;
	}
	
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Carro [placa=" + placa + ", cidade=" + cidade + ", ano=" + ano + ", modelo=" + modelo + ", valor="
				+ valor + "]";
	}
	
	public double calcularIPVA() {
		double ipva;
		if (this.valor >= 0.0) {
			ipva = this.valor * 0.04; 
		}else {
			ipva = 0.0;
		}
		return ipva; 
	}
	
	
	// cadastrarCarro void
	// calcularIPVA retorna double
}
