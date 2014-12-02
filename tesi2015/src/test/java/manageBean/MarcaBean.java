package manageBean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import DAO.MarcaDAO;
import entity.Marca;
@ManagedBean(name="marcaBean")
@SessionScoped
public class MarcaBean {
	private Marca marca;
	private MarcaDAO marcaDAO = new MarcaDAO();
	
	public String inserirMarca(){
		marcaDAO.inserirMarca(marca);
		listaMarca = null;
		return "listamarcas";
	}
	
	public Marca getMarca() {
		if(marca == null)
			marca = new Marca();
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	private List<Marca> listaMarca;
	
	public List<Marca> getListaMarcas(){
		if(listaMarca == null)
			listaMarca = marcaDAO.listarMarca();
		return listaMarca;
	}
	
	public String deletarMarca(){
		marcaDAO.deletarMarca(marca);
		listaMarca = null;
		return "listamarcas";
	}
}
