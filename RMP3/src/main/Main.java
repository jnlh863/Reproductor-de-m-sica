package main;

import RMP3.MP3;
import Controlador.ControladorR;

public class Main {

    public static void main(String[] args) {
        //Instanciando el reproductor
        MP3 R = new MP3();
        
        //Instanciando el controlador del reproductor (Caracteristicas)
        ControladorR cR = new ControladorR(R);
        
        
    }
    
}
