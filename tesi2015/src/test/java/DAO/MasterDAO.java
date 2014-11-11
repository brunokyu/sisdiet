package DAO;

import org.hibernate.Session;

import util.HibernateUtil;
import entity.Carro;

public class MasterDAO {
	public Session getSession(){
		return HibernateUtil.getSessionFactory().openSession();
	}
	//inserir
	public void inserirObjeto(Object obj){
		Session s = getSession();
		s.beginTransaction();
		s.save(obj);
		s.getTransaction().commit();
		s.close();
	}
}
