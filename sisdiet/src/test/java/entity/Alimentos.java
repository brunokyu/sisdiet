package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Alimentos implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idAlimento;
	@Column(nullable=false)
	private String NomeAlimento;
	@Column
	private String DescAlimento;
	@Column
	private double QuantAlimento;
	
}
