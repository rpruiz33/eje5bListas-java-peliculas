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
		Genero genero1=new Genero(3,"accion");
		

	
		incaa.agregarPelicula("volver al futuro2",genero);
		incaa.agregarPelicula("ASDASD",genero);
		incaa.agregarPelicula("river", genero1);
//		System.out.println("**********Buscando por genero****************");
//		for (int i = 0; i<incaa.getCatalogo().size();i++) {
//			
//			if(incaa.getCatalogo().get(i).getGenero()==genero) {
//				
//				System.out.println(incaa.getCatalogo().get(i).getPelicula()+" genero "+ genero.getGenero()+" ");
//
//			
//			}
//			
//		}
		System.out.println("**********Buscando por genero2222****************");
		for (int i = 0; i<incaa.getCatalogo().size();i++) {
			System.out.println(incaa.traerPeliculaPorGenero(genero).toString());
		
	}
	}

}
