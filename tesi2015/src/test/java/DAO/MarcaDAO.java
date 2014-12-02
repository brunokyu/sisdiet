package DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import entity.Carro;
import entity.Marca;

public class MarcaDAO extends MasterDAO{
	//inserir
	public void inserirMarca(Marca marca){
		inserirObjeto(marca);
	}
	//atualizar
	public void atualizarMarca(Marca marca){
		Session s = getSession();
		s.beginTransaction();
		s.update(marca);
		s.getTransaction().commit();
		s.close();
	}
	//deletar
	public void deletarMarca(Marca marca){
		deletarObjeto(marca);
	}
	//listar todos os carros
	public List<Marca> listarMarca(){
		Session s = getSession();
		s.beginTransaction();
		Query qr = s.createQuery("from Marca m");
		List<Marca> listaMarca = qr.list();
		s.close();
		return listaMarca;
	}
	
	public Marca getMarca(int idMarca){
		Session s = getSession();
		s.beginTransaction();
		Marca m = (Marca) s.get(Marca.class, idMarca);
		s.getTransaction().commit();
		s.close();
		return m;
	}
	
	public List<Marca> buscarPorMarca(String desc){
		Session s = getSession();
		s.beginTransaction();
		Query qr = s.createQuery("from Marca m where m.descMarca like :ma");
		qr.setParameter("ma","%"+desc+"%");
		List<Marca> listaMarca = qr.list();
		s.close();
		return listaMarca;
	}
	

}
