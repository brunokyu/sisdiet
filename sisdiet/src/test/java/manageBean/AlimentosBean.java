package manageBean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;

import DAO.AlimentosDAO;
import entity.Alimentos;


@ManagedBean(name="alimentosBean")
@SessionScoped
public class AlimentosBean {
	private Alimentos alimentos;
	private AlimentosDAO alimentosDAO = new AlimentosDAO();
	
	public String inserirAlimentos(){
		alimentosDAO.inserirAlimentos(alimentos);
		listaAlimentos = null;
		return "listaAlimentos";
	}
	
	public Alimentos getAlimentos() {
		if(alimentos == null)
			alimentos = new Alimentos();
		return alimentos;
	}

	public void setAlimentos(Alimentos alimentos) {
		this.alimentos = alimentos;
	}
	
	private List<Alimentos> listaAlimentos = null;
	
	private List<Alimentos> filtroLista = null;
	
	public List<Alimentos> getFiltroLista() {
		return filtroLista;
	}

	public void setFiltroLista(List<Alimentos> filtroLista) {
		this.filtroLista = filtroLista;
	}
	
	public void setListaAlimentos(List<Alimentos> listaAlimentos) {
		this.listaAlimentos = listaAlimentos;
	}

	public List<Alimentos> getListaAlimentos(){
		if(listaAlimentos == null)
			listaAlimentos = alimentosDAO.listarAlimentos();
		return listaAlimentos;
	}
	
	public String deletarAlimentos(){
		alimentosDAO.deletarAlimentos(alimentos);
		listaAlimentos = null;
		return "listaAlimentos";
	}
	
	public void atualizarAlimentos(RowEditEvent evento){
		alimentos = (Alimentos)evento.getObject();
		alimentosDAO.atualizarAlimentos(alimentos);
	}
	
	public void cancelarAlimentos(RowEditEvent evento){
		FacesMessage msg = new FacesMessage("Edição Cancelada");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}


}
