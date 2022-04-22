/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.jsf.gabriel.bean.view;

import java.io.Serializable;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author GestaoTech
 */
@Named
@ViewScoped
public class TesteViewBean implements Serializable{
    
     private List<String> personagens;
    private List<String> personagenSelec = new ArrayList<>();

    @PostConstruct
    public void init(){
        personagens = asList("Mãe", "Pai", "Filho");
        System.out.println("To aqui no Post do Session");
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
