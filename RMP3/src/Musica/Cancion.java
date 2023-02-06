package Musica;


public class Cancion {
    
    private String cod;
    private String song;
    private String time;
    private byte[] music;
    
    //Relacion entre musica y genero
    private Genero genero;
    
    public Cancion(){
        
    }
    
    public Cancion(String cod, String song, String time, byte[]music, Genero genero){
        this.cod = cod;
        this.music = music;
        this.song = song;
        this.time = time;
        this.genero = genero;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public byte[] getMusic() {
        return music;
    }

    public void setMusic(byte[] music) {
        this.music = music;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    

    @Override
    public String toString() {
        return song;
    }
    
    
    
    
}
