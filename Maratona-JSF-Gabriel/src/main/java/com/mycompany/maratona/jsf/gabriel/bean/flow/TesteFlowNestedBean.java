/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.jsf.gabriel.bean.flow;

import java.io.Serializable;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

/**
 *
 * @author GestaoTech
 */
@Named
@FlowScoped(value = "pendencies")
public class TesteFlowNestedBean implements Serializable{
    private String userName;
    private String userSurname;

    public String validarUser(){
        System.out.println("ta tudo correndo de acordo");
        return "ToRegistration3";
    }
    
    
    
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }
    
    
}
