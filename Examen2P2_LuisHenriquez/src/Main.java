//Fila 3 - Asiento 8
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
//Fila 3 - Asiento 8
//Fila 3 - Asiento 8
/**
 *
 * @author h_lah
 */
public class Main extends javax.swing.JFrame {
//Fila 3 - Asiento 8
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }
//Fila 3 - Asiento 8
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_crear = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        sp_velocidad = new javax.swing.JSpinner();
        tf_marca = new javax.swing.JTextField();
        tf_modelo = new javax.swing.JTextField();
        bt_agregar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bt_crear = new javax.swing.JButton();
        bt_iniciar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cb_jugador2 = new javax.swing.JComboBox<>();
        cb_jugador1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lb_marca1 = new javax.swing.JLabel();
        lb_modelo1 = new javax.swing.JLabel();
        lb_velocidad1 = new javax.swing.JLabel();
        lb_marca2 = new javax.swing.JLabel();
        lb_modelo2 = new javax.swing.JLabel();
        lb_velocidad2 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Creación de carros");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 210, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Velocidad");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Modelo");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        sp_velocidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 200, 1));
        jPanel2.add(sp_velocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, -1));

        tf_marca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(tf_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 220, 330, -1));

        tf_modelo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(tf_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 320, 330, -1));

        bt_agregar.setText("Crear");
        bt_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarMouseClicked(evt);
            }
        });
        jPanel2.add(bt_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Marca");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        javax.swing.GroupLayout jd_crearLayout = new javax.swing.GroupLayout(jd_crear.getContentPane());
        jd_crear.getContentPane().setLayout(jd_crearLayout);
        jd_crearLayout.setHorizontalGroup(
            jd_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );
        jd_crearLayout.setVerticalGroup(
            jd_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Partida");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        bt_crear.setText("Crear carro");
        bt_crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crearMouseClicked(evt);
            }
        });
        jPanel1.add(bt_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        bt_iniciar.setText("Iniciar");
        jPanel1.add(bt_iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Jugador 2");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 90, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Jugador 1");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 90, -1));

        jPanel1.add(cb_jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 160, -1));

        jPanel1.add(cb_jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 160, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("VS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Marca");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Modelo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Velocidad");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Marca");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Modelo");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Velocidad");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, -1));

        lb_marca1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lb_marca1.setForeground(new java.awt.Color(0, 0, 0));
        lb_marca1.setText("jLabel6");
        jPanel1.add(lb_marca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        lb_modelo1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lb_modelo1.setForeground(new java.awt.Color(0, 0, 0));
        lb_modelo1.setText("jLabel7");
        jPanel1.add(lb_modelo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        lb_velocidad1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lb_velocidad1.setForeground(new java.awt.Color(0, 0, 0));
        lb_velocidad1.setText("jLabel8");
        jPanel1.add(lb_velocidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        lb_marca2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lb_marca2.setForeground(new java.awt.Color(0, 0, 0));
        lb_marca2.setText("jLabel6");
        jPanel1.add(lb_marca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        lb_modelo2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lb_modelo2.setForeground(new java.awt.Color(0, 0, 0));
        lb_modelo2.setText("jLabel7");
        jPanel1.add(lb_modelo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

        lb_velocidad2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lb_velocidad2.setForeground(new java.awt.Color(0, 0, 0));
        lb_velocidad2.setText("jLabel8");
        jPanel1.add(lb_velocidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Fila 3 - Asiento 8
    private void bt_crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crearMouseClicked
        jd_crear.pack();
        jd_crear.setLocationRelativeTo(this);
        jd_crear.setVisible(true);
    }//GEN-LAST:event_bt_crearMouseClicked
//Fila 3 - Asiento 8
    private void bt_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarMouseClicked
        String marca, modelo;
        int velocidad;
        
        if (tf_marca.getText().equals("")) {
            JOptionPane.showMessageDialog(jd_crear, "Debes ingresar una marca para crear un carro.");
        }else if(tf_modelo.getText().equals("")){
            JOptionPane.showMessageDialog(jd_crear, "Debes ingresar un modelo para crear un carro.");
        }else{
            marca = tf_marca.getText();
            modelo = tf_modelo.getText();
            velocidad = (int) sp_velocidad.getValue();
            Carro nuevoCarro = new Carro(marca, modelo, velocidad);
            
            AdministradorCarro admin = new AdministradorCarro("./Naves.rgb");
            admin.getCarros().add(nuevoCarro);
            JOptionPane.showMessageDialog(jd_crear, "Vroom vroom!");
            tf_marca.setText("");
            tf_modelo.setText("");
            sp_velocidad.setValue(0);
            
            DefaultComboBoxModel modeloCB = new DefaultComboBoxModel(admin.getCarros().toArray());
            cb_jugador1.setModel(modeloCB);
            cb_jugador2.setModel(modeloCB);
            
            admin.escribirArchivo();
            jd_crear.dispose();
        }
    }//GEN-LAST:event_bt_agregarMouseClicked
//Fila 3 - Asiento 8
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
//Fila 3 - Asiento 8
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_agregar;
    private javax.swing.JButton bt_crear;
    private javax.swing.JButton bt_iniciar;
    private javax.swing.JComboBox<String> cb_jugador1;
    private javax.swing.JComboBox<String> cb_jugador2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JDialog jd_crear;
    private javax.swing.JLabel lb_marca1;
    private javax.swing.JLabel lb_marca2;
    private javax.swing.JLabel lb_modelo1;
    private javax.swing.JLabel lb_modelo2;
    private javax.swing.JLabel lb_velocidad1;
    private javax.swing.JLabel lb_velocidad2;
    private javax.swing.JSpinner sp_velocidad;
    private javax.swing.JTextField tf_marca;
    private javax.swing.JTextField tf_modelo;
    // End of variables declaration//GEN-END:variables
//Fila 3 - Asiento 8
//Fila 3 - Asiento 8
//Fila 3 - Asiento 8    
//Fila 3 - Asiento 8    
}