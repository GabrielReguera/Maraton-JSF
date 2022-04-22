/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.jsf.gabriel.bean.session;

import java.io.Serializable;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;
import javax.inject.Named;

/**
 *
 * @author GestaoTech
 */
@Named
@SessionScoped
public class TesteSessionBean implements Serializable{
    
     private List<String> personagens;
    private List<String> personagenSelec = new ArrayList<>();

    @PostConstruct
    public void init(){
        personagens = asList("Luffy", "Midoria", "Annye");
        System.out.println("To aqui no Post do Session");
    }
    
    public String logout(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "session?faces-redirect=true";
        
    }
    
    public void selecPersonagem() {
        int index = ThreadLocalRandom.current().nextInt(3);
        String personagem = personagens.get(index);
        personagenSelec.add(personagem);
    }

    public List<String> getPersonagenSelec() {
        return personagenSelec;
    }

    public void setPersonagenSelec(List<String> personagenSelec) {
        this.personagenSelec = personagenSelec;
    }
    
}
