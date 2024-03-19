package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Reptil extends Animal{
    //Atributos
    private static ArrayList<Reptil> listado = new ArrayList<>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    //Constructores
    public Reptil() {}
    public Reptil(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas,
                  int largoCola) {
        super(nombre, edad, habitat, genero, zona);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }

    //Métodos
    public static int cantidadReptiles() {
        return listado.size();
    }
    public Reptil crearIguana(String nombre, int edad, String genero, Zona zona) {
        iguanas += 1;
        return new Reptil(nombre, edad, "humedal", genero, zona, "verde", 3);
    }
    public Reptil crearSerpiente(String nombre, int edad, String genero, Zona zona) {
        serpientes += 1;
        return new Reptil(nombre, edad, "jungla", genero, zona, "blanco", 1);
    }
    public static ArrayList<Reptil> getListado() {
        return listado;
    }
    public static void setListado(ArrayList<Reptil> listado) {
        Reptil.listado = listado;
    }
    public String getColorEscamas() {
        return colorEscamas;
    }
    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }
    public int getLargoCola() {
        return largoCola;
    }
    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }
}
