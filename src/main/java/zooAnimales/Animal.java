package zooAnimales;

import gestion.Zona;
public class Animal {
    //Atributos
    static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    //Constructores
    public Animal() {}
    public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = zona;
        totalAnimales += 1;
    }

    //Métodos
    public String totalPorTipo() {
        return ("Mamiferos" + Mamifero.cantidadMamiferos()
                + "\nAves" + Ave.cantidadAves()
                + "\nReptiles" + Reptil.cantidadReptiles()
                + "\nPeces" + Pez.cantidadPeces()
                + "\nAnfibios" + Anfibio.cantidadAnfibios());
    }
    @Override
    public String toString() {
        if (zona != null) {
            return ("Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat
                    + " y mi genero es " + genero + ", la zona en la que me ubico es " + zona + ", en el "
                    + zona.getZoo());
        } else {
            return ("Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat
                    + " y mi genero es " + genero);
        }
    }
    public String movimiento() {
        return switch (this) {
            case Ave ave -> "volar";
            case Reptil reptil -> "reptar";
            case Pez pez -> "nadar";
            case Anfibio anfibio -> "saltar";
            default -> "desplazarse";
        };
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Zona getZona() {
        return zona;
    }
    public void setZona(Zona zona) {
        this.zona = zona;
    }
}