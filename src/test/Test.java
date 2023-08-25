package test;
import java.util.List;
import modelo.Incaa;
import modelo.Pelicula;
import modelo.Genero;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Incaa incaa=new Incaa();
		Genero genero=new Genero(3,"accion");
		System.out.println(genero.toString()); 
		Pelicula pelicula=new Pelicula(1,"volver al futuro2",genero);
		Pelicula pelicula2=new Pelicula(1,"volver al futuro2",genero);
		Pelicula pelicula3=new Pelicula(1,"volver al futuro2",genero);
		incaa.agregarPelicula(pelicula.toString());
		incaa.agregarPelicula(pelicula2.toString());
		incaa.agregarPelicula(pelicula3.toString());
		System.out.println("**********Buscando por genero****************");
		for (int i = 0; i<incaa.getCatalogo().size();i++) {
			System.out.println(incaa.getCatalogo().get(i).toString());
		}
		
	}

}
