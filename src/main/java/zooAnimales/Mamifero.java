package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal{
    //Atributos
    private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    //Constructores
    public Mamifero() {listado.add(this);}
    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        listado.add(this);
        this.pelaje = pelaje;
        this.patas = patas;
    }

    //Métodos
    public static int cantidadMamiferos() {
        return listado.size();
    }
    public static Mamifero crearCaballo(String nombre, int edad, String genero) {
        caballos += 1;
        return new Mamifero(nombre, edad, "pradera", genero, true, 4);
    }
    public static Mamifero crearLeon(String nombre, int edad, String genero) {
        leones += 1;
        return new Mamifero(nombre, edad, "selva", genero, true, 4);
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
