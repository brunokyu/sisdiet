package manageBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import DAO.MarcaDAO;
import entity.Marca;
@ManagedBean(name="marcaBean")
@SessionScoped
public class MarcaBean {
	private Marca marca;
	private MarcaDAO marcaDAO = new MarcaDAO();
	
	public void inserirMarca(){
		marcaDAO.inserirMarca(marca);
	}
	public Marca getMarca() {
		if(marca == null)
			marca = new Marca();
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
}
