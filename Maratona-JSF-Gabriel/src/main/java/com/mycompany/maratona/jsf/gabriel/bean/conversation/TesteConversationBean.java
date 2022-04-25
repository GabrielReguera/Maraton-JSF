/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.jsf.gabriel.bean.conversation;

import java.io.Serializable;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.annotation.PostConstruct;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author GestaoTech
 */
@Named
@ConversationScoped
public class TesteConversationBean implements Serializable{
    private List<String> personagens;
    private List<String> personagenSelec = new ArrayList<>();
    
    @Inject
    private Conversation conversation;

    
    public void init(){
        personagens = asList("Kimi no na wa", "Tenki no Ko", "Kakegurui");
        System.out.println("To aqui no Post do Conversation");
        if(conversation.isTransient()){
            conversation.begin();
            System.out.println("Iniciando o Conversation ID=" +conversation.getId());
        }
    }
    
    public String endConversation(){
        if(!conversation.isTransient()){
            conversation.end();
        }
        return "conversation?faces-redirect=true";
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

    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }
    
    
    
    
    
}
