/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.jsf.gabriel.util;

import javax.faces.context.FacesContext;

/**
 *
 * @author GestaoTech
 */
public class ApplicationMapUtil {
    public static Object getValueFromAppMap(String key){
        return FacesContext.getCurrentInstance().getExternalContext().getApplicationMap().get(key);
    }
    
    public static void setValueInAppMap(String key, Object value){
        FacesContext.getCurrentInstance().getExternalContext().getApplicationMap().put(key, value);
    }
}
