package it.polito.tdp.lab04.model;

public class Corso implements Comparable<Corso> {
	
	private String codins;
	private String nome;
	private int crediti;
	private int pd; // periodo didattico
	
	
	public Corso(String codins) {
		this.codins = codins;
	}

	public Corso(String codins, String nome, int crediti, int pd) {
		this.codins = codins;
		this.nome = nome;
		this.crediti = crediti;
		this.pd = pd;
	}

	/**
	 * Getters and Setters
	 */
	public String getCodins() {
		return codins;
	}

	public void setCodins(String codins) {
		this.codins = codins;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCrediti() {
		return crediti;
	}

	public void setCrediti(int crediti) {
		this.crediti = crediti;
	}

	public int getPd() {
		return pd;
	}

	public void setPd(int pd) {
		this.pd = pd;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Corso other = (Corso) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Corso corsoInput) {
		return this.nome.compareTo(corsoInput.nome);
	}

	@Override
	public String toString() {
		//return "Corso [nome=" + nome + "]";
		return nome;
	}
	

}
