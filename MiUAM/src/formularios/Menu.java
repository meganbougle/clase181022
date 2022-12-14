/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;


import javax.swing.JOptionPane;
import miuam.MiUAM;

/**
 *
 * @author labc205
 */
public class Menu extends javax.swing.JFrame {
    private dao.Usuario lista = new dao.Usuario();
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
       this.setExtendedState(Menu.MAXIMIZED_BOTH);
    }
    
    public Menu(dao.Usuario user){
        initComponents();
       this.setExtendedState(Menu.MAXIMIZED_BOTH);
        this.lista = user;
        
        this.mostrarCantReg();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMiEscritorio = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        jLblCantR = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuCerrarS = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuUsuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mi UAM");
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        jMiEscritorio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jMiEscritorioMouseMoved(evt);
            }
        });
        jMiEscritorio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jMiEscritorioFocusGained(evt);
            }
        });

        jToolBar1.setRollover(true);

        jLblCantR.setText("Cantidad de Registros en Usuarios: 0");
        jToolBar1.add(jLblCantR);

        jMiEscritorio.setLayer(jToolBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jMiEscritorioLayout = new javax.swing.GroupLayout(jMiEscritorio);
        jMiEscritorio.setLayout(jMiEscritorioLayout);
        jMiEscritorioLayout.setHorizontalGroup(
            jMiEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMiEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jMiEscritorioLayout.setVerticalGroup(
            jMiEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMiEscritorioLayout.createSequentialGroup()
                .addContainerGap(258, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Archivo");

        mnuCerrarS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuCerrarS.setText("Cerrar Sesi??n");
        mnuCerrarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCerrarSActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCerrarS);

        mnuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Formularios");

        mnuUsuarios.setText("Usuarios");
        mnuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUsuariosActionPerformed(evt);
            }
        });
        jMenu2.add(mnuUsuarios);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMiEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMiEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCerrarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCerrarSActionPerformed
        // TODO add your handling code here:
       // JOptionPane.showMessageDialog(this, "Cerrar Sesion");
      MiUAM uam = new MiUAM();
      uam.llenarUsuaios();
      dispose();
    }//GEN-LAST:event_mnuCerrarSActionPerformed

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(this, "Salir");
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUsuariosActionPerformed
        // TODO add your handling code here:
        Usuarios user = new Usuarios(lista);
       // user.setLista(lista);
        this.jMiEscritorio.add(user);
        user.setVisible(true);
    }//GEN-LAST:event_mnuUsuariosActionPerformed

    private void jMiEscritorioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jMiEscritorioFocusGained
        // TODO add your handling code here:
        //mostrarCantReg();
    }//GEN-LAST:event_jMiEscritorioFocusGained

    private void jMiEscritorioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMiEscritorioMouseMoved
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMiEscritorioMouseMoved

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
        mostrarCantReg();
    }//GEN-LAST:event_formMouseMoved

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLblCantR;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jMiEscritorio;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mnuCerrarS;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenuItem mnuUsuarios;
    // End of variables declaration//GEN-END:variables

    public dao.Usuario getLista() {
        return lista;
    }

    public void setLista(dao.Usuario lista) {
        this.lista = lista;
    }

    public void mostrarCantReg(){
        jLblCantR.setText("Cantidad de registros"
        + "en Usuario: "+
                lista.getLista().size());
    }
}
