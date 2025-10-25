import java.util.ArrayList;
import java.util.List;

public class Fila {

	private List<Paciente> pacientes = new ArrayList<Paciente>();

	public List<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
	
	public Paciente andarFila() {
		Paciente paci = pacientes.get(0);
		pacientes.remove(0);
		return paci;
	}
	
	public void adicionar(Paciente paciente) {
		int posicao=0;
		
		switch (paciente.getClassificacao()) {
			case Paciente.cor.Vermelho:{
				for(int i = 0; i < pacientes.size();i++) {
					if(pacientes.get(i).getClassificacao()==Paciente.cor.Vermelho){
						posicao= i+1;
					}
				}
				break;
			}
			
			case Paciente.cor.Amarelo:{
				for(int i = 0; i < pacientes.size();i++) {
				if((pacientes.get(i).getClassificacao()==Paciente.cor.Vermelho)||(pacientes.get(i).getClassificacao()==Paciente.cor.Amarelo)){
					posicao= i+1;
					}
				}
				break;
			}
			
			case Paciente.cor.Verde:{
				for(int i = 0; i < pacientes.size();i++) {
				if((pacientes.get(i).getClassificacao()==Paciente.cor.Vermelho)||(pacientes.get(i).getClassificacao()==Paciente.cor.Amarelo)||(pacientes.get(i).getClassificacao()==Paciente.cor.Verde)){
					posicao= i+1;
					}
				}
				break;
			}
			
			default : posicao = pacientes.size(); break;
		}
		
		pacientes.add(posicao, paciente);
	}
	
	public String exibirFila() {
		String resultado = "";
		for (int i =0; i< pacientes.size();i++) {
			resultado = resultado + pacientes.get(i).toString() + "\n \n";
		}
		return resultado;
	}
}
