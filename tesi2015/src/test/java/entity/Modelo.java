package entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Modelo implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idModelo;
	
	private String descModelo;
	
	@OneToMany(mappedBy="modelo")
	private List<Carro> carros;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="idMarca",name="fkMarca")
	private Marca marca;
	
	
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public int getIdModelo() {
		return idModelo;
	}

	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
	}

	public String getDescModelo() {
		return descModelo;
	}

	public void setDescModelo(String descModelo) {
		this.descModelo = descModelo;
	}
	
}
