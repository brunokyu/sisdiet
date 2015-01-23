package manageBean;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.TransferEvent;
import org.primefaces.event.UnselectEvent;
import org.primefaces.model.DualListModel;

import DAO.AlimentosDAO;
import DAO.GerenciaDietaDAO;
import DAO.ItemDietaDAO;
import entity.Alimentos;
import entity.GerenciaDieta;
import entity.ItemDieta;


@ManagedBean(name="gereciadietaBean")
@SessionScoped
public class GerenciaDietaBean {
	private GerenciaDieta gerenciadieta;
	private GerenciaDietaDAO gerenciadietaDAO = new GerenciaDietaDAO();
	private ItemDieta item = new ItemDieta(); 
	private ItemDietaDAO itemdietaDAO = new ItemDietaDAO();
	public void gerenciarDieta(){
		gerenciadieta = new GerenciaDieta();
		
	}
	 
	public void additemDieta(ItemDieta itemDieta){
		itemdietaDAO.CadastrarItem(item);
		
		
	}
	
	public GerenciaDieta getGerenciaDieta(){
		if(gerenciadieta==null)
			gerenciadieta = new GerenciaDieta();
		return gerenciadieta;
	}
	
	public void setGerenciaDieta(GerenciaDieta gerenciadieta){
		this.gerenciadieta = gerenciadieta;
		
	}
	
	private List<GerenciaDieta> listaGerenciaDieta = null;
	
	private List<GerenciaDieta> filtroLista = null;

	public List<GerenciaDieta> getListaGerenciaDieta() {
		if(listaGerenciaDieta == null)
			listaGerenciaDieta = gerenciadietaDAO.listarAlimentos(); 
		return listaGerenciaDieta;
	}

	public void setListaGerenciaDieta(List<GerenciaDieta> listaGerenciaDieta) {
		this.listaGerenciaDieta = listaGerenciaDieta;
	}

	public List<GerenciaDieta> getFiltroLista() {
		return filtroLista;
	}

	public void setFiltroLista(List<GerenciaDieta> filtroLista) {
		this.filtroLista = filtroLista;
	}
	
	
	
	
	
	/*
	private DualListModel<String> listadieta;
    
    @PostConstruct
    public void init() {
        //Alimentos
        List<String> Alimentos = new ArrayList<String>();
        List<String> Dieta = new ArrayList<String>();
         
        Alimentos.add("Pudin");
        Alimentos.add("Bacon");
        Alimentos.add("Linguiça");
        Alimentos.add("Pão");
        Alimentos.add("Beringela");
        Alimentos.add("Bolo");
        Alimentos.add("Rolinho primavera");
         
        listadieta = new DualListModel<String>(Alimentos, Dieta);
         
    }
 
    public DualListModel<String> getlistadieta() {
        return listadieta;
    }
 
    public void setCities(DualListModel<String> listadieta) {
        this.listadieta = listadieta;
    }
     */
 

}
