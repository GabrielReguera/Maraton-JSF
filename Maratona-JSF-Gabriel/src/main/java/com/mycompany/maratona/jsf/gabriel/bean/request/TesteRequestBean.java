/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.jsf.gabriel.bean.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author GestaoTech
 */
@Named
@RequestScoped
public class TesteRequestBean implements Serializable {

    private List<String> personagens = asList("Luffy", "Midoria", "Annye");
    private List<String> personagenSelec = new ArrayList<>();

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
