package DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import entity.Alimentos;
import entity.ItemDieta;

public class ItemDietaDAO extends MasterDAO{
	
	
	public void CadastrarItem(ItemDieta item){
		inserirObjeto(item);
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
