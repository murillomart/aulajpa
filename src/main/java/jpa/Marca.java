package jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javassist.SerialVersionUID;

@Entity
public class Marca implements Serializable {
	
	private static final long SerialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column
	private Integer idmarca;
	
	@Column (name = "nome", nullable = false)
	private String nome;
	
	public Marca() {

	}
	
	public Marca(Integer id, String nome) {
		this.idmarca = id;
		this.nome = nome;
	}
	
	public Integer getId() {
		return idmarca;
	}
	public void setId(Integer id) {
		this.idmarca = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idmarca == null) ? 0 : idmarca.hashCode());
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
		Marca other = (Marca) obj;
		if (idmarca == null) {
			if (other.idmarca != null)
				return false;
		} else if (!idmarca.equals(other.idmarca))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Marca [id=" + idmarca + ", nome=" + nome + "]";
	}
	
	

}
