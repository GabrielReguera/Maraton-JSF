/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.jsf.gabriel.bean.upload;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.file.Files;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.Part;

/**
 *
 * @author GestaoTech
 */
@Named
@ViewScoped
public class UploadTesteBean implements Serializable{
    private Part file;

    public void upload(){
        try(InputStream is = file.getInputStream()) {
            String fileName = file.getSubmittedFileName();
            System.out.println(file.getName());
            System.out.println(file.getSize());
            System.out.println(file.getContentType());
            System.out.println(file.getHeaderNames());
            Files.copy(is, new File("C:\\Users\\GestaoTech\\Documents\\NetBeansProjects\\Maratona-JSF-Gabriel", 
                    fileName).toPath());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Part getFile() {
        return file;
    }

    public void setFile(Part file) {
        this.file = file;
    }
    
    
    
}
