/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.streaming;

/**
 *
 * @author cabre
 */

public abstract class Conteudo {

    protected String nome;
    private String genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public final void exibirDadosBasicos() {
        System.out.println("Nome: " + nome);
        System.out.println("Genero: " + genero);
    }

    public abstract String getTipo();
}

