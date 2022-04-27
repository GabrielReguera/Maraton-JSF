/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.jsf.gabriel.bean.comunicacao;

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
public class ComunicacaoTeste3Bean implements Serializable {

    private String nome;
    private String sobrenome;
    private String data;

    public void init() {
//        if (!FacesContext.getCurrentInstance().isPostback()) {
            System.out.println("Comunicacao 3");
            System.out.println(nome);
            System.out.println(sobrenome);
//        }
    }

    public String save() {
        System.out.println("salvando");
        return "resultado?faces-redirect=true&amp;includeViewParams=true";

    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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
