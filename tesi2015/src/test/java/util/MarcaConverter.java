package util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

import org.omnifaces.converter.SelectItemsConverter;

import entity.Marca;

@FacesConverter("marcaConverter")
public class MarcaConverter extends SelectItemsConverter {
	public String getAsString(FacesContext context, UIComponent component, Object value) {
        Integer id = (value instanceof Marca) ? ((Marca) value).getIdMarca() : null;
        return (id != null) ? String.valueOf(id) : null;
    }
}
