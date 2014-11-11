package util;

import org.hibernate.Session;

import entity.Carro;

public class TestaCarro {

	public static void main(String[] args) {
//		criação da sessão
		Session s = HibernateUtil.getSessionFactory().openSession();
			s.beginTransaction();
				Carro c = new Carro();
				c.setAno(2016);
				c.setCombustivel("TESTE2");
				c.setPlaca("MBB-8888");
				s.save(c);
			s.getTransaction().commit();
		s.close();
	}

}
