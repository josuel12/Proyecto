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
public class Animal {   
    String id, nombre, especie, edad, hábitat,fechaAlim;
   public static ArrayList<Animal> listaAnimal = new ArrayList<Animal>();
   public static ArrayList<Animal> alimentacion = new ArrayList<Animal>();
   
    public Animal(String id, String nombre, String especie, String edad, String hábitat,String fechaAlim) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.hábitat = hábitat;
        this.fechaAlim = fechaAlim;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechaAlim() {
        return fechaAlim;
    }

    public void setFechaAlim(String fechaAlim) {
        this.fechaAlim = fechaAlim;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getHábitat() {
        return hábitat;
    }

    public void setHábitat(String hábitat) {
        this.hábitat = hábitat;
    }

    public static ArrayList<Animal> getListaAnimal() {
        return listaAnimal;
    }

    public static void setListaAnimal(ArrayList<Animal> listaAnimal) {
        Animal.listaAnimal = listaAnimal;
    }
    
    
}
