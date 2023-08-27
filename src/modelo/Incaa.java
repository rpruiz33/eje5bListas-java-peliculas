package modelo;

import java.util.ArrayList;
import java.util.List;

public class Incaa {
	List<Pelicula> catalogo1=new ArrayList<Pelicula>();
	
    private List<Pelicula> catalogo;

    public Incaa() {
        super();
        this.catalogo = new ArrayList<Pelicula>();
    }

    public List<Pelicula> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(List<Pelicula> catalogo) {
        this.catalogo = catalogo;
    }

    public boolean agregarPelicula(String pelicula,Genero genero) {
        for (int i = 0; i < catalogo.size(); i++) {
            if (pelicula.equals(catalogo.get(i).getPelicula())) {
                return false;
            }
        }
        Pelicula nuevaPelicula = new Pelicula(catalogo.size() + 1, pelicula, genero);
        catalogo.add(nuevaPelicula);
        return true;
    }
	public Pelicula traerPelicula(String partePelicula) {
		int i = 0;
		Pelicula pelicula = new Pelicula();
		while (i < catalogo.size()) {
			if (catalogo.get(i).getPelicula().contains(partePelicula)) {
				pelicula = catalogo.get(i);
			}
			i++;

		}
		return pelicula;
	}
	

	public Pelicula traerPeliculaPorGenero(Genero genero) {
		Pelicula pelicula=new Pelicula();
	    for (int i = 0; i < catalogo.size(); i++) {
	         pelicula = catalogo.get(i);
	        
	        if (pelicula.getGenero().equals(genero)) {
	          
	            System.out.println("Nombre: " + pelicula.getPelicula() + ", Género: " + pelicula.getGenero().mostrar());
	        }
	    }
	    
	    return pelicula;
	}

    
}

