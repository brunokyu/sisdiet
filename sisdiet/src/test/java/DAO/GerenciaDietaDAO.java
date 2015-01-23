package DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import entity.Alimentos;
import entity.GerenciaDieta;
import entity.ItemDieta;

public class GerenciaDietaDAO extends MasterDAO {
	
	//Inserir
	public void additemDieta(ItemDieta itemdieta){
		inserirObjeto(itemdieta);
	}
	//atualizar
	public void atualizarGerenciaDieta(GerenciaDieta gerenciaDieta){
		atualizarObjeto(gerenciaDieta);
	}
	
//listar todos os Alimentos
	public List<Alimentos> listarAlimentos(){
		Session s = getSession();
		s.beginTransaction();
		Query qr = s.createQuery("from Alimentos a");
		List<Alimentos> listaAlimentos = qr.list();
		s.close();
		return listaAlimentos;
	}
	
	public Alimentos getAlimentos(int idAlimento){
		Session s = getSession();
		s.beginTransaction();
		Alimentos a = (Alimentos) s.get(Alimentos.class, idAlimento);
		s.getTransaction().commit();
		s.close();
		return a;
	}
	
	public List<Alimentos> buscarPorNome(String NomeAlimento){
		Session s = getSession();
		s.beginTransaction();
		Query qr = s.createQuery("from Alimentos a where a.NomeAlimento like :pa");
		qr.setParameter("pa","%"+NomeAlimento+"%");
		List<Alimentos> listaAlimentos = qr.list();
		s.close();
		return listaAlimentos;
	}
}
