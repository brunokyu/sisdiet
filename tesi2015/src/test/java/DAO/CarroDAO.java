package DAO;

import java.util.List;




import org.hibernate.Query;
import org.hibernate.Session;

import entity.Carro;
import util.HibernateUtil;

public class CarroDAO {
	public Session getSession(){
		return HibernateUtil.getSessionFactory().openSession();
	}
	//inserir
	public void inserirCarro(Carro carro){
		Session s = getSession();
		s.beginTransaction();
		s.save(carro);
		s.getTransaction().commit();
		s.close();
	}
	//atualizar
	public void atualizarCarro(Carro carro){
		Session s = getSession();
		s.beginTransaction();
		s.update(carro);
		s.getTransaction().commit();
		s.close();
	}
	//deletar
	public void deletarCarro(Carro carro){
		Session s = getSession();
		s.beginTransaction();
		s.delete(carro);
		s.getTransaction().commit();
		s.close();
	}
	//listar
	public List<Carro> listarCarro(){
		Session s = getSession();
		s.beginTransaction();
		Query qr = s.createQuery("from carro c");
		List<Carro> listaCarro = qr.list();
		return listaCarro;
	}
}
