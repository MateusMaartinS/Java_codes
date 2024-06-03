/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.AlunoDAO;
import dto.EnderecoDTO;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.basic.BasicListUI;
import javax.swing.table.DefaultTableModel;
import modelo.Aluno;
import service.EnderecoService;

/**
 *
 * @author aluno
 */
public class ViewCadastroAluno extends javax.swing.JFrame {

    private AlunoDAO alunoDao = new AlunoDAO();
    private boolean alunoPesquisado; 
    private ArrayList<Aluno>lista;
    
    
    
    
    
    
    public ViewCadastroAluno() {
        initComponents();
        atualizarGrid();
    }

    public void atualizarGrid(){
        try {
            String sql = "SELECT * FROM public.\"Aluno\" ORDER BY \"RA_ALUNO\";";
            lista = new ArrayList();
            lista = alunoDao.retornaLista(sql);
            
            
            TB_tabelaAluno.removeAll();
            
            DefaultTableModel tableModel = new DefaultTableModel(new Object[][]{}, new String[]{"RA", "NOME", "DT.NASC"}){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
                
            };
            
            TB_tabelaAluno.setModel(tableModel);
            
            
            DefaultTableModel defaultModel = (DefaultTableModel)TB_tabelaAluno.getModel();
            
            for (Aluno aluno : lista){
                defaultModel.addRow(new Object[]{aluno.getRaAluno(), aluno.getNomeAluno(), aluno.getDtNascAluno()});
            }
            
            TB_tabelaAluno.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e){
                int linhaSeleciona = TB_tabelaAluno.getSelectedRow();
                if(linhaSeleciona != -1)
                    mostrarAluno(lista.get(linhaSeleciona));
                }
            });

            
        } catch (Exception e) {
            
        }
    }
    
    public void limparCampos(){
        TF_raAluno.setText("");
        TF_nomeAluno.setText("");
        TF_datanascAluno.setText("");
        TF_raAluno.setEditable(true);
        BT_salvarAluno.setEnabled(true);

    }
    
    
    private void mostrarAluno(Aluno aluno){
     TF_raAluno.setText(String.valueOf(aluno.getRaAluno()));
     TF_nomeAluno.setText(aluno.getNomeAluno());
     TF_datanascAluno.setText(aluno.getDtNascAluno());
     BT_salvarAluno.setEnabled(false);
     TF_raAluno.setEditable(false);
     alunoPesquisado = true;
     
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TF_raAluno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TF_nomeAluno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TF_datanascAluno = new javax.swing.JFormattedTextField();
        BT_pesquisarAluno = new javax.swing.JButton();
        BT_salvarAluno = new javax.swing.JButton();
        BT_atualizarAluno = new javax.swing.JButton();
        BT_removerAluno = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TF_logradouroAluno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TF_cepAluno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TF_numeroAluno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TF_bairroAluno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TF_cidadeufAluno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_tabelaAluno = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRO DE ALUNOS");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("RA:");

        TF_raAluno.setSelectionColor(new java.awt.Color(0, 0, 255));
        TF_raAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_raAlunoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("NOME:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("DATA NASCIMENTO:");

        TF_datanascAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        BT_pesquisarAluno.setText("Pesquisar");
        BT_pesquisarAluno.setPreferredSize(new java.awt.Dimension(95, 20));
        BT_pesquisarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_pesquisarAlunoActionPerformed(evt);
            }
        });

        BT_salvarAluno.setText("Salvar");
        BT_salvarAluno.setPreferredSize(new java.awt.Dimension(95, 20));
        BT_salvarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_salvarAlunoActionPerformed(evt);
            }
        });

        BT_atualizarAluno.setText("Atualizar");
        BT_atualizarAluno.setPreferredSize(new java.awt.Dimension(95, 20));
        BT_atualizarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_atualizarAlunoActionPerformed(evt);
            }
        });

        BT_removerAluno.setText("Remover");
        BT_removerAluno.setPreferredSize(new java.awt.Dimension(95, 20));
        BT_removerAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_removerAlunoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("CEP:");

        TF_logradouroAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_logradouroAlunoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("LOGRADOURO:");

        TF_cepAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TF_cepAlunoKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Nº");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("BAIRRO:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("CIDADE/UF:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TF_bairroAluno)
                        .addComponent(TF_raAluno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TF_cepAluno, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TF_logradouroAluno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TF_nomeAluno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(TF_datanascAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(TF_numeroAluno)))
                    .addComponent(TF_cidadeufAluno))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(BT_pesquisarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BT_atualizarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BT_removerAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BT_salvarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_raAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_nomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_datanascAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_logradouroAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_cepAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_numeroAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_bairroAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_cidadeufAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_pesquisarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_salvarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_atualizarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_removerAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        TB_tabelaAluno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TB_tabelaAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TB_tabelaAluno);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF_raAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_raAlunoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TF_raAlunoActionPerformed

    private void BT_pesquisarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_pesquisarAlunoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BT_pesquisarAlunoActionPerformed

    private void BT_atualizarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_atualizarAlunoActionPerformed
        if(alunoPesquisado){
            
            Aluno aluno = new Aluno();
            aluno.setRaAluno(Integer.parseInt(TF_raAluno.getText()));
            aluno.setNomeAluno(TF_nomeAluno.getText());
            aluno.setDtNascAluno(TF_datanascAluno.getText());
            
            if(alunoDao.atualizar(aluno)){
                JOptionPane.showMessageDialog(this, "Aluno Atualizado!");
                limparCampos();
                atualizarGrid();
            
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao Atualizar Aluno!","ERRO",JOptionPane.ERROR_MESSAGE);

            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Selecione um aluno para atualizar", "ATENÇÃO",JOptionPane.WARNING_MESSAGE);
        }
        
        
        
        
        
        
    }//GEN-LAST:event_BT_atualizarAlunoActionPerformed

    private void BT_salvarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_salvarAlunoActionPerformed
        Aluno novoAluno = new Aluno();
        novoAluno.setRaAluno(Integer.parseInt(TF_raAluno.getText()));
        novoAluno.setNomeAluno(TF_nomeAluno.getText());
        novoAluno.setDtNascAluno(TF_datanascAluno.getText());
        
        if(alunoDao.salvar(novoAluno)){
            JOptionPane.showConfirmDialog(this, "Aluno Cadastrado!", "AVISO!", JOptionPane.PLAIN_MESSAGE);
        }else{
            JOptionPane.showConfirmDialog(this, "eia eia eia, chicoteia as feia", "AVISO!", JOptionPane.PLAIN_MESSAGE);
        }
        atualizarGrid();
        limparCampos();
    }//GEN-LAST:event_BT_salvarAlunoActionPerformed

    private void BT_removerAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_removerAlunoActionPerformed
        if(alunoPesquisado){
            alunoDao.delete(Integer.parseInt(TF_raAluno.getText()), "Aluno", "RA_ALUNO");
            limparCampos();
            atualizarGrid();
        }else{
            JOptionPane.showMessageDialog(this, "Selecione um aluno para Remover", "ATENÇÃO",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BT_removerAlunoActionPerformed

    private void TF_logradouroAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_logradouroAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_logradouroAlunoActionPerformed

    private void TF_cepAlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_cepAlunoKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            if(!TF_cepAluno.getText().equals("")){
                try{
                    EnderecoDTO endereco = EnderecoService.buscaEndereco(TF_cepAluno.getText());
                    
                    TF_logradouroAluno.setText(endereco.getLogradouro());
                    TF_bairroAluno.setText(endereco.getBairro());
                    TF_cidadeufAluno.setText(endereco.getUf());
                    
                    
                    
                }catch(Exception ex){
                    Logger.getLogger(ViewCadastroAluno.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
        
        
        
        
    }//GEN-LAST:event_TF_cepAlunoKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_atualizarAluno;
    private javax.swing.JButton BT_pesquisarAluno;
    private javax.swing.JButton BT_removerAluno;
    private javax.swing.JButton BT_salvarAluno;
    private javax.swing.JTable TB_tabelaAluno;
    private javax.swing.JTextField TF_bairroAluno;
    private javax.swing.JTextField TF_cepAluno;
    private javax.swing.JTextField TF_cidadeufAluno;
    private javax.swing.JFormattedTextField TF_datanascAluno;
    private javax.swing.JTextField TF_logradouroAluno;
    private javax.swing.JTextField TF_nomeAluno;
    private javax.swing.JTextField TF_numeroAluno;
    private javax.swing.JTextField TF_raAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
