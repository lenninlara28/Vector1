/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author hp 14
 */

public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    
    double v[];
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLongitud = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmbCrear = new javax.swing.JButton();
        cmbManual = new javax.swing.JButton();
        cmbAutomatico = new javax.swing.JButton();
        cmbMostrar = new javax.swing.JButton();
        cmbBorrar = new javax.swing.JButton();
        cmbOperacion = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("VECTOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Longitud"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Longitud");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        txtLongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLongitudKeyTyped(evt);
            }
        });
        jPanel2.add(txtLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 80, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 190, 80));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbCrear.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmbCrear.setText("Crear");
        cmbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmbCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        cmbManual.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmbManual.setText("Llenar Manual");
        cmbManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbManualActionPerformed(evt);
            }
        });
        jPanel3.add(cmbManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        cmbAutomatico.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmbAutomatico.setText("Llenar Automatico");
        cmbAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAutomaticoActionPerformed(evt);
            }
        });
        jPanel3.add(cmbAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 90, -1, -1));

        cmbMostrar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmbMostrar.setText("Mostrar");
        cmbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMostrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmbMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        cmbBorrar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmbBorrar.setText("Borrar");
        cmbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBorrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        cmbOperacion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sumatoria", "Productoria", "Mayor Elemento", "Menor Elemento" }));
        jPanel3.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 130, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 150, 230));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, 140));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 190, 210));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void cmbCrearActionPerformed(java.awt.event.ActionEvent evt) {                                         
       int longitud;
        if(txtLongitud.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this,"Digite La Longitud","Error",JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
        }else if (Integer.parseInt(txtLongitud.getText().trim())==0) {
            JOptionPane.showMessageDialog(this, "La longitud no puede ser cero", "Error", JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
             txtLongitud.selectAll();}
        else{
            longitud=Integer.parseInt(txtLongitud.getText().trim());
            v=new double[longitud];
            JOptionPane.showMessageDialog(this, "Vector Creado Exitosamente");
        }
        
    }                                        

    private void txtLongitudKeyTyped(java.awt.event.KeyEvent evt) {                                     
        char c=evt.getKeyChar();
         
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();}
                
        
    }                                    

    private void cmbManualActionPerformed(java.awt.event.ActionEvent evt) {                                          
            double n;
        for (int i=0;i<v.length;i++){
            n= Double.parseDouble(JOptionPane.showInputDialog(this, "Digite el Elemento EN La Posicion "+i));
            v[i]=n;
        }
        JOptionPane.showMessageDialog(this, "Vector Creado Exitosamente");
        
    }                                         

    private void cmbAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {                                              
        double n;
        for (int i = 0; i < v.length; i++) {
         n= (int) (Math.random()*50+1);
            v[i]=n;
        }
        for (int i = 0; i < v.length; i++) {
                    txtResultado.append(v[i]+" \n ");
                }
        JOptionPane.showMessageDialog(this, "Vector Creado Exitosamente");
    }                                             

    private void cmbMostrarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String acumu,productoria,mayori,menori;
        double acum=0,mayor=0,menor=0;
        int prod=1;
        int op;
        op= cmbOperacion.getSelectedIndex();
        switch (op){
            case 0:
                for (int i = 0; i < v.length; i++) {
                    acum=acum+v[i];}
                    acumu=String.valueOf(acum);
                    txtResultado.append(acumu+"\n");
                    break;
            case 1:
                for (int i=0;i<v.length;i++){
                prod= (int) (prod*v[i]);}
                productoria=String.valueOf(prod);
                txtResultado.append(productoria+"\n");
                break;
            case 2:
                for(int i=0; i<v.length; i++){
                    if( i==0){
                    mayor= v[0];
                    menor= v[0];}
                    else if(v[i] > mayor){
                            mayor= v[i];}
                }
                mayori=String.valueOf(mayor);
                txtResultado.append(mayori+"\n");
                break;
            case 3:
                for(int i=0; i<v.length; i++){
                    if( i==0){
                    mayor= v[0];
                    menor= v[0];}
                    else if (v[i] > menor){
                            menor= v[i];}
                menori=String.valueOf(menor);
                txtResultado.append(menori+"\n");
                break;
                }              
        }
           
    }                                          

    private void cmbBorrarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        txtLongitud.setText("");
        txtResultado.setText("");
        v=null;
        txtLongitud.requestFocusInWindow();
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton cmbAutomatico;
    private javax.swing.JButton cmbBorrar;
    private javax.swing.JButton cmbCrear;
    private javax.swing.JButton cmbManual;
    private javax.swing.JButton cmbMostrar;
    private javax.swing.JComboBox<String> cmbOperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration                   
}
