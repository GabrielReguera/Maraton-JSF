/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.jsf.gabriel.bean.comunicacao;

import com.mycompany.maratona.jsf.gabriel.model.Estudante;
import java.io.Serializable;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author GestaoTech
 */
@Named
@ViewScoped
public class ComunicacaoTeste10Bean implements Serializable {
   private String passWord;
   private List<Estudante> estudanteList = Estudante.estudanteLista();
    
   public void remover(Estudante estudante){
       estudanteList.remove(estudante);
       
   }
   
   public void salvar(){
       System.out.println(passWord);
       
   }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public List<Estudante> getEstudanteList() {
        return estudanteList;
    }

    public void setEstudanteList(List<Estudante> estudanteList) {
        this.estudanteList = estudanteList;
    }
   
   
}
