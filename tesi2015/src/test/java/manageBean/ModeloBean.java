package manageBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entity.Marca;
import entity.Modelo;
import DAO.ModeloDAO;

@ManagedBean(name="modeloBean")
@SessionScoped
public class ModeloBean {
	private ModeloDAO modeloDAO = new ModeloDAO();
	private Modelo modelo;
	private Marca marca;
	
	public String inserirModelo(){
		//System.out.println("Modelo: "+getModelo().getMarca());
		modeloDAO.inserirModelo(modelo);
		return "listamodelos";
	}

	public ModeloDAO getModeloDAO() {
		return modeloDAO;
	}

	public void setModeloDAO(ModeloDAO modeloDAO) {
		this.modeloDAO = modeloDAO;
	}

	public Modelo getModelo() {
		if(modelo == null){
			setMarca(new Marca());
			modelo = new Modelo();
		}
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	
}
