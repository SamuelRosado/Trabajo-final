/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;
import java.sql.Connection;
import java.sql.Statement;
import dbconecciones.dbconection;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author rosad
 */
public class UsersRegisters extends javax.swing.JFrame {

    dbconection conex = new dbconection();      //Instanciando coneccion de la base de datos
    
    //Declarando elementos necesarios para la coneccion.
    Connection conected;
    DefaultTableModel model;
    Statement state;
    ResultSet rset;
    int  hi;
    
   
    
    public UsersRegisters() {
        initComponents();
        setLocationRelativeTo(null);        //Para que la ventana al ejecutarse permaneza en el centro de la pantalla.
        Mostrarentabla();               //Metodo para mostrar en la tabla los registros de la base de datos
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userstable = new javax.swing.JTable();
        btnlogout = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "usuarios", "clave", "conclave", "nombre", "apellido", "numero_telefono", "email"
            }
        ));
        jScrollPane2.setViewportView(userstable);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 690, 250));

        btnlogout.setBackground(new java.awt.Color(153, 255, 204));
        btnlogout.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cerrar-sesion.png"))); // NOI18N
        btnlogout.setBorder(null);
        btnlogout.setBorderPainted(false);
        btnlogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogout.setName(""); // NOI18N
        btnlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnlogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnlogoutMouseExited(evt);
            }
        });
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 40, 40));

        btnDelete.setBackground(new java.awt.Color(153, 255, 204));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/eliminar.png"))); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.setBorder(null);
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 110, 30));

        btnUpdate.setBackground(new java.awt.Color(153, 255, 204));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Actualizar.png"))); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.setBorder(null);
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 110, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/asd (1).png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 320, 170));

        btnback.setBackground(new java.awt.Color(153, 255, 204));
        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/atras.png"))); // NOI18N
        btnback.setBorder(null);
        btnback.setBorderPainted(false);
        btnback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel2.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        //Boton para cerrar sesion
    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        
        loginform logform = new loginform();
       
        if(JOptionPane.showConfirmDialog(null, "¿Estas seguro que quieres cerrar sesion?", "Confirmacion", JOptionPane.YES_NO_OPTION)==0){
            this.dispose();  //Cerrar formulario actual
            logform.setVisible(true);    //Llamar formulario del login (loginform)
        }
    }//GEN-LAST:event_btnlogoutActionPerformed
    //Boton para actualizar o editar usuarios
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        update(); //Metodo actualizar o editar
    }//GEN-LAST:event_btnUpdateActionPerformed
    //Boton para eliminar usuarios
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        delete(); //Metodo para eliminar usuarios
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        btnDelete.setForeground(Color.blue);
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        btnDelete.setForeground(Color.black);
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnlogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMouseEntered
        btnlogout.setForeground(Color.blue);
    }//GEN-LAST:event_btnlogoutMouseEntered

    private void btnlogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMouseExited
        btnlogout.setForeground(Color.black);
    }//GEN-LAST:event_btnlogoutMouseExited

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        btnUpdate.setForeground(Color.blue);
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        btnUpdate.setForeground(Color.black);
    }//GEN-LAST:event_btnUpdateMouseExited
        //Boton para volver atras, al formulario principal.
    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        
        this.dispose();  //Cerrar formulario actual
        PrincipalForm principalform = new PrincipalForm();
        principalform.setVisible(true);  //Llamar al formulario principal (PrincipalForm)
       
    }//GEN-LAST:event_btnbackActionPerformed
      
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
            java.util.logging.Logger.getLogger(UsersRegisters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsersRegisters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsersRegisters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsersRegisters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new UsersRegisters().setVisible(true);
            }
        });
    }
    //Metodo para mostrar en en la tabla los registros de la tabla de la base de datos
    public void Mostrarentabla(){
   
        String sql = "select * from users";  //Query para mostrar en tabla
        
        try {
            conected = conex.getconnect();
            state = conected.createStatement();
            rset = state.executeQuery(sql);     //Ejecutando query de la base de datos
            Object[] data = new Object[7];   //Declarando objeto de tipo arreglo o array.
            model = (DefaultTableModel) userstable.getModel();
            
            //Condicion para mostrar los datos de la base de datos en la tabla productos (producttable)
            while(rset.next()){
                
                             
                data [0] = rset.getString("usuarios");
                data [1] = rset.getString("clave");
                data [2] = rset.getString("conclave");
                data [3] = rset.getString("nombre");
                data [4] = rset.getString("apellido");
                data [5] = rset.getString("numero_telefono");
                data [6] = rset.getString("email");  
                model.addRow(data);
                
            }
            userstable.setModel(model);
        } catch (SQLException e) {
        }
    }
    //Metodo para eliminar registros.
    public void delete(){
        
        int row = userstable.getSelectedRow();      //Variable para el numero de filas
        String value = userstable.getValueAt(row, 0).toString();
        
        try {
            PreparedStatement delet = conected.prepareStatement("DELETE FROM users WHERE usuarios='"+value+"'");    //Query para eliminar registro de la tabla y base de datos.
            delet.executeUpdate();       //Ejecutando query de la base de datos
            showusers(0,null);          //metodo para que elimine al instante
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "No se elimino ningun registro.");
        }
       
    }
    
        //Metodo para actualizar o eliminar al instante a la hora de eliminar o actualizar un registro.
    public void showusers(int look, String after){
        
        DefaultTableModel tusers = new DefaultTableModel();
        tusers.addColumn("usuarios");
        tusers.addColumn("clave");
        tusers.addColumn("conclave");
        tusers.addColumn("nombre");
        tusers.addColumn("apellido");
        tusers.addColumn("numero_telefono");
        tusers.addColumn("email");
        userstable.setModel(tusers);
        
        String coud;
        
       if(look == 0 && after == null){
       coud = "SELECT * FROM users";
       }else{
           if(look == 1 && after != null){
           coud = "SELECT * FROM users WHERE usuarios = '"+after+"'";
           }else{
       }if(look == 2 && after != null){
           coud = "SELECT * FROM users WHERE clave = '"+after+"'";
           
       }else{
       coud = "SELECT * FROM users";
       }
    }
        
        String[] dates = new String [7];        //Declarando objeto de tipo arreglo o array.
        try {
            state = conected.createStatement();
            rset = state.executeQuery("SELECT * FROM users"); 
            
         
            while(rset.next()){
                dates[0] = rset.getString(1);
                dates[1] = rset.getString(2);
                dates[2] = rset.getString(3);
                dates[3] = rset.getString(4);
                dates[4] = rset.getString(5);
                dates[5] = rset.getString(6);
                dates[6] = rset.getString(7);
                tusers.addRow(dates);
            
            
            }
            userstable.setModel(tusers);
            
            
        } catch (SQLException e) {
        }
        
    
    }
    
    //Metodo para actualizar la tabla de la base de datos.
    public void update(){
        
        int row = userstable.getSelectedRow();        //Variable para el numero de filas
        
      //Declarando variables y asignacion posiciones
      
        String usuario = userstable.getValueAt(row, 0).toString();
        String clav = userstable.getValueAt(row, 1).toString();
        String conclav = userstable.getValueAt(row, 2).toString();
        String nomb = userstable.getValueAt(row, 3).toString();
        String apelli = userstable.getValueAt(row, 4).toString();
        String numero_telefo = userstable.getValueAt(row, 5).toString();
        String emai = userstable.getValueAt(row, 6).toString();
        
        try {
                                                                                     //Query para actualizar o editar usuarios
           PreparedStatement pstment = (PreparedStatement) conected.prepareStatement("UPDATE users SET usuarios='"+usuario+"',clave='"+clav+"',conclave='"+conclav+"',nombre='"+nomb+"',apellido='"+apelli+"',numero_telefono='"+numero_telefo+"',email='"+emai+"' WHERE usuarios = '"+usuario+"'");
           pstment.executeUpdate();     //Ejecutar query de la base de datos
           showusers(0,null);           //metodo para actualizar o eliminar al instante
           
        } catch (SQLException e) {
          JOptionPane.showMessageDialog(null, e + "No se actualizaron los datos.");  //Cuadro de dialogo
        }
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnlogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable userstable;
    // End of variables declaration//GEN-END:variables

    

    
}