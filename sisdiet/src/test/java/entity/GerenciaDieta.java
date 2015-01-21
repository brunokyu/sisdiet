package entity;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class GerenciaDieta implements Serializable{
//@Column
private int idUser;
@Column
private int idItem;
private Double CalTotal;
private String Data;
Usuario usuario = new Usuario();
public Calendar getData() {
Calendar Data = Calendar.getInstance();
return Data;
}

public int idItem() {
return idItem;
}
public void setidItem(int idItem) {
this.idItem = idItem;
}
public Double getCalTotal() {
return CalTotal;
}
public void setCalTotal(Double CalTotal) {
this.CalTotal = CalTotal;
}
public void CalcTMB (String sexo, double peso, double altura, int idade){
if (sexo == "Homem"){
usuario.setTmb(88.362 + (13.397 * peso) + (4.799 * altura) - (5.677 * idade));
}else
if(sexo == "Mulher"){
usuario.setTmb(447.593 + (9.247 * peso) + (3.098 * altura) - (4.330 * idade));
}


/*criar segunda lista. Como pegaria alimentos da lista de alimentos GERAL, 
para tranferir para a lista2, */


/*lista2 é atrelada ao usuário ou itemdieta(que é o menu de alimentos escolhido pelo usuario)?*/

/*lista 2 é a lista de alimentos da dieta DA PESSOA, tem que ter os alimentos que ela escolheu,
e calcular a quantidade de calorias (onde?)*/

//tmb seria calculado na hora sem passar para o banco?

/*Rsposta: Criar a DIETA em si, em que cada item da dieta seria um id de um alimento, que por sua vez viria de Alimentos.
 *Na DIETA, ficaria a data que a dieta foi feita. Por ex.: Dieta v, foi feita no dia w, contendo os itens x,y,z
 *O cálculo do tmb e afins pode ser feito na hora, um outputlabel recebendo tipo tmbDoUser*exercicioDoUser, ou um textfield recebendo isso já?
 **/


switch (usuario.getExercicio()) {
case 1: usuario.setTmbCal(usuario.getTmb() * 1.2);
break;
case 2: usuario.setTmbCal(usuario.getTmb() * 1.375);
break;
case 3: usuario.setTmbCal(usuario.getTmb() * 1.55);
break;
case 4: usuario.setTmbCal(usuario.getTmb() * 1.725);
break;
case 5: usuario.setTmbCal(usuario.getTmb() * 1.9);
break;
}
}
	public void CalcCal(/*alimentos*/){


			//pseudocodigo
			/*itemdieta.calcCalorias = <alimento.caloria 1+ alimento.caloria 2+ ... + alimento.caloria n>
			
				se CalcCal > (Bmr * exercício)
					mudar label para svermelho
				senão se CalcCal < (Bmr * exercício)
					mudar label para verde
					
					return calorias
				*/	
			
		
	}
}