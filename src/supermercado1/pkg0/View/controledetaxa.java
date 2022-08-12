/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado1.pkg0.View;

import javax.swing.table.DefaultTableModel;
import supermercado1.pkg0.Controller.Message;
import supermercado1.pkg0.Controller.getImageBack;
import supermercado1.pkg0.Model.DAO.taxaDAO;

/**
 *
 * @author gildo
 */
public class controledetaxa extends javax.swing.JFrame {

    /**
     * Creates new form controledetaxa
     */
    public controledetaxa() {
        initComponents();
        setIconImage(new getImageBack().getImage());
        new taxaDAO().getTaxa(table);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        rSButton10 = new rojeru_san.RSButton();
        rSButton7 = new rojeru_san.RSButton();
        rSButton5 = new rojeru_san.RSButton();
        jPanel9 = new javax.swing.JPanel();
        pesq = new rojeru_san.RSMTextFull();
        jLabel1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de Taxa");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rSButton10.setBackground(new java.awt.Color(255, 255, 255));
        rSButton10.setBorder(null);
        rSButton10.setForeground(new java.awt.Color(0, 0, 0));
        rSButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/add_48px.png"))); // NOI18N
        rSButton10.setText("Adicionar nova");
        rSButton10.setColorHover(new java.awt.Color(204, 204, 204));
        rSButton10.setColorText(new java.awt.Color(0, 0, 0));
        rSButton10.setColorTextHover(new java.awt.Color(255, 255, 250));
        rSButton10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton10ActionPerformed(evt);
            }
        });

        rSButton7.setBackground(new java.awt.Color(255, 255, 255));
        rSButton7.setBorder(null);
        rSButton7.setForeground(new java.awt.Color(0, 0, 0));
        rSButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/edit_property_48px.png"))); // NOI18N
        rSButton7.setText("Editar taxa");
        rSButton7.setColorHover(new java.awt.Color(204, 204, 204));
        rSButton7.setColorText(new java.awt.Color(0, 0, 0));
        rSButton7.setColorTextHover(new java.awt.Color(255, 255, 250));
        rSButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton7ActionPerformed(evt);
            }
        });

        rSButton5.setBackground(new java.awt.Color(255, 255, 255));
        rSButton5.setBorder(null);
        rSButton5.setForeground(new java.awt.Color(0, 0, 0));
        rSButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/delete.png"))); // NOI18N
        rSButton5.setText("Apagar taxa");
        rSButton5.setColorHover(new java.awt.Color(204, 204, 204));
        rSButton5.setColorText(new java.awt.Color(0, 0, 0));
        rSButton5.setColorTextHover(new java.awt.Color(255, 255, 250));
        rSButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rSButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pesq.setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        pesq.setForeground(new java.awt.Color(0, 0, 0));
        pesq.setToolTipText("pesquisar taxa...");
        pesq.setBordeColorFocus(new java.awt.Color(204, 204, 204));
        pesq.setBordeColorNoFocus(new java.awt.Color(204, 204, 0));
        pesq.setBotonColor(new java.awt.Color(255, 0, 0));
        pesq.setFont(new java.awt.Font("Roboto Bold", 0, 18)); // NOI18N
        pesq.setPlaceholder("pesquisar taxa pelo nome ou id...");
        pesq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesqKeyReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/search_48px.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesq, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        table.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Taxa", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setFillsViewportHeight(true);
        table.setGridColor(new java.awt.Color(255, 204, 153));
        table.setRowHeight(40);
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rSButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton10ActionPerformed
        // TODO add your handling code here:
        new novataxa(table).setVisible(true);
    }//GEN-LAST:event_rSButton10ActionPerformed

    private void rSButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton7ActionPerformed
        int linha=table.getSelectedRow();
        if(table.isRowSelected(linha))
        {
            int ID=(int)table.getValueAt(linha, 0);
            String nome=(String)table.getValueAt(linha, 1);
            double taxa=(double) table.getValueAt(linha, 2);
            boolean status=(boolean) table.getValueAt(linha, 3);
            new novataxa(table, ID, nome,taxa,status).setVisible(true);
        }else
        {
            new Message().messageAlerta("Selecione a linha que deseja editar");
        }
    }//GEN-LAST:event_rSButton7ActionPerformed

    private void rSButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton5ActionPerformed
        int linha=table.getSelectedRow();
        if(table.isRowSelected(table.getSelectedRow()))
        {
            int ID=(int)table.getValueAt(linha, 0);
            new taxaDAO().deleteTaxa(ID);
            new Message().messageSucesso("Taxa eliminado com sucesso!!");
            DefaultTableModel dt= (DefaultTableModel) table.getModel();
            dt.removeRow(linha);
        }else
        {
            new Message().messageAlerta("Selecione a linha que deseja apagar");
        }
    }//GEN-LAST:event_rSButton5ActionPerformed

    private void pesqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesqKeyReleased
        if(pesq.getText().trim().isEmpty()){ new taxaDAO().getTaxa(table, pesq.getText());}
        else
        {
            new taxaDAO().getTaxa(table, pesq.getText());
        }
    }//GEN-LAST:event_pesqKeyReleased

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
            java.util.logging.Logger.getLogger(controledetaxa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(controledetaxa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(controledetaxa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(controledetaxa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new controledetaxa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private rojeru_san.RSMTextFull pesq;
    private rojeru_san.RSButton rSButton10;
    private rojeru_san.RSButton rSButton5;
    private rojeru_san.RSButton rSButton7;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
