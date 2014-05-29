/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.ClienteModel;

/**
 *
 * @author Professor
 */
public class PrincipalView extends javax.swing.JFrame {

    private final ArrayList<ClienteModel> clientes;
    
    /**
     * Creates new form PrincipalView
     */
    public PrincipalView() {
        initComponents();
        
        clientes = new ArrayList<>();
        
        menuConsultaCliente.addActionListener(new ConsultaClienteClick());
        menuCadastroCliente.addActionListener(new CadastroClienteClick());
        menuCadastroProjeto.addActionListener(new CadastroProjetoClick());
    } // fecha PrincipalView
    
    class ConsultaClienteClick implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            ConsultaClienteView ccView = new ConsultaClienteView(clientes);
            painelAreaTrabalho.add(ccView);
            ccView.setVisible(true);
        } // fecha actionPerformed
        
    } // fecha ConsultaClienteClick
    
    class CadastroClienteClick implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            CadastroClienteView ccView = new CadastroClienteView(clientes);
            painelAreaTrabalho.add(ccView);
            ccView.setVisible(true);
        } // fecha actionPerformed
        
    } // fecha CadastroClienteClick
    
    class CadastroProjetoClick implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            CadastroProjetoView cpView = new CadastroProjetoView();
            painelAreaTrabalho.add(cpView);
            cpView.setVisible(true);
        } // fecha actionPerformed
        
    } // fecha CadastroProjetoClick
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelAreaTrabalho = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuConsultas = new javax.swing.JMenu();
        menuConsultaCliente = new javax.swing.JMenuItem();
        menuConsultaProjeto = new javax.swing.JMenuItem();
        menuCadastros = new javax.swing.JMenu();
        menuCadastroCliente = new javax.swing.JMenuItem();
        menuCadastroProjeto = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        menuRelatoriosFinanceiros = new javax.swing.JMenu();
        menuRelatoriosFinanceirosCliente = new javax.swing.JMenuItem();
        menuRelatoriosFinanceirosProjeto = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuRelatoriosOperacionais = new javax.swing.JMenu();
        menuRelatoriosOperacionaisCliente = new javax.swing.JMenuItem();
        menuRelatoriosOperacionaisProjeto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exemplo Menu");
        setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout painelAreaTrabalhoLayout = new javax.swing.GroupLayout(painelAreaTrabalho);
        painelAreaTrabalho.setLayout(painelAreaTrabalhoLayout);
        painelAreaTrabalhoLayout.setHorizontalGroup(
            painelAreaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        painelAreaTrabalhoLayout.setVerticalGroup(
            painelAreaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 257, Short.MAX_VALUE)
        );

        menuConsultas.setText("Consultas");

        menuConsultaCliente.setText("Cliente");
        menuConsultas.add(menuConsultaCliente);

        menuConsultaProjeto.setText("Projeto");
        menuConsultas.add(menuConsultaProjeto);

        jMenuBar1.add(menuConsultas);

        menuCadastros.setText("Cadastros");

        menuCadastroCliente.setText("Cliente");
        menuCadastros.add(menuCadastroCliente);

        menuCadastroProjeto.setText("Projeto");
        menuCadastros.add(menuCadastroProjeto);

        jMenuBar1.add(menuCadastros);

        menuRelatorios.setText("Relatórios");

        menuRelatoriosFinanceiros.setText("Financeiros");

        menuRelatoriosFinanceirosCliente.setText("Cliente");
        menuRelatoriosFinanceiros.add(menuRelatoriosFinanceirosCliente);

        menuRelatoriosFinanceirosProjeto.setText("Projeto");
        menuRelatoriosFinanceiros.add(menuRelatoriosFinanceirosProjeto);

        menuRelatorios.add(menuRelatoriosFinanceiros);
        menuRelatorios.add(jSeparator1);

        menuRelatoriosOperacionais.setText("Operacionais");

        menuRelatoriosOperacionaisCliente.setText("Cliente");
        menuRelatoriosOperacionais.add(menuRelatoriosOperacionaisCliente);

        menuRelatoriosOperacionaisProjeto.setText("Projeto");
        menuRelatoriosOperacionais.add(menuRelatoriosOperacionaisProjeto);

        menuRelatorios.add(menuRelatoriosOperacionais);

        jMenuBar1.add(menuRelatorios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAreaTrabalho)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAreaTrabalho)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem menuCadastroCliente;
    private javax.swing.JMenuItem menuCadastroProjeto;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenuItem menuConsultaCliente;
    private javax.swing.JMenuItem menuConsultaProjeto;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenu menuRelatoriosFinanceiros;
    private javax.swing.JMenuItem menuRelatoriosFinanceirosCliente;
    private javax.swing.JMenuItem menuRelatoriosFinanceirosProjeto;
    private javax.swing.JMenu menuRelatoriosOperacionais;
    private javax.swing.JMenuItem menuRelatoriosOperacionaisCliente;
    private javax.swing.JMenuItem menuRelatoriosOperacionaisProjeto;
    private javax.swing.JDesktopPane painelAreaTrabalho;
    // End of variables declaration//GEN-END:variables
}