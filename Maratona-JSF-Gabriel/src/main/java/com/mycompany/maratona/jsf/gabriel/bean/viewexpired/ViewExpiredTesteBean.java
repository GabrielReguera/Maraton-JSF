/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.jsf.gabriel.bean.viewexpired;

import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author GestaoTech
 */
@Named
@ViewScoped
public class ViewExpiredTesteBean implements Serializable{
    private String nome;
    
    public void save(){
        System.out.println(nome);
    }
   public String invalidateSession(){
       FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
       return "login?faces-redirect=true";
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
