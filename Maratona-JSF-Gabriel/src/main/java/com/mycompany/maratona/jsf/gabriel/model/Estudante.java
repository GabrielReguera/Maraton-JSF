/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.jsf.gabriel.model;

import com.mycompany.maratona.jsf.gabriel.model.enums.Turno;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;
import javax.inject.Named;

/**
 *
 * @author GestaoTech
 */
@Named
public class Estudante {

    private Integer id;
    private String nome = "Gabriel";
    private String sobrenome = "Lindo";
    private double nota1 = 22;
    private double nota2;
    private double nota3;
    private String email;

    private Turno turno = Turno.MATUTINO;

    public Estudante() {
    }

    public Estudante(String nome, String sobrenome, double nota1) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nota1 = nota1;
    }
    
    public Estudante(Integer id, String nome, String sobrenome, double nota1) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nota1 = nota1;
    }

    public static List<Estudante> estudanteLista() {
        return new ArrayList<>(asList(new Estudante(1,"julio", "senpai", 7),
                new Estudante(2, "Heitor", "Souza", 6),
                new Estudante(3, "Franco", "Pereira", 8)
        )
        );

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

}
