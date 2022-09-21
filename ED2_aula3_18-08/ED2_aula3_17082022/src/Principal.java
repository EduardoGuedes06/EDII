import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro c1 = new Carro();
		c1.setValor(10000.00);
		double ipva = c1.calcularIPVA();
		if (ipva == 0.0) {
			System.out.println("Valor inválido");
		}else {
			System.out.println("IPVA: " + ipva);
		}
		Carro c2 = new Carro("AAA1234", "Jundiai", 2022, "HB20", 75000);
		Carro c3 = new Carro("BBBXXXX", "Campinas", 2020, "C3", 45000);
		List<Carro> lista = new ArrayList<Carro>();
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		System.out.println("Carro Fabio: "+ lista.get(1).getAno());
		System.out.println(lista);
		for (Carro c : lista) {
			System.out.println("Carro: " + c);
		}
	}

}
