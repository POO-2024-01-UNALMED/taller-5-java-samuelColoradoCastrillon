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
    public Animal() {
        totalAnimales += 1;
    }
    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales += 1;
    }

    //Métodos
    public static String totalPorTipo() {
        return "Mamiferos: " + Mamifero.cantidadMamiferos()+ "\n"+"Aves: " + Ave.cantidadAves()+ "\n"+"Reptiles: "+Reptil.cantidadReptiles()+"\n"+"Peces: "+Pez.cantidadPeces()+"\n"+"Anfibios: "+Anfibio.cantidadAnfibios();
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
    public String movimiento(){
        return "desplazarse";
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
