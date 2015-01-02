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
private int idUser;
@Column
private int Idade;
@Column
private String NomeUser;
@Column
private String Login;
@Column
private String Senha;
@Column
private double Peso;
@Column
private double Altura;
@Column
private int Nivel;
@Column
private String Sexo;

public int getidUser() {
return idUser;
}
public void setidUser(int idUser) {
this.idUser = idUser;
}
public int getIdade() {
return Idade;
}
public void Idade(int Idade) {
this.Idade = Idade;
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
public double getPeso() {
return Peso;
}
public void setPeso(double Peso) {
this.Peso = Peso;
}
public double getAltura() {
return Altura;
}
public void setAltura(Double Altura) {
this.Altura = Altura;
}
public int getNivel() {
return Nivel;
}
public void setAdmin(int Nivel) {
Nivel = Nivel;
}
public String getSexo() {
return Sexo;
}
public void setSexo(String Sexo) {
this.Sexo = Sexo;
}

public void ChecaLogin(/*Login, senha*/){

}

public void CadastraUsuario(){

}

public void AlteraUsuario(){

}

}