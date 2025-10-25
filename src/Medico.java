
public class Medico extends Pessoa{

	private static int idMax=0;
	
	private int idMedico;
	
	public Medico(String nome) {
		super(nome);
		idMedico = idMax;
		idMax++;
	}

	public int getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
	}


	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ID: ");
		builder.append(idMedico);
		return builder.toString();
	}

}
