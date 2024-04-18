/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

import java.util.ArrayList;

/**
 *
 * @author josuel
 */
public class Habitat {
    String id, nombre, tipoAmbiente, capacidad;
    public static ArrayList<Habitat> listaHabitat = new ArrayList<Habitat>();
    
    public Habitat(String id, String nombre, String tipoAmbiente, String capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.tipoAmbiente = tipoAmbiente;
        this.capacidad = capacidad;
        
    }
    
    public int getCantidadAnimales() {
        return Animal.listaAnimal.size();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAmbiente() {
        return tipoAmbiente;
    }

    public void setTipoAmbiente(String tipoAmbiente) {
        this.tipoAmbiente = tipoAmbiente;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public static ArrayList<Habitat> getListaHabitat() {
        return listaHabitat;
    }

    public static void setListaHabitat(ArrayList<Habitat> listaHabitat) {
        Habitat.listaHabitat = listaHabitat;
    }
}
