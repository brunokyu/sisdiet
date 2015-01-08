package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idUser;
	@Column(nullable=false)
	private String NomeUser;
	@Column
	private String Senha;
	@Column
	private int nivel;
}
