import java.time.LocalDateTime;
public class Paciente extends Pessoa {
	
	private static int idMax=0;
	
	public enum cor {
		
		Vermelho,
		Amarelo,
		Verde,
		Azul
	}
	
	private int idPaciente;
	private LocalDateTime horaChegada;
	private cor classificacao;
	
	public Paciente(String nome, cor classificacao) {
		super(nome);
		this.idPaciente = idMax;
		idMax ++;
		this.horaChegada = LocalDateTime.now();
		this.classificacao = classificacao;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public LocalDateTime getHoraChegada() {
		return horaChegada;
	}

	public void setHoraChegada(LocalDateTime horaChegada) {
		this.horaChegada = horaChegada;
	}

	public cor getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(cor classificacao) {
		this.classificacao = classificacao;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente [idPaciente: ");
		builder.append(idPaciente);
		builder.append(", horaChegada: ");
		builder.append(horaChegada);
		builder.append(", classificacao: ");
		builder.append(classificacao);
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
