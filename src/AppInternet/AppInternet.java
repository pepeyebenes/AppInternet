
package AppInternet;

import com.jcraft.jsch.JSchException;
import java.awt.Color;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**Aplicación para permitir el acceso a Internet
 *
 * @author José M. Yébenes
 */
public class AppInternet extends javax.swing.JFrame {
    /**
     * Constructor AppInternet()
     */
     
    public AppInternet() {
        initComponents();
        //Color de fondo negro del panel
        this.getContentPane().setBackground(Color.black);
        setIconImage (new ImageIcon(getClass().getResource("/Imagenes/internet.png")).getImage());
        btnConectar.setEnabled(false);
        btnDesconectar.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnValidar = new javax.swing.JButton();
        btnConectar = new javax.swing.JButton();
        btnDesconectar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acceso a Internet");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.gif"))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario: ");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");

        btnValidar.setBackground(new java.awt.Color(0, 0, 0));
        btnValidar.setForeground(new java.awt.Color(255, 255, 255));
        btnValidar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        btnValidar.setToolTipText("Validación de usuario");
        btnValidar.setActionCommand("");
        btnValidar.setSelected(true);
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });

        btnConectar.setBackground(new java.awt.Color(0, 0, 0));
        btnConectar.setForeground(new java.awt.Color(255, 255, 255));
        btnConectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/conexion.png"))); // NOI18N
        btnConectar.setToolTipText("Abrir la conexión a Internet");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        btnDesconectar.setBackground(new java.awt.Color(0, 0, 0));
        btnDesconectar.setForeground(new java.awt.Color(255, 255, 255));
        btnDesconectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/desconexion.png"))); // NOI18N
        btnDesconectar.setToolTipText("Cerrar la conexión a Internet");
        btnDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesconectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsuario)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnValidar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnDesconectar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnValidar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDesconectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /** Método de validación del usuario para acceso a la aplicación
     */
    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed
        String usuario = txtUsuario.getText();
               
        char[] cadenaPassword=txtPassword.getPassword();
        String password=new String(cadenaPassword);
        
        
        if (usuario.equals("admin") && (password.equals("geminis-33")))
        {
          this.btnConectar.setEnabled(true);
          this.btnDesconectar.setEnabled(true);
        }
        else {
          JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta","Atención",JOptionPane.ERROR_MESSAGE ,null);  
        }
    }//GEN-LAST:event_btnValidarActionPerformed
    /**Método del botón para realizar la conexión de Internet
     */
    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        String selector = "./si";
        String comando, red="";
        SubRed sr = new SubRed();
        try {
            red = sr.getSubred();
            
        } 
        catch (UnknownHostException ex) {
            Logger.getLogger(AppInternet.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (compruebaAula(red)) {
            
            Aula au = new Aula();
            String aula = au.getAula(red);
            comando = selector + aula;
            ConexionSSH ssh = new ConexionSSH();
            try {
                ssh.ejecutarComando(comando);
            } catch (Exception ex) {}
            JOptionPane.showMessageDialog(null, "En breves instantes podrá acceder a internet","Conexión solicitada",JOptionPane.INFORMATION_MESSAGE ,null);    
        }    
        else {
            JOptionPane.showMessageDialog(null, "Red no configurada para acceder a Internet","Atención",JOptionPane.ERROR_MESSAGE ,null);
        }
        
    }//GEN-LAST:event_btnConectarActionPerformed
    /** Método para realizar la desconexión de Internet 
     */
    private void btnDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesconectarActionPerformed
        String  selector = "./no";
        String comando, red="";
        SubRed sr = new SubRed();
        try {
            red = sr.getSubred();
            
        } 
        catch (UnknownHostException ex) {
            Logger.getLogger(AppInternet.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (compruebaAula(red)) {
            
            Aula au = new Aula();
            String aula = au.getAula(red);
            comando = selector + aula;
            ConexionSSH ssh = new ConexionSSH();
            try {
                ssh.ejecutarComando(comando);
            } catch (Exception ex) {}
            JOptionPane.showMessageDialog(null, "En breves instantes no podrá acceder a internet","Desconexión solicitada",JOptionPane.INFORMATION_MESSAGE ,null);    
        }    
        else {
            JOptionPane.showMessageDialog(null, "Red no configurada para acceder a Internet","Atención",JOptionPane.ERROR_MESSAGE ,null);
        } 
    }//GEN-LAST:event_btnDesconectarActionPerformed
    /**
     * Comprueba desde que aula se realiza la conexión
     * @param red red: tercer byte de la dirección IP del aula
    */
    private boolean compruebaAula(String red) {
       boolean estado = false; 
       String[] aulaValidas = {"6","19","9","11","36","7","12","35","22","23","4","13","1"};
       for (int i = 0; i<aulaValidas.length; i++) {
            if (red.equals(aulaValidas[i])) estado = true;
        }  
       return estado;
   }
   
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
            java.util.logging.Logger.getLogger(AppInternet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppInternet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppInternet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppInternet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppInternet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnDesconectar;
    private javax.swing.JButton btnValidar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
