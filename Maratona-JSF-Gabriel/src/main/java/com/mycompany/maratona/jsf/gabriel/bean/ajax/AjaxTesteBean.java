/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.jsf.gabriel.bean.ajax;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class AjaxTesteBean implements Serializable {

    private String nome;
    private String sobrenome;
    private String email;
    private Map<String, List<String>> mapAnime;
    private List<String> personagens;
    private String animeSelecionado;
    private String personagemSelecionado;

    public void init() {
            System.out.println("entrou");
            mapAnime = new TreeMap<>();
            mapAnime.put("One piece", Arrays.asList("Luffy", "Zoro", "Nami"));
            mapAnime.put("Mirai Nikki", Arrays.asList("Yuki", "Yuno", "jão"));
            mapAnime.put("Boku no Hero", Arrays.asList("Deku", "Kha-chan", "Todoroki"));
    }

    public void upperCase() {
        this.nome = this.nome.toUpperCase();

    }

    public void onSelectAnime() {
        if (animeSelecionado == null) {
            personagens = null;
            return;
        }
        personagens = mapAnime.get(animeSelecionado);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, List<String>> getMapAnime() {
        return mapAnime;
    }

    public void setMapAnime(Map<String, List<String>> mapAnime) {
        this.mapAnime = mapAnime;
    }

    public List<String> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<String> personagens) {
        this.personagens = personagens;
    }

    public String getAnimeSelecionado() {
        return animeSelecionado;
    }

    public void setAnimeSelecionado(String animeSelecionado) {
        this.animeSelecionado = animeSelecionado;
    }

    public String getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(String personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

}
