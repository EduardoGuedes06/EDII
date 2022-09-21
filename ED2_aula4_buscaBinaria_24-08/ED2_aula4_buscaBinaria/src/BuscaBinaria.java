
public class BuscaBinaria {
	private int meio;
	private int posInicial;
	private int posFinal;
	
	public void realizarBuscaBinaria(int vetor[], int buscar){
		posInicial = 0;
		posFinal = (vetor.length)-1;
		
		while (posInicial <= posFinal) {
			meio = (posInicial + posFinal)/2;
			if (buscar == vetor[meio]) {
				System.out.println("ACHOU");
				break;
			}else if (buscar < vetor[meio]) {
				posFinal = meio - 1;
			}else {
				posInicial = meio + 1;
			}
		}
		System.out.println("FIM");
	}
}
