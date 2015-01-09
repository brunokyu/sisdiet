package util;

import java.util.List;

import DAO.AlimentosDAO;
import entity.Alimentos;

public class TestaAlimento {
	public static void main(String[] args) {
		
		Alimentos a = new Alimentos();
	
		//Inserindo alimento
		AlimentosDAO alimentosDAO = new AlimentosDAO();
//		AlimentosDAO.inserirAlimentos(a);
	    //Listando todos os Alimentos
		List<Alimentos> alimentos = alimentosDAO.listarAlimentos();
		for (Alimentos alimento : alimentos) {
			System.out.println(alimentos);
		}

	}
}
