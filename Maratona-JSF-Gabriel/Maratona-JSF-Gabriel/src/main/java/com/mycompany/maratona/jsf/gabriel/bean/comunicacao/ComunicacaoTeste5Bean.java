/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.jsf.gabriel.bean.comunicacao;

import com.mycompany.maratona.jsf.gabriel.model.Estudante;
import java.io.Serializable;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author GestaoTech
 */
@Named
@ViewScoped
public class ComunicacaoTeste5Bean implements Serializable {

    private String nome;
    private String sobrenome;

    public void execute(ActionEvent event) {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        System.out.println("veio do setPropertyActionListener" + nome);
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        System.out.println("veio do setPropertyActionListener" + sobrenome);
        this.sobrenome = sobrenome;
    }

}
