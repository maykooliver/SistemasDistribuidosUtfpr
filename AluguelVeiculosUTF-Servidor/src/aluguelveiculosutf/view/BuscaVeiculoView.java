/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aluguelveiculosutf.view;

import aluguelveiculosutf.servidor.ServicosServ;
import aluguelveiculosutf.servidor.Veiculo;
import aluguelveiculosutf.util.MyNumber;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author MAYKO
 */
public class BuscaVeiculoView extends javax.swing.JDialog {
    DefaultTableModel model = new DefaultTableModel();
    Integer id = -1;
    Veiculo veiculo = null;
    ServicosServ todosVeiculos = ServicosServ.getInstancia();

    /**
     * Creates new form tabela
     */
    public BuscaVeiculoView(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        carregaCabecalho();
    }

    BuscaVeiculoView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
    
    
    
    private void carregaCabecalho(){
        Vector<String> col = new Vector();
        col.add ("Id");
        col.add ("Modelo");
        col.add ("Marca");
        col.add ("Ano");
        col.add ("Valor Locação");
        model.setDataVector(null, col);
        carregaDados();
    }
    
    private void carregaDados(){
       
        
        int i = 0;
        
        for(Veiculo veiculo1 : todosVeiculos.getListaVeiculo()){
            model.addRow(new Object[]{
                i,
                veiculo1.getModelo(),
                veiculo1.getMarca(),
                veiculo1.getAno(),
                veiculo1.getValorLocacao()
                
            });
            i++;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTbUf = new javax.swing.JTable();
        confirmarConsulta = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        modeloVeiculo = new javax.swing.JTextField();
        confirmarModelo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTbUf.setModel(model);
        jScrollPane1.setViewportView(jTbUf);

        confirmarConsulta.setText("Confirmar");
        confirmarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarConsultaActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("CONSULTAR VEÍCULO:");

        modeloVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloVeiculoActionPerformed(evt);
            }
        });
        modeloVeiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                modeloVeiculoKeyReleased(evt);
            }
        });

        confirmarModelo.setText("OK");
        confirmarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarModeloActionPerformed(evt);
            }
        });

        jLabel3.setText("Modelo Veículo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(confirmarConsulta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelar))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modeloVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                        .addComponent(confirmarModelo)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modeloVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(confirmarModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarConsulta)
                    .addComponent(cancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarConsultaActionPerformed
        // TODO add your handling code here:
        if(veiculo == null){
            String msg = "É necessário buscar o veículo!";
            JOptionPane.showMessageDialog(null, msg);
        }else{
            try {
                id = MyNumber.parseInt(model.getValueAt(jTbUf.getSelectedRow(), 0));
                System.out.println(id);
                dispose();
            } catch (Exception e) {
                String msg = "Linha não selecionada!";
                JOptionPane.showMessageDialog(null, msg);
            }
        }
    }//GEN-LAST:event_confirmarConsultaActionPerformed

    public Integer getId(){
        return id;
    }
    
    
    
    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        id = 0;
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    public void Limpar() {
        modeloVeiculo.setText("");
//        jtfCpf.setValue(null);
        int contRow = model.getRowCount();
        for (int i = 0; i < contRow; i++) {
            model.removeRow(0);
        }
        //}
        //Retirar = 0;
    }
    
    private void carregaDados(String nomeVeiculo){
        if (nomeVeiculo.equals("")){
            String msg = "Digite o nome do veículo";
            JOptionPane.showMessageDialog(null, msg);
            modeloVeiculo.requestFocus();
        }else{
            Limpar();
            
            int i = 0;

            veiculo = todosVeiculos.buscarVeiculo(nomeVeiculo);


            model.addRow(new Object[]{
                i + 1,
                veiculo.getModelo(),
                veiculo.getMarca(),
                veiculo.getAno(),
                veiculo.getValorLocacao()

            });
        }
    }
    
    private void modeloVeiculoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modeloVeiculoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_modeloVeiculoKeyReleased

    private void confirmarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarModeloActionPerformed
        // TODO add your handling code here:
        carregaDados(modeloVeiculo.getText());
    }//GEN-LAST:event_confirmarModeloActionPerformed

    private void modeloVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeloVeiculoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BuscaVeiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaVeiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaVeiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaVeiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                BuscaVeiculoView dialog = new BuscaVeiculoView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton confirmarConsulta;
    private javax.swing.JButton confirmarModelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTbUf;
    private javax.swing.JTextField modeloVeiculo;
    // End of variables declaration//GEN-END:variables
}
