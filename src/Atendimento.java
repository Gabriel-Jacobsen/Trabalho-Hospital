import java.time.LocalDateTime;

public class Atendimento {

	private Paciente paciente;
	private Medico medico;
	private LocalDateTime horaAtendimento;
	
	public Atendimento(Paciente paciente, Medico medico) {
		this.paciente = paciente;
		this.medico = medico;
		horaAtendimento = LocalDateTime.now();
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public LocalDateTime getHoraAtendimento() {
		return horaAtendimento;
	}

	public void setHoraAtendimento(LocalDateTime horaAtendimento) {
		this.horaAtendimento = horaAtendimento;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atendimento [paciente: ");
		builder.append(paciente.getNome());
		builder.append(", medico: ");
		builder.append(medico.getNome());
		builder.append(", horaAtendimento: ");
		builder.append(horaAtendimento);
		builder.append("]");
		return builder.toString();
	}
	
}
