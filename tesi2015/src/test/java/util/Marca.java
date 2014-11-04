package util;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Marca {
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
	
	
}
