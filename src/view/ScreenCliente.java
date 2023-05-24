/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Cliente;
import model.dao.ClienteDAO;
import model.dao.UsuarioLoginDao;


/**
 *
 * @author artur
 */
public class ScreenCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form ScreenFornecedor2
     */
    public ScreenCliente() {
        initComponents();
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        jTable1.setRowSorter(new TableRowSorter(modelo));

        readJTable();
    }
    
    public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        ClienteDAO cdao = new ClienteDAO();

        for (Cliente c : cdao.read()) {

            modelo.addRow(new Object[]{
                c.getIdcliente(),
                c.getNome(),
                c.getSobrenome(),
                c.getCpf_cnpj()
            });

        }

    }
    
    public void readJTableNome(String nome) {
        
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        ClienteDAO cdao = new ClienteDAO();

        for (Cliente c : cdao.readNome(nome)) {

            modelo.addRow(new Object[]{
                c.getIdcliente(),
                c.getNome(),
                c.getSobrenome(),
                c.getCpf_cnpj()
            });

        }

    }
    
    public void readJTableSobrenome(String sobrenome) {
        
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        ClienteDAO cdao = new ClienteDAO();

        for (Cliente c : cdao.readSobrenome(sobrenome)) {

            modelo.addRow(new Object[]{
                c.getIdcliente(),
                c.getNome(),
                c.getSobrenome(),
                c.getCpf_cnpj()
            });

        }

    }
    
    public void readJTableCPF_CNPJ(String cpf_cnpj) {
        
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        ClienteDAO cdao = new ClienteDAO();

        for (Cliente c : cdao.readCPF_CNPJ(cpf_cnpj)) {

            modelo.addRow(new Object[]{
                c.getIdcliente(),
                c.getNome(),
                c.getSobrenome(),
                c.getCpf_cnpj()
            });

        }

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/background_fornecedor.png"));
        Image image = icon.getImage();
        jPanel1 = new javax.swing.JPanel(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        ComboEstado = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtCPF_CNPJ = new javax.swing.JTextField();
        txtSobrenome = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCep = new javax.swing.JFormattedTextField();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("Cliente");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setLayout(null);

        jInternalFrame2.setClosable(true);
        jInternalFrame2.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrame2.setVisible(false);
        jInternalFrame2.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                jInternalFrame2InternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        jInternalFrame2.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nome");
        jInternalFrame2.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 50, -1, -1));

        jLabel4.setText("CPF / CNPJ");
        jInternalFrame2.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 100, -1, -1));
        jInternalFrame2.getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 71, 264, -1));
        jInternalFrame2.getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 181, 110, -1));
        jInternalFrame2.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 100, -1, -1));

        jLabel6.setText("Sobrenome");
        jInternalFrame2.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        jLabel7.setText("Endereço ");
        jInternalFrame2.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 158, -1, -1));
        jInternalFrame2.getContentPane().add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 181, 423, -1));

        jLabel8.setText("Numero");
        jInternalFrame2.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 158, -1, -1));
        jInternalFrame2.getContentPane().add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 249, -1));

        jLabel9.setText("Bairro ");
        jInternalFrame2.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 216, -1, -1));
        jInternalFrame2.getContentPane().add(txtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 239, 240, -1));

        jLabel10.setText("Complemento");
        jInternalFrame2.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 216, 85, -1));
        jInternalFrame2.getContentPane().add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 239, 293, -1));

        jLabel11.setText("Estado ");
        jInternalFrame2.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 50, -1));

        jLabel12.setText("Cidade");
        jInternalFrame2.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 268, 85, 22));

        jLabel13.setText("CEP ");
        jInternalFrame2.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 271, 43, -1));
        jInternalFrame2.getContentPane().add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 297, 210, -1));

        ComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        ComboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboEstadoActionPerformed(evt);
            }
        });
        jInternalFrame2.getContentPane().add(ComboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 297, -1, -1));

        jButton1.setText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jInternalFrame2.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        jButton3.setText("Salvar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jInternalFrame2.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));
        jInternalFrame2.getContentPane().add(txtCPF_CNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 123, 260, -1));
        jInternalFrame2.getContentPane().add(txtSobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 249, -1));

        jLabel14.setText("Telefone");
        jInternalFrame2.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jInternalFrame2.getContentPane().add(txtCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 160, -1));

        jPanel1.add(jInternalFrame2);
        jInternalFrame2.setBounds(270, 40, 660, 410);

        jTextField1.setBackground(new java.awt.Color(110, 105, 212));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setToolTipText("");
        jTextField1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField1InputMethodTextChanged(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(80, 150, 870, 60);

        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(660, 550, 290, 70);

        jButton5.setText("Remover");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(370, 550, 270, 70);

        jButton6.setText("Adicionar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(80, 550, 270, 70);

        jTable1.setBackground(new java.awt.Color(110, 105, 212));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Interno", "Nome", "Sobrenome", "CPF/CNPJ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCellSelectionEnabled(true);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(80, 220, 870, 310);

        jPanel3.setBackground(new java.awt.Color(23, 23, 23));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Sobrenome");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("CPF/CNPJ");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("Nome");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(590, 120, 360, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1095, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jTable1.getSelectedRow() != -1) {

            
            int valueID  = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
            
            ClienteDAO cdao = new ClienteDAO();

            for (Cliente c : cdao.readonylID(valueID)) {

                    
                    
                    txtNome.setText(c.getNome());
                    txtSobrenome.setText(c.getSobrenome());
                    txtCPF_CNPJ.setText(c.getCpf_cnpj());
                    txtTelefone.setText(c.getTelefone());
                    txtEndereco.setText(c.getEndereco());
                    txtNumero.setText(c.getNumero());
                    txtBairro.setText(c.getBairro());
                    txtComplemento.setText(c.getComplemento());
                    txtCidade.setText(c.getCidade());
                    ComboEstado.setSelectedItem(c.getEstado());
                    txtCep.setText(c.getCep());
                    

            }
            
            
            
            
            jInternalFrame2.setTitle("Editar - Cliente"); 
        
            jInternalFrame2.setVisible(true);
            jButton6.setEnabled(false);
            jButton5.setEnabled(false);
            jButton2.setEnabled(false);
            //readJTable();

        }else{
            JOptionPane.showMessageDialog(null, "Selecione um cliente que deseja editar");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        ScreenMenu.isInternalFrameOpen = false;     
    }//GEN-LAST:event_formInternalFrameClosing

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setEnabled(false);
        jButton5.setEnabled(false);
        jButton2.setEnabled(false);
        jInternalFrame2.setTitle("Adicionar - Cliente"); 
        txtNome.setText("");
        txtSobrenome.setText("");
        txtCPF_CNPJ.setText("");
        txtTelefone.setText("");
        txtEndereco.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        txtComplemento.setText("");
        txtCidade.setText("");
        ComboEstado.setSelectedItem("PI");
        txtCep.setText("");
        
        jInternalFrame2.setVisible(true);
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField1InputMethodTextChanged
        //PCB NOVAS TECNICAS 
    }//GEN-LAST:event_jTextField1InputMethodTextChanged

    private void ComboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboEstadoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    if(jInternalFrame2.getTitle().equalsIgnoreCase("Adicionar - Cliente")){
            System.out.println("TESTE 31");
            Cliente c = new Cliente();
            System.out.println("TESTE 32");
            ClienteDAO dao = new ClienteDAO();
            System.out.println("TESTE 33");
            if(txtNome.getText().isEmpty() || txtSobrenome.getText().isEmpty() || txtCPF_CNPJ.getText().isEmpty() || txtEndereco.getText().isEmpty() || txtNumero.getText().isEmpty()
            || txtBairro.getText().isEmpty() || txtCidade.getText().isEmpty() || txtCep.getText().equalsIgnoreCase("     -   ")){
                
                JOptionPane.showMessageDialog(null, "Campos Obrigatorios não preenchidos");
                System.out.println("TESTE");
                
            }else{
                System.out.println("TESTE 1");
                c.setNome(txtNome.getText());
                c.setSobrenome(txtSobrenome.getText());
                c.setCpf_cnpj(txtCPF_CNPJ.getText());
                c.setTelefone(txtTelefone.getText());
                c.setEndereco(txtEndereco.getText());
                c.setNumero(txtNumero.getText());
                c.setBairro(txtBairro.getText());
                c.setComplemento(txtComplemento.getText());
                c.setCidade(txtCidade.getText());
                c.setEstado(String.valueOf(ComboEstado.getSelectedItem()));
                c.setCep(txtCep.getText());
                System.out.println("TESTE2");
                dao.create(c);
                System.out.println("TESTE 3");

                txtNome.setText("");
                txtSobrenome.setText("");
                txtCPF_CNPJ.setText("");
                txtTelefone.setText("");
                txtEndereco.setText("");
                txtNumero.setText("");
                txtBairro.setText("");
                txtComplemento.setText("");
                txtCidade.setText("");
                ComboEstado.setSelectedItem("PI");
                txtCep.setText("");

                readJTable();
                
            
            }
        
        }
        
        if(jInternalFrame2.getTitle().equalsIgnoreCase("Editar - Cliente")){
            if(txtNome.getText().isEmpty() || txtSobrenome.getText().isEmpty() || txtCPF_CNPJ.getText().isEmpty() || txtEndereco.getText().isEmpty() || txtNumero.getText().isEmpty()
            || txtBairro.getText().isEmpty() || txtCidade.getText().isEmpty() || txtCep.getText().equalsIgnoreCase("     -   ")){
                
                JOptionPane.showMessageDialog(null, "Campos Obrigatorios não preenchidos");
                
            }else{
                int valueID  = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 0);

                Cliente c = new Cliente();
                ClienteDAO dao = new ClienteDAO();

                



                c.setNome(txtNome.getText());
                c.setSobrenome(txtSobrenome.getText());
                c.setCpf_cnpj(txtCPF_CNPJ.getText());
                c.setTelefone(txtTelefone.getText());
                c.setEndereco(txtEndereco.getText());
                c.setNumero(txtNumero.getText());
                c.setBairro(txtBairro.getText());
                c.setComplemento(txtComplemento.getText());
                c.setCidade(txtCidade.getText());
                c.setEstado(String.valueOf(ComboEstado.getSelectedItem()));
                c.setCep(txtCep.getText());
                c.setIdcliente(valueID);
                dao.update(c);
                
                
            }

            
            
        
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton5.setEnabled(true);
        jButton2.setEnabled(true); //Botão Fechar
        jButton6.setEnabled(true);
        jInternalFrame2.setVisible(false);
        readJTable();
        jTextField1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        if (jRadioButton3.isSelected()){ //Buscar por Razão Social
        readJTableNome(jTextField1.getText());
        }
        
        if (jRadioButton2.isSelected()){ //Buscar por CNPJ
        readJTableSobrenome(jTextField1.getText());
        }
        
        
        if (jRadioButton1.isSelected()){
        readJTableCPF_CNPJ(jTextField1.getText());
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(ScreenMenu.isADM.equalsIgnoreCase("1")){
            if (jTable1.getSelectedRow() != -1) {

                Cliente c = new Cliente();
                ClienteDAO dao = new ClienteDAO();

                c.setIdcliente((int) jTable1.getValueAt(jTable1.getSelectedRow(), 0));

                String[] options = {"Sim", "Não"};

                int delete = JOptionPane.showOptionDialog(null, "Tem certeza que deseja deletar esse cliente?","Pensa bem",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

                if(delete == 0){
                    dao.delete(c); 
                }




                readJTable();

            } else {
                JOptionPane.showMessageDialog(null, "Selecione um cliente para excluir.");}
            
        }else{
            JOptionPane.showMessageDialog(null, "O usuario não tem permissão para deletar. Contate o ADM ");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jInternalFrame2InternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_jInternalFrame2InternalFrameClosing
        jButton5.setEnabled(true);
        jButton2.setEnabled(true); //Botão Fechar
        jButton6.setEnabled(true);
        
        readJTable();
        jTextField1.setText("");
    }//GEN-LAST:event_jInternalFrame2InternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboEstado;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCPF_CNPJ;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtSobrenome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
