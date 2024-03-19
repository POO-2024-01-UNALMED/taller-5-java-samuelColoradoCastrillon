package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Mamifero extends Animal{
    //Atributos
    private static ArrayList<Mamifero> listado = new ArrayList<>();
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    //Constructores
    public Mamifero() {}
    public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero, zona);
        this.pelaje = pelaje;
        this.patas = patas;
        listado.add(this);
    }

    //Métodos
    public static int cantidadMamiferos() {
        return listado.size();
    }
    public Mamifero crearCaballo(String nombre, int edad, String genero, Zona zona) {
        caballos += 1;
        return new Mamifero(nombre, edad, "pradera", genero, zona, true, 4);
    }
    public Mamifero crearLeon(String nombre, int edad, String genero, Zona zona) {
        leones += 1;
        return new Mamifero(nombre, edad, "selva", genero, zona, true, 4);
    }
    public static ArrayList<Mamifero> getListado() {
        return listado;
    }
    public static void setListado(ArrayList<Mamifero> listado) {
        Mamifero.listado = listado;
    }
    public boolean isPelaje() {
        return pelaje;
    }
    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }
    public int getPatas() {
        return patas;
    }
    public void setPatas(int patas) {
        this.patas = patas;
    }
}
