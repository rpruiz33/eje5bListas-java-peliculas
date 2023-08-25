package modelo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Pelicula {

private int id_pelicula;
private String pelicula;
private Genero genero;

public Pelicula(int id_pelicula, String pelicula) {
	super();
	this.id_pelicula = id_pelicula;
	this.pelicula = pelicula;
}

public int getId_pelicula() {
	return id_pelicula;
}

public void setId_pelicula(int id_pelicula) {
	this.id_pelicula = id_pelicula;
}

public String getPelicula() {
	return pelicula;
}

public void setPelicula(String pelicula) {
	this.pelicula = pelicula;
}

public Genero getGenero() {
	return genero;
}

public void setGenero(Genero genero) {
	this.genero = genero;
}

public Pelicula(int id_pelicula, String pelicula, Genero genero) {
	super();
	this.id_pelicula = id_pelicula;
	this.pelicula = pelicula;
	this.genero = genero;
}

public Pelicula() {
	super();
}
@Override
public String toString() {
    return "Pelicula: " + pelicula + ", Genero: " + genero;
}
public void mostrar(Genero genero) {
System.out.println(genero);
}
}
 