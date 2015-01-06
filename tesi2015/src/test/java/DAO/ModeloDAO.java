package DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import entity.Modelo;

public class ModeloDAO extends MasterDAO{
	public void inserirModelo(Modelo modelo){
		inserirObjeto(modelo);
	}
	
	public void deletarModelo(Modelo modelo){
		deletarObjeto(modelo);
	}
	
	public void atualizarModelo(Modelo modelo){
		atualizarObjeto(modelo);
	}
	
	public Modelo getModelo(int idModelo){
		return getObjeto(Modelo.class, idModelo);
	}
	
	public List<Modelo> getListaModelo(){
		return getLista("from Modelo m");
	}
	
	public List<Modelo> buscaModelo(String str){
		Session s = getSession();
		s.beginTransaction();
		Query qr = s.createQuery("from Modelo m where m.descModelo like :mo");
		qr.setParameter("mo","%"+str+"%");
		List<Modelo> listaModelo = qr.list();
		s.getTransaction().commit();
		s.close();
		return listaModelo;
	}
	
}