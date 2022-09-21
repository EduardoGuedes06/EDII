import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Aluno aluno1 = new Aluno("Rafael", "BP123", "ADS", 2022);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("João");
		aluno2.setCurso("Engenharia");
		aluno2.setProntuario("BP321");
		aluno2.setAnoIngressor(2020);
		/*
		Aluno aluno3 = new Aluno();
		System.out.println("Digite seu nome");
		aluno3.setNome(sc.nextLine());
		
		System.out.println("Digite seu prontuário: ");
		aluno3.setProntuario(sc.nextLine());
		
		System.out.println("Digite seu curso: ");
		aluno3.setCurso(sc.nextLine());
		
		System.out.println("Digite ano de ingresso: ");
		aluno3.setAnoIngressor(sc.nextInt());
	*/
		//JOptionPane.showMessageDialog(null, aluno1);
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		JOptionPane.showMessageDialog(null, "Nome digitado: " + nome);
		
		System.out.println("Aluno1: " + aluno1);
		System.out.println("Aluno2: " + aluno2);
		//System.out.println("Aluno3: " + aluno3);
		//System.out.println("Previsao de formatura do aluno3: " + aluno3.previsaoFormatura());
	}
}
