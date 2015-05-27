/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluguelveiculosutf.view;

import aluguelveiculosutf.impl.CliImpl;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class AlugarCarro extends javax.swing.JFrame {

    CliImpl cliImpl;
    String carroALocar = "Nenhum carro selecionado";
    
    /**
     * Creates new form OpcoesTransferencia
     * @param cli
     */
    public AlugarCarro(CliImpl cli, String modeloVeiculo)
    {
        initComponents();
        cliImpl = cli;
        carroALocar = modeloVeiculo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        confirmar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        localRetirada = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        localDevolucao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nomeCondutor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        parcelas = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        dataInicio = new javax.swing.JFormattedTextField();
        dataFim = new javax.swing.JFormattedTextField();
        horaFim = new javax.swing.JFormattedTextField();
        horaInicio = new javax.swing.JFormattedTextField();
        idadeCondutor = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        confirmar.setText("Confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Para finalizar a locação, informe os dados abaixo:");

        jLabel2.setText("Local de Retirada");

        jLabel3.setText("Local de Devolução");

        jLabel4.setText("Data Início");

        jLabel5.setText("Horário Início");

        jLabel7.setText("Data Fim");

        jLabel8.setText("Horário Fim");

        jLabel9.setText("Nome Condutor");

        jLabel10.setText("Idade");

        jLabel11.setText("Informe a quantidade de parcelas");

        parcelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1x (10% de desconto).", "2x (Sem juros).", "3x (Sem juros).", "4x (Sem juros).", "5x (Sem juros).", "6x (1,25% juros/m).", "7x (1,25% juros/m).", "8x (1,25% juros/m).", "9x (1,25% juros/m).", "10x (1,50% juros/m).", "11x (1,75% juros/m).", "12x (2% juros/m)." }));

        jLabel1.setText("Carro a ser locado:");

        jTextField2.setText(carroALocar);

        dataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        dataInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataInicioActionPerformed(evt);
            }
        });

        dataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        horaFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        horaInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        idadeCondutor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confirmar))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(localRetirada)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(138, 138, 138)
                                .addComponent(jLabel5)
                                .addGap(98, 98, 98))
                            .addComponent(localDevolucao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(parcelas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(nomeCondutor, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(dataFim, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                        .addComponent(dataInicio, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(28, 28, 28)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(horaFim)
                                    .addComponent(horaInicio)
                                    .addComponent(idadeCondutor)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel8))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel6))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(localRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(localDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(horaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(33, 33, 33)))
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(2, 2, 2)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(horaFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(28, 28, 28)))
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeCondutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idadeCondutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(26, 26, 26)))
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(confirmar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancelarActionPerformed
    {//GEN-HEADEREND:event_cancelarActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_confirmarActionPerformed
    {//GEN-HEADEREND:event_confirmarActionPerformed
        String locRetirada = localRetirada.getText();
        String locDevolucao = localDevolucao.getText();
        String dataIni = dataInicio.getText();
        String dataTerm = dataFim.getText();
        String condutor = nomeCondutor.getText();
        String age = idadeCondutor.getText();
        String numeroParcelas = parcelas.getSelectedItem().toString();
        
        String msg;
        try{
            int idade = Integer.parseInt(age);
            if(locRetirada.equals("") || locDevolucao.equals("") || dataIni.equals("")
                    || dataTerm.equals("") || condutor.equals("") || numeroParcelas.equals("")
                    || idade <= 0){
                msg = "Por favor, preencha todos os campos.";
                JOptionPane.showMessageDialog(null, msg);
            }else if(idade < 18){
                msg = "Somente condutores acima de 18 anos de idade podem alugar um carro.";
                JOptionPane.showMessageDialog(null, msg);
            }else{
                boolean ret = cliImpl.alugarVeic(locRetirada, locDevolucao, dataIni, dataTerm, condutor, idade, numeroParcelas);
                if(ret) msg = "Locação de carro realizada com sucesso!";
                else msg = "Lamentamos, não foi possível realizar a locação do veículo.";
                JOptionPane.showMessageDialog(null, msg);
                this.setVisible(false);
                this.dispose();
            }
        }catch(Exception e){
            msg = "Por favor, informe dados válidos.";
            JOptionPane.showMessageDialog(null, msg);
        }
    }//GEN-LAST:event_confirmarActionPerformed

    private void dataInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataInicioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton confirmar;
    private javax.swing.JFormattedTextField dataFim;
    private javax.swing.JFormattedTextField dataInicio;
    private javax.swing.JFormattedTextField horaFim;
    private javax.swing.JFormattedTextField horaInicio;
    private javax.swing.JFormattedTextField idadeCondutor;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField localDevolucao;
    private javax.swing.JTextField localRetirada;
    private javax.swing.JTextField nomeCondutor;
    private javax.swing.JComboBox parcelas;
    // End of variables declaration//GEN-END:variables
}
