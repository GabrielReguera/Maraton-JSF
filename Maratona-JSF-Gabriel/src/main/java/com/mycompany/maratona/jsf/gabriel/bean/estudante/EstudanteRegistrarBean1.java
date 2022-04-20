/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.jsf.gabriel.bean.estudante;

import com.mycompany.maratona.jsf.gabriel.model.Estudante;
import static java.util.Arrays.asList;
import java.util.List;
import javax.inject.Named;

/**
 *
 * @author GestaoTech
 */
@Named
public class EstudanteRegistrarBean1 {
    private Estudante estudante = new Estudante();
    private String[] nomesArray = {"Luffy", "O rei"};
    private List<String> nomesList = asList("Gustavo", "O Pragramador");
    public Estudante getEstudante() {
        return estudante;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }
    
    

   
    
    
}
