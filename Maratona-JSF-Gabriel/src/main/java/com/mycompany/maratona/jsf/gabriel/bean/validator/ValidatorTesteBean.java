/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.jsf.gabriel.bean.validator;

import com.mycompany.maratona.jsf.gabriel.model.Estudante;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author GestaoTech
 */
@Named
@ViewScoped
public class ValidatorTesteBean implements Serializable{
    private Estudante estudante = new Estudante();
    
    public void save(){
        System.out.println("Salvando");
        System.out.println(estudante.getEmail());
        
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
    
}
