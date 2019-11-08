package examen1_alessandroreyes;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
public class Examen1_AlessandroReyes extends javax.swing.JFrame {
    
    /**
     * Creates new form Examen1_AlessandroReyes
     */
    public Examen1_AlessandroReyes() {
        initComponents();
        SpinnerNumberModel nm = new SpinnerNumberModel();
        nm.setValue(1);
        nm.setMinimum(1);
        nm.setMaximum(5);
        js_puntaje.setModel(nm);
        SpinnerNumberModel nm2 = new SpinnerNumberModel();
        nm2.setValue(1);
        nm2.setMinimum(1);
        js_copias.setModel(nm2);
        SpinnerNumberModel nm3 = new SpinnerNumberModel();
        nm3.setValue(1);
        nm3.setMinimum(1);
        js_edicion.setModel(nm3);
        //-------------------------------------
        DefaultComboBoxModel modeloG = (DefaultComboBoxModel) cb_genero.getModel();
        modeloG.addElement(new Genero("Fantasía"));
        modeloG.addElement(new Genero("Romance"));
        modeloG.addElement(new Genero("Acción"));
        modeloG.addElement(new Genero("Historia"));
        cb_genero.setModel(modeloG);
        DefaultComboBoxModel modelom = (DefaultComboBoxModel) cb_mod.getModel();
        modelom.addElement(new Genero("Fantasía"));
        modelom.addElement(new Genero("Romance"));
        modelom.addElement(new Genero("Acción"));
        modelom.addElement(new Genero("Historia"));
        cb_mod.setModel(modeloG);
        //------------------------------------------------------
        p_crear.setVisible(false);
        p_fav.setVisible(false);
        p_modificar.setVisible(false);
        p_otras.setVisible(false);
        p_crear.setEnabled(false);
        p_fav.setEnabled(false);
        p_modificar.setEnabled(false);
        p_otras.setEnabled(false);
        p_crear.setEnabled(false);
        p_login.setInheritsPopupMenu(true);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tp = new javax.swing.JTabbedPane();
        p_crear = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_titulo = new javax.swing.JTextField();
        tf_autor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dc_fecha = new com.toedter.calendar.JDateChooser();
        tf_descripcion = new javax.swing.JTextField();
        js_puntaje = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        js_copias = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        js_edicion = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        cb_genero = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        tf_precio = new javax.swing.JTextField();
        btn_crearlibro = new javax.swing.JButton();
        p_modificar = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cb_mod = new javax.swing.JComboBox<>();
        p_otras = new javax.swing.JPanel();
        p_fav = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        p_login = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_contraseña = new javax.swing.JTextField();
        bt_login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Titulo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Autor");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Descripcion");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Fecha");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Puntaje");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Copias");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Edición");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Genero");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Precio");

        btn_crearlibro.setText("Crear Libro");
        btn_crearlibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crearlibroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout p_crearLayout = new javax.swing.GroupLayout(p_crear);
        p_crear.setLayout(p_crearLayout);
        p_crearLayout.setHorizontalGroup(
            p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_crearLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_crearLayout.createSequentialGroup()
                        .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addGroup(p_crearLayout.createSequentialGroup()
                                .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(tf_titulo)
                                    .addComponent(jLabel5)
                                    .addComponent(tf_descripcion)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_crearLayout.createSequentialGroup()
                                        .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_crearLayout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18))
                                            .addGroup(p_crearLayout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(26, 26, 26)))
                                        .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(js_puntaje, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                            .addComponent(js_copias))
                                        .addGap(102, 102, 102)))
                                .addGap(80, 80, 80)
                                .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel4)
                                        .addComponent(tf_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dc_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(p_crearLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(js_edicion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(77, 77, 77))))
                            .addComponent(tf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(132, Short.MAX_VALUE))
                    .addGroup(p_crearLayout.createSequentialGroup()
                        .addComponent(cb_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_crearlibro)
                        .addGap(179, 179, 179))))
        );
        p_crearLayout.setVerticalGroup(
            p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_crearLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(tf_autor))
                .addGap(30, 30, 30)
                .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dc_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(js_puntaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(js_edicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(js_copias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_crearLayout.createSequentialGroup()
                        .addComponent(cb_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_crearLayout.createSequentialGroup()
                        .addComponent(btn_crearlibro)
                        .addGap(10, 10, 10)))
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_precio, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        tp.addTab("Crear libros", p_crear);

        jLabel12.setText("Que libro desea Modificar");

        jLabel13.setText("Que desea modificar del libro");

        cb_mod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout p_modificarLayout = new javax.swing.GroupLayout(p_modificar);
        p_modificar.setLayout(p_modificarLayout);
        p_modificarLayout.setHorizontalGroup(
            p_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_modificarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(87, 87, 87)
                .addGroup(p_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_mod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        p_modificarLayout.setVerticalGroup(
            p_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_modificarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(p_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(373, Short.MAX_VALUE))
        );

        tp.addTab("Modificar libros", p_modificar);

        javax.swing.GroupLayout p_otrasLayout = new javax.swing.GroupLayout(p_otras);
        p_otras.setLayout(p_otrasLayout);
        p_otrasLayout.setHorizontalGroup(
            p_otrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 661, Short.MAX_VALUE)
        );
        p_otrasLayout.setVerticalGroup(
            p_otrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        tp.addTab("Otras acciones", p_otras);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout p_favLayout = new javax.swing.GroupLayout(p_fav);
        p_fav.setLayout(p_favLayout);
        p_favLayout.setHorizontalGroup(
            p_favLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_favLayout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        p_favLayout.setVerticalGroup(
            p_favLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_favLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        tp.addTab("Libros por genero favorito", p_fav);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Contraseña");

        bt_login.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_login.setText("Log in");
        bt_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_loginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout p_loginLayout = new javax.swing.GroupLayout(p_login);
        p_login.setLayout(p_loginLayout);
        p_loginLayout.setHorizontalGroup(
            p_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_loginLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(p_loginLayout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(p_loginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(p_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_usuario)
                    .addComponent(tf_contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_loginLayout.createSequentialGroup()
                .addContainerGap(293, Short.MAX_VALUE)
                .addComponent(bt_login)
                .addGap(297, 297, 297))
        );
        p_loginLayout.setVerticalGroup(
            p_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_loginLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(bt_login)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        tp.addTab("Log in", p_login);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(tp, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tp)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_loginMouseClicked
        boolean t = false;
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getN_usuario().equals(tf_usuario) &&
                    usuarios.get(i).getContraseña().equals(tf_contraseña)){
                t = true;
            }
        }
        if(t == false){
            p_crear.setEnabled(false);
            p_fav.setEnabled(false);
            p_modificar.setEnabled(false);
            p_otras.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrecta");
            
        }else{
            p_crear.setVisible(true);
            p_fav.setVisible(true);
            p_modificar.setVisible(true);
            p_otras.setVisible(true);
        }
    }//GEN-LAST:event_bt_loginMouseClicked

    private void btn_crearlibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crearlibroMouseClicked
        Libro l = new Libro(tf_titulo.getText(), tf_descripcion.getText(),  (Integer)js_puntaje.getValue(), 
                (Integer)js_copias.getValue(), cb_genero.getSelectedItem().toString(), 
                Integer.parseInt(tf_precio.getText()), (Integer)js_edicion.getValue(), tf_autor.getText(), 
                dc_fecha.getDate());
        l.setAutor((tf_autor.getText()));
        libros.add(l);
    }//GEN-LAST:event_btn_crearlibroMouseClicked

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
            java.util.logging.Logger.getLogger(Examen1_AlessandroReyes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Examen1_AlessandroReyes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Examen1_AlessandroReyes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Examen1_AlessandroReyes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Examen1_AlessandroReyes().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_login;
    private javax.swing.JButton btn_crearlibro;
    private javax.swing.JComboBox<String> cb_genero;
    private javax.swing.JComboBox<String> cb_mod;
    private com.toedter.calendar.JDateChooser dc_fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JSpinner js_copias;
    private javax.swing.JSpinner js_edicion;
    private javax.swing.JSpinner js_puntaje;
    private javax.swing.JPanel p_crear;
    private javax.swing.JPanel p_fav;
    private javax.swing.JPanel p_login;
    private javax.swing.JPanel p_modificar;
    private javax.swing.JPanel p_otras;
    private javax.swing.JTextField tf_autor;
    private javax.swing.JTextField tf_contraseña;
    private javax.swing.JTextField tf_descripcion;
    private javax.swing.JTextField tf_precio;
    private javax.swing.JTextField tf_titulo;
    private javax.swing.JTextField tf_usuario;
    private javax.swing.JTabbedPane tp;
    // End of variables declaration//GEN-END:variables
    ArrayList <Usuario> usuarios = new ArrayList();
    ArrayList <Libro> libros = new ArrayList();
            
}
