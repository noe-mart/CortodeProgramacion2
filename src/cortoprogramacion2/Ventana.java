/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cortoprogramacion2;

/**
 *
 * @author Noé
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        txtNombre.requestFocus();
        transparentes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGroup = new javax.swing.ButtonGroup();
        lblNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        rbtnAgregar = new javax.swing.JRadioButton();
        rbtnBuscar = new javax.swing.JRadioButton();
        rbtnEditar = new javax.swing.JRadioButton();
        rbtnEliminar = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEstudiantes = new javax.swing.JList<>();
        lblResultado = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnAccion = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre.setText("Nombre:");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Apellido");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 290, 30));

        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 290, 30));

        bGroup.add(rbtnAgregar);
        rbtnAgregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnAgregar.setText("Agregar");
        rbtnAgregar.setBorder(null);
        rbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, 30));

        bGroup.add(rbtnBuscar);
        rbtnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnBuscar.setText("Buscar");
        rbtnBuscar.setBorder(null);
        getContentPane().add(rbtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, 30));

        bGroup.add(rbtnEditar);
        rbtnEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnEditar.setText("Editar");
        rbtnEditar.setBorder(null);
        getContentPane().add(rbtnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, 30));

        bGroup.add(rbtnEliminar);
        rbtnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnEliminar.setText("Eliminar");
        rbtnEliminar.setBorder(null);
        getContentPane().add(rbtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, -1, 30));

        jScrollPane1.setViewportView(lstEstudiantes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 480, 190));
        getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 180, 20));

        btnCerrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        btnAccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAccion.setText("Acción");
        getContentPane().add(btnAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo2.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnAgregarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    
    public void transparentes(){
        this.rbtnAgregar.setOpaque(false);
        this.rbtnBuscar.setOpaque(false);
        this.rbtnEditar.setOpaque(false);
        this.rbtnEliminar.setOpaque(false);
    }
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGroup;
    private javax.swing.JButton btnAccion;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JList<String> lstEstudiantes;
    private javax.swing.JRadioButton rbtnAgregar;
    private javax.swing.JRadioButton rbtnBuscar;
    private javax.swing.JRadioButton rbtnEditar;
    private javax.swing.JRadioButton rbtnEliminar;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
