/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionExamen;

/**
 *
 * @author T-101
 */
public class Pregunta {
  private String titulo;
  private Opcion opciones[];

    public Pregunta(String titulo, Opcion[] opciones) {
        this.titulo = titulo;
        this.opciones = opciones;
    }
  

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the opciones
     */
    public Opcion[] getOpciones() {
        return opciones;
    }

    /**
     * @param opciones the opciones to set
     */
    public void setOpciones(Opcion[] opciones) {
        this.opciones = opciones;
    }
}
