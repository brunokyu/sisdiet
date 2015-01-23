package entity ;


import java.io.Serializable;
import java.sql.Array;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class ItemDieta implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idItemDieta;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="idAlimento",name="fkAlimento")
	private Alimentos alimentos;
	@ManyToOne
	@JoinColumn(referencedColumnName="idgerenciaDieta",name="fkgerenciaDieta")
	private GerenciaDieta gerenciadieta;
	@Column(name="data")
	@Temporal(TemporalType.DATE)
	private Date dataItem;
}