package gestion;

import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
    //Atributos
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales = new ArrayList<Animal>();

    //Constructores
    public Zona() {}

    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
    }

    //Métodos
    public void agregarAnimales(Animal animal) {
        animales.add(animal);
        animal.setZona(this);
    }
    public int cantidadAnimales() {
        return animales.size();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Zoologico getZoo() {
        return zoo;
    }
    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }
    public ArrayList<Animal> getAnimales() {
        return animales;
    }
    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }
}
