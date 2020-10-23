package jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Automovel implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer idautomovel;
	
	@Column(name = "anoFabricacao", nullable = false)
	private Integer anoFabricacao;

	@Column(name = "anoModelo", nullable = false)
	private Integer anoModelo;

	@Column(name = "observacoes")
	private String observacoes;
	
	@Column(name = "preco", nullable = false)
	private Double preco;
	
	@Column(name = "kilometragem")
	private Integer kilometragem;
	
	@OneToOne
	@JoinColumn(name = "idmodelo")
	private Modelo modelo;
	
	public Automovel() {
	}

	public Automovel(Integer idautomovel, Integer anoFabricacao, Integer anoModelo, String observacoes, Double preco,
			Integer kilometragem, Modelo modelo) {
		super();
		this.idautomovel = idautomovel;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.observacoes = observacoes;
		this.preco = preco;
		this.kilometragem = kilometragem;
		this.modelo = modelo;
	}

	public Integer getIdautomovel() {
		return idautomovel;
	}

	public void setIdautomovel(Integer idautomovel) {
		this.idautomovel = idautomovel;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Integer getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getKilometragem() {
		return kilometragem;
	}

	public void setKilometragem(Integer kilometragem) {
		this.kilometragem = kilometragem;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anoFabricacao == null) ? 0 : anoFabricacao.hashCode());
		result = prime * result + ((anoModelo == null) ? 0 : anoModelo.hashCode());
		result = prime * result + ((idautomovel == null) ? 0 : idautomovel.hashCode());
		result = prime * result + ((kilometragem == null) ? 0 : kilometragem.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((observacoes == null) ? 0 : observacoes.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
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
		Automovel other = (Automovel) obj;
		if (anoFabricacao == null) {
			if (other.anoFabricacao != null)
				return false;
		} else if (!anoFabricacao.equals(other.anoFabricacao))
			return false;
		if (anoModelo == null) {
			if (other.anoModelo != null)
				return false;
		} else if (!anoModelo.equals(other.anoModelo))
			return false;
		if (idautomovel == null) {
			if (other.idautomovel != null)
				return false;
		} else if (!idautomovel.equals(other.idautomovel))
			return false;
		if (kilometragem == null) {
			if (other.kilometragem != null)
				return false;
		} else if (!kilometragem.equals(other.kilometragem))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (observacoes == null) {
			if (other.observacoes != null)
				return false;
		} else if (!observacoes.equals(other.observacoes))
			return false;
		if (preco == null) {
			if (other.preco != null)
				return false;
		} else if (!preco.equals(other.preco))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Automovel [idautomovel=" + idautomovel + ", anoFabricacao=" + anoFabricacao + ", anoModelo=" + anoModelo
				+ ", observacoes=" + observacoes + ", preco=" + preco + ", kilometragem=" + kilometragem + ", modelo="
				+ modelo + "]";
	}

	

}
