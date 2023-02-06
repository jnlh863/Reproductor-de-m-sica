package Controlador;

import Musica.Cancion;
import Musica.Genero;
import RMP3.MP3;
import TelematicoTools.FormMouse.formRoot;
import TelematicoTools.Platillos.DiscoOne;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class ControladorR implements MouseListener{

    static Cancion s;

    private static MP3 R;
    static DiscoOne disco = new DiscoOne();
    formRoot moverconelMouse = new formRoot();
    
    //Clases para la parte de seleccionar musica del ordenador
    
    private ArrayList<Cancion> listmusic = new ArrayList<>();
    private Cancion rola;
    private Genero G;
    private int codigo;
    
    DefaultListModel Jlist = null;
    
    
    public ControladorR(MP3 R){
      this.R = R;
      ejecutar();
    }
    
    public void ejecutar(){
        //Eventos de los botones
        this.R.Play.addMouseListener(this);
        this.R.Pausa.addMouseListener(this);
        this.R.Stop.addMouseListener(this);
        this.R.Repetir.addMouseListener(this);
        this.R.PC.addMouseListener(this);
        this.R.CantidadAudios.addMouseListener(this);
        
        //Evento Jlist
        this.R.jList1.addMouseListener(this);
        
        //Reproductor
        this.R.setSize(800,638);
        this.R.setVisible(true);
        this.R.setLocationRelativeTo(null);
        moverconelMouse.MoverFrame(this.R, this.R.Fondo);
        moverconelMouse.ControlProgress(this.R.jProgressBar1, this.R.jSlider1,disco);
        disco.getTimeRun(this.R.jProgressBar1);
        disco.equalizador(this.R.Ecualizador, 1);
    }
   

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getSource() == this.R.Play){
            disco.continuar();
            
        }else if(e.getSource() == this.R.Pausa){
            disco.pause();
           
        }else if(e.getSource() == this.R.Stop){
            disco.stop();
           
        }else if(e.getSource() == this.R.Repetir){           
            if(e.getClickCount()== 2){
                disco.repetir(1);
            }else{
                if(e.getClickCount() == 1){
                    disco.repetir(0);
                }
            }         
        }else if(e.getSource() == this.R.PC){
            if(e.getClickCount() == 1){
                MusicaLocal(getRutasMusica(new File("C:\\Users\\DELL\\OneDrive\\Datos adjuntos\\Documentos\\PIA\\Mi música")));
            }
        }else if(e.getSource() == this.R.CantidadAudios){
            
        }else if(e.getSource()== this.R.jList1){
            if(e.getClickCount() == 1){
                prePlay();
                this.R.setVisible(true);
            }
            
        }
    }
  
    public static void Play(Cancion item){
        s = item;
        R.Titulo.setText(item.getSong());
        if(item.getSong().endsWith(".mp3")){
            disco.stop();
            disco.PlayMP3(item.getMusic());    
        }else if(item.getSong().endsWith(".wav")){
            disco.stop(); 
            disco.PlayMP3(item.getMusic());
        }     
    }
    
    private void prePlay(){
        for(Cancion items: listmusic){
            if(items.getSong().equals(this.R.jList1.getSelectedValue())){
                ControladorR.Play(items);
                R.dispose();
            }
        }
    }
    
    private ArrayList<File> getRutasMusica(File root){
        ArrayList<File> rolones = new ArrayList<>();
        File[] archivos = root.listFiles();
        try{
        for(File patch:archivos){
           try{
            if(patch.isDirectory() && !patch.isHidden()){
                rolones.addAll(getRutasMusica(patch));
                System.out.println("* * *" + patch.getName() + " * * * *");
            }else{
                if(patch.getName().endsWith(".mp3") || patch.getName().endsWith(".wav")){
                    rolones.add(patch);
                }
            }
           }catch(Exception ex){};
        }}catch(Exception ex){}; 
        return rolones;
        
    }
       
    private void MusicaLocal(ArrayList<File> rootFiles){
         
        Jlist = new DefaultListModel();
        R.jList1.setModel(Jlist);
        
        //Ejecutar cualquier cosa en segundo plano
        new Thread(){
            @Override
            public void run(){
                listmusic = new ArrayList<>();
                for(File items: rootFiles){
                    G = new Genero();
                    rola = new Cancion();
                    
                    //Genero
                    codigo = (int)Math.round(Math.random()*9999);
                    G.setCod(codigo+ "");
                    G.setGenero(disco.getMetaDatos(items.toString()));    
                    
                    //Cancion
                    rola.setCod(codigo + "");
                    rola.setSong(items.getName());
                    try{
                    if(items.getName().endsWith(".mp3")){
                        rola.setTime(disco.duracionMP3(items.toString()));
                    }else if(items.getName().endsWith(".wav")){
                        rola.setTime(disco.duracionMP3(items.toString()));                     
                    }
                    }catch(Exception ex){}
                    try{
                    rola.setMusic(disco.getBytes(items.toString()));
                    rola.setGenero(G);                   
                    listmusic.add(rola);
                    Jlist.addElement(items.getName());
                    R.CantidadAudios.setText(Jlist.getSize() + " Elementos ");
                    }catch(Exception ex){}
                }
            }
        }.start();   
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}
