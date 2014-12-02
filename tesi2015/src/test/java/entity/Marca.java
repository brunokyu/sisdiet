package entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Marca implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idMarca;
	
	private String descMarca;
//	Atributo que não é persistido no banco
	@Transient
	private String msg;
	
	@OneToMany(mappedBy="marca")
	private List<Modelo> modelos;
	
	public int getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}
	public String getDescMarca() {
		return descMarca;
	}
	public void setDescMarca(String descMarca) {
		this.descMarca = descMarca;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idMarca;
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
		if (idMarca != other.idMarca)
			return false;
		return true;
	}
	
	
	
}
