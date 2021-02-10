package java_doc;

/**
 * Classe que representa um contato.
 * 
 * @author Luan Felipe
 * @version 1.0
 */
public class Contato {

	/**
	 * Nome do Contato
	 */
	private String nome;
	/**
	 * Email do Contato
	 */
	private String email;
	/**
	 * Endereco do contato
	 */
	private Endereco endereco = new Endereco();

	/**
	 * 
	 * @param nome
	 * @param email
	 * @param endereco
	 */
	public Contato(String nome, String email, Endereco endereco) {

		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}

	/**
	 * 
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
