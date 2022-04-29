/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.jsf.gabriel.converters;

import com.mycompany.maratona.jsf.gabriel.model.Estudante;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author GestaoTech
 */
@FacesConverter
public class EstudanteConverter implements Converter{
    List<Estudante> estudanteList = Estudante.estudanteLista();
    
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        if(value == null || !value.matches("\\d+")){
            return null;
            Estudante estudante = new Estudante();
            estudante.setId(Integer.parseInt(value));
            int index = estudanteList.indexOf(estudante);
            estudanteList.get(index);
            
        }
        
    }
 
    @Override
    public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
