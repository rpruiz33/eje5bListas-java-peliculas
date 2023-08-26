package modelo;

public class Genero {
    private int idgenero;
    private String genero;

    public int getIdgenero() {
        return idgenero;
    }

    public void setIdgenero(int idgenero) {
        this.idgenero = idgenero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Genero(int idgenero, String genero) {
        super();
        this.idgenero = idgenero;
        this.genero = genero;
    }

    public Genero() {
        super();
    }
   public String mostrar() {
	   return genero;
   }
}
