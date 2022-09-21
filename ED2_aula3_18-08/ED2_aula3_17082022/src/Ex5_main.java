import java.util.ArrayList;
import java.util.List;

public class Ex5_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Restaurante> listaRestaurante = new ArrayList<Restaurante>();
		Restaurante r1 = new Restaurante();
		r1.setNome("XPTO");
		r1.setQtdLugares(20);
		Restaurante r2 = new Restaurante();
		r2.setNome("Restaurante ABC");
		r2.setQtdLugares(50);
		Restaurante r3 = new Restaurante();
		r3.setNome("Restaurante do Carioca");
		r3.setQtdLugares(1000);
		listaRestaurante.add(r1);
		listaRestaurante.add(r2);
		listaRestaurante.add(r3);
		for(Restaurante rest : listaRestaurante) {
			System.out.println(rest);
		}
	}
}
