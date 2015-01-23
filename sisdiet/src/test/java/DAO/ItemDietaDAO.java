package DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import entity.Alimentos;

public class ItemDietaDAO extends MasterDAO{
	
	
	public private void CadastrarItem(i){
		inserirobjeto(item);
	}

	
	public List<Alimentos> listarAlimentos(){
		Session s = getSession();
		s.beginTransaction();
		Query qr = s.createQuery("from Alimentos a");
		List<Alimentos> listaAlimentos = qr.list();
		s.close();
		return listaAlimentos;
	}
	
	
	
}
