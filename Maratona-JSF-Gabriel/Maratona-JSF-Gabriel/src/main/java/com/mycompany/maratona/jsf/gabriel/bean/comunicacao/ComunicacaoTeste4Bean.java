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
public class ComunicacaoTeste4Bean implements Serializable {

    private String buttomName = "Nome do botao do bean";
    private Estudante estudante = new Estudante();

    public void execute(ActionEvent event) {
        String nome = (String) event.getComponent().getAttributes().get("Nome");
        String adjetivo = (String) event.getComponent().getAttributes().get("Adjetivo");
        Estudante estudante = (Estudante) event.getComponent().getAttributes().get("Estudante");
        System.out.println(nome);
        System.out.println(adjetivo);
        System.out.println(estudante);

    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    
    
    public String getButtomName() {
        return buttomName;
    }

    public void setButtomName(String buttomName) {
        this.buttomName = buttomName;
    }

}
