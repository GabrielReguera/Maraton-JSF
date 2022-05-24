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
import javax.servlet.http.Part;

/**
 *
 * @author GestaoTech
 */
@Named
@RequestScoped
public class Validators implements Serializable {

    private List<String> emailsDB = asList("joao@gmail.com", "eu@hotmail.com");

    public void validateDupplicateEmail(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        String email = (String) o;
        if (emailsDB.contains(email)) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "O email ja existe", "");
            throw new ValidatorException(message);

        }
    }

    public void validateFile(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        Part file = (Part) o;
        try {
            validateFileNameLength(file);
            validateContentType(file);
            validateFileSize(file);
            
        } catch (RuntimeException e) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "");
            throw new ValidatorException(message);
        }
    }

    private void validateFileNameLength(Part file) {
        if (file.getSubmittedFileName().length() > 10) {
            throw new RuntimeException("O nome + extensão não pode ser maior que 10 caracteres");
        }
    }

    private void validateContentType(Part file) {
        String contentType = file.getContentType();
        if (!contentType.equals("image/png") && !contentType.equals("image.jpge")) {
            throw new RuntimeException("Apena Imagens PGN e JPGE");
        }
    }

    private void validateFileSize(Part file) {
        if (file.getSize() > 1048576) {
            throw new RuntimeException("O arquivo não pode set maior que 1 mega");
        }
    }

}
