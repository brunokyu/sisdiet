package entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class GerenciaDieta implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idgerenciaDieta;
	
	@Column(name="data")
	@Temporal(TemporalType.DATE)
	private Date dataItem;
	
	@OneToMany(mappedBy="gerenciadieta")
	private List<Alimentos> alimentos;
	
	@OneToMany(mappedBy="gerenciadieta")
	private List<Usuario> usuarios;
	@ManyToOne
	@JoinColumn(referencedColumnName="idUser",name="fkidUser")
	private Usuario idusuario;

	public List<Alimentos> getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(List<Alimentos> alimentos) {
		this.alimentos = alimentos;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idgerenciaDieta;
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
		GerenciaDieta other = (GerenciaDieta) obj;
		if (idgerenciaDieta != other.idgerenciaDieta)
			return false;
		return true;
	} 
}