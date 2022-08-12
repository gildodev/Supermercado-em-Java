/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado1.pkg0.View;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import supermercado1.pkg0.Controller.Message;
import supermercado1.pkg0.Controller.getImageBack;
import supermercado1.pkg0.Model.Bean.marcaBean;
import supermercado1.pkg0.Model.DAO.marcaDAO;

/**
 *
 * @author gildo
 */
public class novamarca extends javax.swing.JFrame {

    /**
     * Creates new form novamarca
     */
    private String situacao="SALVAR";
    private JComboBox listamarca;
    private final JTable table;
    private marcaBean mb=null;
    
    public novamarca() {
        initComponents();
        setIconImage(new getImageBack().getImage());
        table=null;
    }
    
    public novamarca(JTable table,int id,String marca) 
    {
        initComponents();
        setIconImage(new getImageBack().getImage());
        this.table=table;
        mb=new marcaBean(marca, id);
        situacao="ACTUALIZAR";
    }
    public novamarca(JTable table) 
    {
        initComponents();
        setIconImage(new getImageBack().getImage());
        this.table=table;
        this.situacao="CONTROLE";
    }
    
    public novamarca(JComboBox listamarca) 
    {
        initComponents();
        this.situacao="ADD";
        setIconImage(new getImageBack().getImage());
        this.listamarca=listamarca;
        table=null;
    }
    
    public void limpo()
    {
        nome.setText("");
    }
    
    public void addCat(String text)
    {
        DefaultComboBoxModel lista=(DefaultComboBoxModel) this.listamarca.getModel();
        lista.addElement(text);
    }
    
    public void novaMarca()
    {
        if(nome.getText().trim().isEmpty())
        {
            new Message().messageError("Preencha o campo em branco!");
        }else
        {
            mb=new marcaBean();
            mb.setNome(nome.getText());
            marcaDAO cd=new marcaDAO();
            if(cd.novaMarca(mb))
            {
                new Message().messageSucesso("Marca cadastrado com sucesso!!");
            }else
            {
                new Message().messageError("Verifique se a marca não está cadastrado!");
            }
        }
    }
    
    public void updateMarca()
    {
        if(nome.getText().trim().isEmpty())
        {
            new Message().messageError("Preencha o campo em branco!");
        }else
        {
            mb.setNome(nome.getText());
            marcaDAO cd=new marcaDAO();
            if(cd.updateMarca(mb))
            {
                new Message().messageSucesso("Marca actualizado com sucesso!!");
            }else
            {
                new Message().messageError("Verifique se a marca não está cadastrado!");
            }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nome = new rojerusan.RSMetroTextPlaceHolder();
        rSButton1 = new rojeru_san.RSButton();
        rSButton2 = new rojeru_san.RSButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Marca");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Marca:");

        nome.setBackground(new java.awt.Color(255, 204, 102));
        nome.setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        nome.setForeground(new java.awt.Color(0, 0, 0));
        nome.setToolTipText("categoria...");
        nome.setBotonColor(new java.awt.Color(255, 0, 0));
        nome.setPhColor(new java.awt.Color(0, 0, 0));
        nome.setPlaceholder("Escrever marca...");
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        rSButton1.setBackground(new java.awt.Color(153, 153, 153));
        rSButton1.setForeground(new java.awt.Color(0, 0, 0));
        rSButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cancel_48px.png"))); // NOI18N
        rSButton1.setText("CANCELAR");
        rSButton1.setColorHover(new java.awt.Color(255, 0, 0));
        rSButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton1ActionPerformed(evt);
            }
        });

        rSButton2.setBackground(new java.awt.Color(0, 153, 0));
        rSButton2.setForeground(new java.awt.Color(0, 0, 0));
        rSButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/save.png"))); // NOI18N
        rSButton2.setText("SALVAR");
        rSButton2.setToolTipText("Confirmar...");
        rSButton2.setColorHover(new java.awt.Color(51, 255, 0));
        rSButton2.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        rSButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        rSButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(rSButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(rSButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed

        if(situacao.equals("ADD"))
        {
            novaMarca();addCat(nome.getText());
            dispose();
        }else if(situacao.equals("SALVAR"))
        {
            novaMarca();
        }else if(situacao.equals("CONTROLE"))
        {
           novaMarca();new marcaDAO().getMarca(table);
           dispose();
        }else{
            updateMarca();dispose();
        }
        limpo();
       
    }//GEN-LAST:event_nomeActionPerformed

    private void rSButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton2ActionPerformed
        if(situacao.equals("ADD"))
        {
            novaMarca();addCat(nome.getText());
            dispose();
        }else if(situacao.equals("SALVAR"))
        {
            novaMarca();
        }else if(situacao.equals("CONTROLE"))
        {
           novaMarca();new marcaDAO().getMarca(table);
           dispose();
        }else{
            updateMarca();dispose();
        }
        limpo();
        
    }//GEN-LAST:event_rSButton2ActionPerformed

    private void rSButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(novamarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(novamarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(novamarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(novamarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new novamarca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private rojerusan.RSMetroTextPlaceHolder nome;
    private rojeru_san.RSButton rSButton1;
    private rojeru_san.RSButton rSButton2;
    // End of variables declaration//GEN-END:variables
}
