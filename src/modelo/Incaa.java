package modelo;

import java.util.ArrayList;
import java.util.List;

public class Incaa {
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

    public boolean agregarPelicula(String pelicula) {
        for (int i = 0; i < catalogo.size(); i++) {
            if (pelicula.equals(catalogo.get(i).getPelicula())) {
                return false;
            }
        }
        Pelicula nuevaPelicula = new Pelicula(catalogo.size() + 1, pelicula);
        catalogo.add(nuevaPelicula);
        return true;
    }

    public Pelicula traerPeliculaPorGenero(Genero genero) {
        for (Pelicula pelicula : catalogo) {
            if (pelicula.getGenero() != null && pelicula.getGenero().equals(genero)) {
                return pelicula; // Retorna la primera película con el género especificado
            }
        }
        return null; // Retorna null si no se encuentra ninguna película con el género
    }
}
