/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.streaming;

/**
 *
 * @author Cabrea
 */
public class Streaming {

    public static void main(String[] args) {

        Filme filme = new Filme();

        filme.setNome("Vingadores");
        filme.setGenero("Acao");
        filme.setDuracao(143);

        Serie serie = new Serie();

        serie.setNome("Stranger Things");
        serie.setGenero("Ficcao cientifica");
        serie.setTemporadas(4);

        System.out.println("=== FILME CADASTRADO ===");
        System.out.println("Tipo: " + filme.getTipo());
        filme.exibirDadosBasicos();
        System.out.println("Duracao: " + filme.getDuracao() + " minutos");

        System.out.println();

        System.out.println("=== SERIE CADASTRADA ===");
        System.out.println("Tipo: " + serie.getTipo());
        serie.exibirDadosBasicos();
        System.out.println("Temporadas: " + serie.getTemporadas());
    }
}
