/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.jsf.gabriel.bean.application;

import com.mycompany.maratona.jsf.gabriel.bean.dependent.TesteDependentBean;
import com.mycompany.maratona.jsf.gabriel.bean.session.TesteSessionBean;
import java.io.Serializable;
import static java.util.Arrays.asList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author GestaoTech
 */
@Named
@ApplicationScoped
public class TesteApplicationBean implements Serializable{
    private List<String> categoriaList;
    
    private final TesteDependentBean dependentBean;
    private final TesteSessionBean sessionBean;

    @Inject
    public TesteApplicationBean(TesteDependentBean dependentBean, TesteSessionBean sessionBean) {
        this.dependentBean = dependentBean;
        this.sessionBean = sessionBean;
    }
    
    
    @PostConstruct
    public void init(){
        System.out.println("Dentro do Application Scoped");
        categoriaList = asList("RPG", "Mobile", "FPS");
        sessionBean.selecPersonagem();
    }

    public TesteSessionBean getSessionBean() {
        return sessionBean;
    }
    
    public void mudarLista(){
        categoriaList = asList("RPG", "Mobile", "FPS", "Anime");
        
    }
    
    public List<String> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<String> categoriaList) {
        this.categoriaList = categoriaList;
    }
    
    
}
