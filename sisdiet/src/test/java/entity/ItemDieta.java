package entity ;


import java.io.Serializable;
import java.sql.Array;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class ItemDieta implements Serializable{

	private static final long serialVersionUID = 1L;
@Column
private int idUser;
@Column
private int idLista;
@Column
private Array Alimentos;
}