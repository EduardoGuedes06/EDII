
public class Aluno {
	private String nome;
	private String prontuario;
	private String curso;
	int anoIngressor;
	
	
	Aluno(){
		
	}
	
	Aluno(String nome, String prontuario, String curso, int anoIngressor) {
		this.nome = nome;
		this.prontuario = prontuario;
		this.curso = curso;
		this.anoIngressor = anoIngressor;
	}

	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProntuario() {
		return prontuario;
	}
	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getAnoIngressor() {
		return anoIngressor;
	}
	public void setAnoIngressor(int anoIngressor) {
		if (anoIngressor < 2007) {
			System.out.println("Ano de ingresso inválido");
		}else {
			this.anoIngressor = anoIngressor;
		}
		
	}
	
	public int previsaoFormatura() {
		return this.anoIngressor + 3;
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", prontuario=" + prontuario + ", curso=" + curso + ", anoIngressor="
				+ anoIngressor + "]";
	}
	
}
