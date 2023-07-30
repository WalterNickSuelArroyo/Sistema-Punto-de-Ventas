
package Views;

import Library.Objetos;
import ViewModels.ClientesVM;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Sistema extends javax.swing.JFrame {

    public Sistema() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TabbedPanePrincipal = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextField_BuscarCliente = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        TabbedPaneCliente = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        LabelImage_Cliente = new javax.swing.JLabel();
        LabelCliente_Dni = new javax.swing.JLabel();
        TextFieldCliente_Dni = new javax.swing.JTextField();
        LabelCliente_Apellido = new javax.swing.JLabel();
        TextFieldCliente_Apellido = new javax.swing.JTextField();
        LabelCliente_Telefono = new javax.swing.JLabel();
        TextFieldCliente_Telefono = new javax.swing.JTextField();
        LabelCliente_Nombre = new javax.swing.JLabel();
        TextFieldCliente_Nombre = new javax.swing.JTextField();
        LabelCliente_Email = new javax.swing.JLabel();
        TextFieldCliente_Email = new javax.swing.JTextField();
        LabelCliente_Direccion = new javax.swing.JLabel();
        TextFieldCliente_Direccion = new javax.swing.JTextField();
        ButtonCliente_Agregar = new javax.swing.JButton();
        ButtonCliente_Cancelar = new javax.swing.JButton();
        CheckBoxCliente_Credito = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        ButtonCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema punto de ventas");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logo-google.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        TabbedPanePrincipal.setBackground(new java.awt.Color(255, 255, 255));
        TabbedPanePrincipal.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1651, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );

        TabbedPanePrincipal.addTab("Ventas", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(70, 106, 124));
        jLabel3.setText("Clientes");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Buscar");

        TextField_BuscarCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextField_BuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1012, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(TextField_BuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Información del cliente");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LabelImage_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/programador.png"))); // NOI18N
        LabelImage_Cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LabelImage_Cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LabelImage_Cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelImage_ClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(LabelImage_Cliente)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelImage_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );

        LabelCliente_Dni.setText("DNI");

        TextFieldCliente_Dni.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TextFieldCliente_Dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextFieldCliente_DniKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldCliente_DniKeyTyped(evt);
            }
        });

        LabelCliente_Apellido.setText("Apellido");

        TextFieldCliente_Apellido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TextFieldCliente_Apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextFieldCliente_ApellidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldCliente_ApellidoKeyTyped(evt);
            }
        });

        LabelCliente_Telefono.setText("Telefono");

        TextFieldCliente_Telefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TextFieldCliente_Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextFieldCliente_TelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldCliente_TelefonoKeyTyped(evt);
            }
        });

        LabelCliente_Nombre.setText("Nombre");

        TextFieldCliente_Nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TextFieldCliente_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextFieldCliente_NombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldCliente_NombreKeyTyped(evt);
            }
        });

        LabelCliente_Email.setText("Email");

        TextFieldCliente_Email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TextFieldCliente_Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextFieldCliente_EmailKeyReleased(evt);
            }
        });

        LabelCliente_Direccion.setText("Direccion");

        TextFieldCliente_Direccion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TextFieldCliente_Direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextFieldCliente_DireccionKeyReleased(evt);
            }
        });

        ButtonCliente_Agregar.setBackground(new java.awt.Color(153, 153, 153));
        ButtonCliente_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Agregar.png"))); // NOI18N
        ButtonCliente_Agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonCliente_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCliente_AgregarActionPerformed(evt);
            }
        });

        ButtonCliente_Cancelar.setBackground(new java.awt.Color(153, 153, 153));
        ButtonCliente_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Cancelar.png"))); // NOI18N
        ButtonCliente_Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonCliente_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCliente_CancelarActionPerformed(evt);
            }
        });

        CheckBoxCliente_Credito.setText("Credito");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonCliente_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TextFieldCliente_Dni, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                        .addComponent(TextFieldCliente_Apellido)
                        .addComponent(TextFieldCliente_Telefono)
                        .addComponent(LabelCliente_Dni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelCliente_Apellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelCliente_Telefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(CheckBoxCliente_Credito, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonCliente_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TextFieldCliente_Nombre)
                        .addComponent(TextFieldCliente_Email)
                        .addComponent(TextFieldCliente_Direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                        .addComponent(LabelCliente_Direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelCliente_Email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelCliente_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(LabelCliente_Dni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldCliente_Dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LabelCliente_Apellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldCliente_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelCliente_Telefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldCliente_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(LabelCliente_Nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldCliente_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LabelCliente_Email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldCliente_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelCliente_Direccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldCliente_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(CheckBoxCliente_Credito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonCliente_Agregar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonCliente_Cancelar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        TabbedPaneCliente.addTab("Registro de clientes", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        TabbedPaneCliente.addTab("Pagos", jPanel7);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabbedPaneCliente)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabbedPaneCliente)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        TabbedPanePrincipal.addTab("Clientes", jPanel3);

        ButtonCliente.setBackground(new java.awt.Color(153, 153, 153));
        ButtonCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/people.png"))); // NOI18N
        ButtonCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabbedPanePrincipal)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(ButtonCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(ButtonCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TabbedPanePrincipal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // <editor-fold defaultstate="collapsed" desc="CODIGO DE CLIENTE"> 
    private ClientesVM cliente;
    private void ButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClienteActionPerformed
        ArrayList<JLabel> label = new ArrayList();
        label.add(LabelCliente_Dni);
        label.add(LabelCliente_Nombre);
        label.add(LabelCliente_Apellido);
        label.add(LabelCliente_Email);
        label.add(LabelCliente_Telefono);
        label.add(LabelCliente_Direccion);
        label.add(LabelImage_Cliente);
        
        ArrayList<JTextField> textField = new ArrayList();
        textField .add(TextFieldCliente_Dni);
        textField .add(TextFieldCliente_Nombre);
        textField .add(TextFieldCliente_Apellido);
        textField .add(TextFieldCliente_Email);
        textField .add(TextFieldCliente_Telefono);
        textField .add(TextFieldCliente_Direccion);
        
        Object[] objects = {CheckBoxCliente_Credito};
        cliente = new ClientesVM(objects,label,textField);
        
        TabbedPanePrincipal.setSelectedIndex(1);
    }//GEN-LAST:event_ButtonClienteActionPerformed

    private void LabelImage_ClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelImage_ClienteMouseClicked
        Objetos.uploadimage.CargarImagen(LabelImage_Cliente);
    }//GEN-LAST:event_LabelImage_ClienteMouseClicked

    private void TextFieldCliente_DniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldCliente_DniKeyReleased
        if (TextFieldCliente_Dni.getText().equals("")) {
            LabelCliente_Dni.setForeground(new Color(102,102,102));
        } else {
            LabelCliente_Dni.setText("DNI");
            LabelCliente_Dni.setForeground(new Color(0,153,51));
        }
    }//GEN-LAST:event_TextFieldCliente_DniKeyReleased

    private void TextFieldCliente_DniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldCliente_DniKeyTyped
        Objetos.eventos.numberKeyPress(evt);
    }//GEN-LAST:event_TextFieldCliente_DniKeyTyped

    private void TextFieldCliente_NombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldCliente_NombreKeyReleased
        if (TextFieldCliente_Nombre.getText().equals("")) {
            LabelCliente_Nombre.setForeground(new Color(102,102,102));
        } else {
            LabelCliente_Nombre.setText("Nombre");
            LabelCliente_Nombre.setForeground(new Color(0,153,51));
        }
    }//GEN-LAST:event_TextFieldCliente_NombreKeyReleased

    private void TextFieldCliente_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldCliente_NombreKeyTyped
        Objetos.eventos.textKeyPress(evt);
    }//GEN-LAST:event_TextFieldCliente_NombreKeyTyped

    private void TextFieldCliente_ApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldCliente_ApellidoKeyReleased
        if (TextFieldCliente_Apellido.getText().equals("")) {
            LabelCliente_Apellido.setForeground(new Color(102,102,102));
        } else {
            LabelCliente_Apellido.setText("Apellido");
            LabelCliente_Apellido.setForeground(new Color(0,153,51));
        }
    }//GEN-LAST:event_TextFieldCliente_ApellidoKeyReleased

    private void TextFieldCliente_ApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldCliente_ApellidoKeyTyped
        Objetos.eventos.textKeyPress(evt);
    }//GEN-LAST:event_TextFieldCliente_ApellidoKeyTyped

    private void TextFieldCliente_EmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldCliente_EmailKeyReleased
        if (TextFieldCliente_Email.getText().equals("")) {
            LabelCliente_Email.setForeground(new Color(102,102,102));
        } else {
            LabelCliente_Email.setText("Email");
            LabelCliente_Email.setForeground(new Color(0,153,51));
        }
    }//GEN-LAST:event_TextFieldCliente_EmailKeyReleased

    private void TextFieldCliente_TelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldCliente_TelefonoKeyReleased
        if (TextFieldCliente_Telefono.getText().equals("")) {
            LabelCliente_Telefono.setForeground(new Color(102,102,102));
        } else {
            LabelCliente_Telefono.setText("Telefono");
            LabelCliente_Telefono.setForeground(new Color(0,153,51));
        }
    }//GEN-LAST:event_TextFieldCliente_TelefonoKeyReleased

    private void TextFieldCliente_TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldCliente_TelefonoKeyTyped
        Objetos.eventos.numberKeyPress(evt);
    }//GEN-LAST:event_TextFieldCliente_TelefonoKeyTyped

    private void TextFieldCliente_DireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldCliente_DireccionKeyReleased
        if (TextFieldCliente_Direccion.getText().equals("")) {
            LabelCliente_Direccion.setForeground(new Color(102,102,102));
        } else {
            LabelCliente_Direccion.setText("Direccion");
            LabelCliente_Direccion.setForeground(new Color(0,153,51));
        }
    }//GEN-LAST:event_TextFieldCliente_DireccionKeyReleased

    private void ButtonCliente_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCliente_AgregarActionPerformed
        cliente.RegistrarCliente();
    }//GEN-LAST:event_ButtonCliente_AgregarActionPerformed

    private void ButtonCliente_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCliente_CancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCliente_CancelarActionPerformed
    // </editor-fold> 
    
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
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCliente;
    private javax.swing.JButton ButtonCliente_Agregar;
    private javax.swing.JButton ButtonCliente_Cancelar;
    private javax.swing.JCheckBox CheckBoxCliente_Credito;
    private javax.swing.JLabel LabelCliente_Apellido;
    private javax.swing.JLabel LabelCliente_Direccion;
    private javax.swing.JLabel LabelCliente_Dni;
    private javax.swing.JLabel LabelCliente_Email;
    private javax.swing.JLabel LabelCliente_Nombre;
    private javax.swing.JLabel LabelCliente_Telefono;
    private javax.swing.JLabel LabelImage_Cliente;
    private javax.swing.JTabbedPane TabbedPaneCliente;
    private javax.swing.JTabbedPane TabbedPanePrincipal;
    private javax.swing.JTextField TextFieldCliente_Apellido;
    private javax.swing.JTextField TextFieldCliente_Direccion;
    private javax.swing.JTextField TextFieldCliente_Dni;
    private javax.swing.JTextField TextFieldCliente_Email;
    private javax.swing.JTextField TextFieldCliente_Nombre;
    private javax.swing.JTextField TextFieldCliente_Telefono;
    private javax.swing.JTextField TextField_BuscarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
