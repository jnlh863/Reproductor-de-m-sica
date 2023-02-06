package Musica;

public class Genero {

    private String cod;
    private String genero;

    public Genero() {

    }

    public Genero(String cod, String genero) {
        this.cod = cod;
        this.genero = genero;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return genero;
    }

    
}
