/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.jsf.gabriel.bean.comunicacao;

import com.mycompany.maratona.jsf.gabriel.model.Estudante;
import com.mycompany.maratona.jsf.gabriel.util.ApplicationMapUtil;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author GestaoTech
 */
@Named
@RequestScoped
public class ComunicacaoTeste12Bean implements Serializable {
  private Estudante estudante;
  private Estudante estudante2 = new Estudante();
  
  public void init(){
     estudante = (Estudante) ApplicationMapUtil.getValueFromAppMap("estudante");
  }
  
  public String voltar(){
      System.out.println(estudante2.getNome());
      System.out.println(estudante2.getSobrenome());
      return "comunicacao11?faces-redirect=true";
  }

    public Estudante getEstudante2() {
        return estudante2;
    }

    public void setEstudante2(Estudante estudante2) {
        this.estudante2 = estudante2;
    }

    
    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
   
   
}
