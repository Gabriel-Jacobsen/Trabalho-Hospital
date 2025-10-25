
public class Pessoa {

	private String nome;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(", nome: ");
		builder.append(nome);
		return builder.toString();
	}
	
	
}
