/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maratona.jsf.gabriel.bean.beanvalidation;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author GestaoTech
 */
@Named
@ViewScoped
public class BeanValidationTesteBean implements Serializable{
    @Size(min = 3, max= 10, message = "Entre e 3 e 10 caracter")
    @NotNull(message = "O nome é obrgatório")
    private String nome;
    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Digite um email validor")
    private String email;
    @DecimalMax(value = "30.00", message = "Menor que trinta")
    @DecimalMin(value = "5.00", message = "Maior que cinco")
    private double decimal;
    @Digits(integer = 3, fraction = 2, message = "Não pode ser maior que 999 e depois da virgula maior que 3")
    private double numero;
    
    public void salvar(){
        System.out.println("Salvando");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDecimal() {
        return decimal;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
