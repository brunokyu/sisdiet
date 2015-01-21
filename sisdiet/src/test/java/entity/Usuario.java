package entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idUser;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idUser;
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
			Usuario other = (Usuario) obj;
		if (idUser != other.idUser)
			return false;
		return true;
	}

	@Column
	private String NomeUser;
	@Column
	private String Login;
	@Column
	private String Senha;
	@Column
	private String Nivel;
	@Column
	private String Sexo;
	@Column
	private boolean ativo;

	public int getidUser() {
		return idUser;
	}
	public void setidUser(int idUser) {
		this.idUser = idUser;
	}
	public String getNomeUser() {
			return NomeUser;
	}
	public void setNomeUser(String NomeUser) {
		this.NomeUser = NomeUser;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String Login) {
		this.Login = Login;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String Senha) {
		this.Senha = Senha;
	}
	public String getNivel() {
		return Nivel;
	}
	public void setAdmin(String Nivel) {
		this.Nivel = Nivel;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String Sexo) {
		this.Sexo = Sexo;
	}
	
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}