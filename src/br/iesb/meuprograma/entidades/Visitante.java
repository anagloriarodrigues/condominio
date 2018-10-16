/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.entidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author anagloria
 */
public class Visitante {
    private int id;
    private String nome;
    private String cpf;
    private int rg;
    private String data;
    
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = "";
            if (nome != null){
           this.nome = nome;
          
        }
        
    }        
			
        public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf="";
        
        if(cpf != null){
            this.cpf = cpf;
        }
    }
   
    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }
        
    

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

   
   
}

