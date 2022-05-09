/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.jsf.gabriel.datatable;

import com.mycompany.maratona.jsf.gabriel.model.Estudante;
import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author GestaoTech
 */
@Named
@ViewScoped
public class DataTableTestBean implements Serializable {

    private List<Estudante> estudantelist = Estudante.estudanteLista();
    private Map<String, Estudante> mapEstudanteList = new HashMap<>();

    public void init() {
        mapEstudanteList.put("Estudante1", new Estudante(1, "julio", "senpai", 7));
        mapEstudanteList.put("Estudante2", new Estudante(2, "Heitor", "Souza", 6));
        mapEstudanteList.put("Estudante3", new Estudante(3, "Franco", "Pereira", 8));

    }

    public void orderByNome(String order) {
        if (order.equals("asc")) {
            estudantelist.sort(Comparator.comparing(Estudante::getNome));
        } else {
            estudantelist.sort(Comparator.comparing(Estudante::getNome).reversed());
        }
    }

    public void orderBySobrenome(String order) {
        if (order.equals("asc")) {
            estudantelist.sort(Comparator.comparing(Estudante::getSobrenome));
        } else {
            estudantelist.sort(Comparator.comparing(Estudante::getSobrenome).reversed());
        }
    }

    public void remove(Estudante estudante) {
        estudantelist.remove(estudante);
    }

    public void edit(Estudante estudante) {
        estudante.setEditing(true);
    }

    public void save() {
        estudantelist.forEach(estudante -> {
            if (estudante.isEditing()) {
                System.out.println(estudante);
            }
            estudante.setEditing(false);
        }
        );
    }

    public List<Estudante> getEstudantelist() {
        return estudantelist;
    }

    public void setEstudantelist(List<Estudante> estudantelist) {
        this.estudantelist = estudantelist;
    }

    public Map<String, Estudante> getMapEstudanteList() {
        return mapEstudanteList;
    }

    public void setMapEstudanteList(Map<String, Estudante> mapEstudanteList) {
        this.mapEstudanteList = mapEstudanteList;
    }

}
