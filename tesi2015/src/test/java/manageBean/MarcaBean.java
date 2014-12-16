package manageBean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;

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
	
	private List<Marca> listaMarca = null;
	
	private List<Marca> filtroLista = null;
	
	public List<Marca> getFiltroLista() {
		return filtroLista;
	}

	public void setFiltroLista(List<Marca> filtroLista) {
		this.filtroLista = filtroLista;
	}
	
	public void setListaMarca(List<Marca> listaMarca) {
		this.listaMarca = listaMarca;
	}

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
	
	public void atualizarMarca(RowEditEvent evento){
		marca = (Marca)evento.getObject();
		marcaDAO.atualizarMarca(marca);
	}
	
	public void cancelarMarca(RowEditEvent evento){
		FacesMessage msg = new FacesMessage("Edição Cancelada");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}


}



