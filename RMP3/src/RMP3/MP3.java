package RMP3;

public class MP3 extends javax.swing.JFrame {

    public MP3() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Anterior = new javax.swing.JLabel();
        Play = new javax.swing.JLabel();
        Stop = new javax.swing.JLabel();
        Pausa = new javax.swing.JLabel();
        PC = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        CantidadAudios = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        Ecualizador = new javax.swing.JLabel();
        Repetir = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        Anterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reproductor de música");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        Play.setDisplayedMnemonic('P');
        Play.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Play);
        Play.setBounds(370, 480, 80, 80);

        Stop.setDisplayedMnemonic('S');
        Stop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Stop);
        Stop.setBounds(270, 490, 80, 80);

        Pausa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Pausa);
        Pausa.setBounds(480, 500, 70, 60);

        PC.setDisplayedMnemonic('O');
        PC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(PC);
        PC.setBounds(560, 510, 60, 50);

        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("...");
        getContentPane().add(Titulo);
        Titulo.setBounds(380, 60, 340, 20);

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setForeground(new java.awt.Color(255, 51, 102));
        jProgressBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(90, 440, 410, 10);

        jSlider1.setBackground(new java.awt.Color(0, 0, 0));
        jSlider1.setForeground(new java.awt.Color(102, 102, 255));
        jSlider1.setToolTipText("Volumen");
        getContentPane().add(jSlider1);
        jSlider1.setBounds(530, 430, 190, 20);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de Música");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(370, 100, 121, 30);

        CantidadAudios.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        CantidadAudios.setForeground(new java.awt.Color(0, 0, 0));
        CantidadAudios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CantidadAudios.setText("0 elementos");
        getContentPane().add(CantidadAudios);
        CantidadAudios.setBounds(590, 100, 140, 30);

        jList1.setBackground(new java.awt.Color(102, 102, 255));
        jList1.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(90, 140, 640, 270);
        getContentPane().add(Ecualizador);
        Ecualizador.setBounds(90, 40, 260, 90);

        Repetir.setDisplayedMnemonic('R');
        Repetir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Repetir);
        Repetir.setBounds(190, 500, 60, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\OneDrive\\Datos adjuntos\\Documentos\\PIA\\reygif.com[12502].gif")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 490, 70, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\OneDrive\\Datos adjuntos\\Documentos\\PIA\\reygif.com[86142].gif")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(660, 470, 57, 90);

        Fondo.setBackground(new java.awt.Color(153, 153, 255));
        Fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RMP3/ReproductorM.png"))); // NOI18N
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MP3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Anterior;
    public javax.swing.JLabel CantidadAudios;
    public javax.swing.JLabel Ecualizador;
    public javax.swing.JLabel Fondo;
    public javax.swing.JLabel PC;
    public javax.swing.JLabel Pausa;
    public javax.swing.JLabel Play;
    public javax.swing.JLabel Repetir;
    public javax.swing.JLabel Stop;
    public javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JList<String> jList1;
    public javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
