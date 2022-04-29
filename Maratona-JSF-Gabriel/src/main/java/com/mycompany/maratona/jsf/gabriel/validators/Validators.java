/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.jsf.gabriel.validators;

import java.io.Serializable;
import static java.util.Arrays.asList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;

/**
 *
 * @author GestaoTech
 */
@Named
@RequestScoped
public class Validators  implements Serializable{
    private List<String> emailsDB = asList("joao@gmail.com", "eu@hotmail.com");
    
    
    public void validateDupplicateEmail(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        String email = (String) o;
        if(emailsDB.contains(email)){
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "O email ja existe","");
            throw new ValidatorException(message);
            
        }
    }
    
    
    
    
    
    
    
}
