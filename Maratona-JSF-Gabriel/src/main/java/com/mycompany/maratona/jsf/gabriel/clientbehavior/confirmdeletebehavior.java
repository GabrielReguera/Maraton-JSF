/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.jsf.gabriel.clientbehavior;

import javax.faces.component.behavior.ClientBehaviorBase;
import javax.faces.component.behavior.ClientBehaviorContext;
import javax.faces.component.behavior.FacesBehavior;

/**
 *
 * @author GestaoTech
 */
@FacesBehavior(value = "confirm")
public class confirmdeletebehavior extends ClientBehaviorBase{

    @Override
    public String getScript(ClientBehaviorContext behaviorContext) {
        return "return confirm('Você tem certeza?');";
    }
    
    
}
