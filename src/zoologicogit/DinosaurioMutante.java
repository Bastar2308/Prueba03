/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologicogit;

/**
 *
 * @author edwin
 */
public class DinosaurioMutante {
    
    private String era;
    private String tipo;
    private String alimentacion;

    public String getEra() {
        return era;
    }

    public void setEra(String era) {
        this.era = era;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public DinosaurioMutante() {
    }

    public DinosaurioMutante(String era, String tipo, String alimentacion) {
        this.era = era;
        this.tipo = tipo;
        this.alimentacion = alimentacion;
    }
    
    
    
}
