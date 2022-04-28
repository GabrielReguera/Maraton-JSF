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
  
  public void init(){
     estudante = (Estudante) ApplicationMapUtil.getValueFromAppMap("estudante");
  }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
   
   
}
