import java.util.ArrayList;
import java.util.List;

public class HistoricoPacientes {

	private List<Atendimento> historico = new ArrayList<Atendimento>();
	
	public void adicionar(Atendimento atend) {
		historico.add(atend);
	}
	
	public String exibirHistorico() {
		String resultado = "";
		for (int i =0; i< historico.size();i++) {
			resultado = resultado + historico.get(i).toString() + "\n \n";
		}
		return resultado;
	}
}
