/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.jsf.gabriel.bean.estudante;

import com.mycompany.maratona.jsf.gabriel.model.Estudante;
import java.io.Serializable;
import static java.util.Arrays.asList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.el.LambdaExpression;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author GestaoTech
 */
@Named
@ViewScoped
public class EstudanteRegistrarBean1 implements Serializable{
    private Estudante estudante = new Estudante();
    private String[] nomesArray = {"Luffy", "O rei"};
    private List<String> nomesList = asList("Gustavo", "Enilson", "Tiago");
    private Set<String> nomeSet = new HashSet<>(asList("Matheus", "Pai", "Pablo"));
    private Map<String, String> nomeMap = new HashMap<>();
    private boolean mostrarNotas;
    
//    {
//        nomeMap.put("Bruno", "Carpintiero");
//        nomeMap.put("Francisco", "Engenheiro");
//        nomeMap.put("Maria", "Policial");
//        
//        for(Map.Entry<String, String> entry : nomeMap.entrySet()){
//            System.err.println(entry.getKey());
//            System.err.println(entry.getValue());
//        }
//    }
    
    public void calcularCubo(LambdaExpression le, long value){
       long result = (long)le.invoke(FacesContext.getCurrentInstance().getELContext(), value);
       System.out.println(result);
    }
    
        
    public String mostrarNotas1(){
        this.mostrarNotas = true;
        return "index";
    }
    public String esconderNotas(){
        this.mostrarNotas = false;
        return  "index";
    }
    
    public void executar(){
        System.out.println("Fazendo Busca no BD ");
        System.out.println("Processando ");
        System.out.println("Concluído ");
    
    }
    public void executarParam(String param){
        System.out.println("Fazendo Busca no BD com o Parâmetro: " + param);
        System.out.println("Processando ");
        System.out.println("Concluído ");
    
    }
    public String executarRetorno(String param){
        return "Melhor Pragramador é o: " + param;
    
    }
    public String outraPagina(){
        return "index2";
    
    }

    public boolean isMostrarNotas() {
        return mostrarNotas;
    }

    public void setMostrarNotas(boolean mostrarNotas) {
        this.mostrarNotas = mostrarNotas;
    }
    
    
    public Map<String, String> getNomeMap() {
        return nomeMap;
    }

    public void setNomeMap(Map<String, String> nomeMap) {
        this.nomeMap = nomeMap;
    }
    
    
    
    
    
    public Set<String> getNomeSet() {
        return nomeSet;
    }

    public void setNomeSet(Set<String> nomeSet) {
        this.nomeSet = nomeSet;
    }      
    
    
    public Estudante getEstudante() {
        return estudante;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }
    
    

   
    
    
}
