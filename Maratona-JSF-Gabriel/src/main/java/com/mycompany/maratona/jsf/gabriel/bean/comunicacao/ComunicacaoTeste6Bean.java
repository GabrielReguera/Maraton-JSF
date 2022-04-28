/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.jsf.gabriel.bean.comunicacao;

import com.mycompany.maratona.jsf.gabriel.model.Estudante;
import java.io.Serializable;
import java.util.List;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author GestaoTech
 */
@Named
@ViewScoped
public class ComunicacaoTeste6Bean implements Serializable {
    private List<Estudante> estudanteList = Estudante.estudanteLista();

    public String editar(int index){
        Estudante estudante = estudanteList.get(index);
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        flash.put("estudante", estudante);
        return "comunicacao7?faces-redirect=true";
    }
    
    
    
    public List<Estudante> getEstudanteList() {
        return estudanteList;
    }

    public void setEstudanteList(List<Estudante> estudanteList) {
        this.estudanteList = estudanteList;
    }

    
}
