package VIEW;
import VIEW.FrameConfirmacao;

/*      @author Kevyn      */

public class FrameMain extends javax.swing.JFrame {
    
    /*** INSTANCIANDO OBJETOS ***/
    FrameConfirmacao frameConfirmacao = new FrameConfirmacao();

    public FrameMain() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cb_estabelecimento1 = new javax.swing.JComboBox<>();
        b_selecionar = new javax.swing.JButton();
        ff_data_fin = new javax.swing.JFormattedTextField();
        l_data_final = new javax.swing.JLabel();
        l_data_inicial1 = new javax.swing.JLabel();
        ff_data_inicial = new javax.swing.JFormattedTextField();
        ff_agente_cobrador = new javax.swing.JFormattedTextField();
        ff_cliente = new javax.swing.JFormattedTextField();
        l_agente_cobrador = new javax.swing.JLabel();
        l_cliente = new javax.swing.JLabel();
        cb_estabelecimento = new javax.swing.JComboBox<>();
        cb_ordenacao = new javax.swing.JComboBox<>();
        cb_parcela = new javax.swing.JComboBox<>();

        cb_estabelecimento1.setBackground(new java.awt.Color(102, 102, 102));
        cb_estabelecimento1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cb_estabelecimento1.setForeground(new java.awt.Color(255, 255, 255));
        cb_estabelecimento1.setMaximumRowCount(2);
        cb_estabelecimento1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estabelecimento", "SC", "RS" }));
        cb_estabelecimento1.setToolTipText("Estabelecimento");
        cb_estabelecimento1.setName("Estabelecimento"); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Troca Agente Cobrador");
        setMaximumSize(new java.awt.Dimension(3000, 3000));
        setMinimumSize(new java.awt.Dimension(30, 40));
        setPreferredSize(new java.awt.Dimension(400, 360));
        setResizable(false);
        getContentPane().setLayout(null);

        b_selecionar.setBackground(new java.awt.Color(102, 102, 102));
        b_selecionar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        b_selecionar.setForeground(new java.awt.Color(255, 255, 255));
        b_selecionar.setText("Selecionar");
        b_selecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_selecionarActionPerformed(evt);
            }
        });
        getContentPane().add(b_selecionar);
        b_selecionar.setBounds(110, 280, 170, 30);

        ff_data_fin.setBackground(new java.awt.Color(102, 102, 102));
        ff_data_fin.setForeground(new java.awt.Color(255, 255, 255));
        try {
            ff_data_fin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ff_data_fin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ff_data_fin);
        ff_data_fin.setBounds(180, 50, 181, 30);

        l_data_final.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        l_data_final.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_data_final.setText("Data final");
        l_data_final.setPreferredSize(null);
        getContentPane().add(l_data_final);
        l_data_final.setBounds(0, 50, 170, 30);

        l_data_inicial1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        l_data_inicial1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_data_inicial1.setText("Data inicial");
        l_data_inicial1.setPreferredSize(null);
        getContentPane().add(l_data_inicial1);
        l_data_inicial1.setBounds(0, 10, 170, 30);

        ff_data_inicial.setBackground(new java.awt.Color(102, 102, 102));
        ff_data_inicial.setForeground(new java.awt.Color(255, 255, 255));
        try {
            ff_data_inicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ff_data_inicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ff_data_inicial);
        ff_data_inicial.setBounds(180, 10, 181, 30);

        ff_agente_cobrador.setBackground(new java.awt.Color(102, 102, 102));
        ff_agente_cobrador.setForeground(new java.awt.Color(255, 255, 255));
        try {
            ff_agente_cobrador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ff_agente_cobrador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ff_agente_cobrador);
        ff_agente_cobrador.setBounds(180, 90, 181, 30);

        ff_cliente.setBackground(new java.awt.Color(102, 102, 102));
        ff_cliente.setForeground(new java.awt.Color(255, 255, 255));
        try {
            ff_cliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ff_cliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ff_cliente);
        ff_cliente.setBounds(180, 130, 181, 30);

        l_agente_cobrador.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        l_agente_cobrador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_agente_cobrador.setText("Agente cobrador");
        getContentPane().add(l_agente_cobrador);
        l_agente_cobrador.setBounds(0, 90, 170, 30);

        l_cliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        l_cliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_cliente.setText("Cliente");
        l_cliente.setPreferredSize(null);
        getContentPane().add(l_cliente);
        l_cliente.setBounds(0, 130, 170, 30);

        cb_estabelecimento.setBackground(new java.awt.Color(102, 102, 102));
        cb_estabelecimento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cb_estabelecimento.setForeground(new java.awt.Color(255, 255, 255));
        cb_estabelecimento.setMaximumRowCount(3);
        cb_estabelecimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estabelecimento", "SC", "RS" }));
        cb_estabelecimento.setToolTipText("Estabelecimento");
        cb_estabelecimento.setName("Estabelecimento"); // NOI18N
        getContentPane().add(cb_estabelecimento);
        cb_estabelecimento.setBounds(120, 210, 170, 30);
        cb_estabelecimento.getAccessibleContext().setAccessibleName("Estabelecimento");

        cb_ordenacao.setBackground(new java.awt.Color(102, 102, 102));
        cb_ordenacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cb_ordenacao.setForeground(new java.awt.Color(255, 255, 255));
        cb_ordenacao.setMaximumRowCount(4);
        cb_ordenacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordenação", "Data Vencimento", "Maior Valor", "Menor Valor" }));
        cb_ordenacao.setToolTipText("Estabelecimento");
        cb_ordenacao.setName("Estabelecimento"); // NOI18N
        getContentPane().add(cb_ordenacao);
        cb_ordenacao.setBounds(213, 170, 150, 30);

        cb_parcela.setBackground(new java.awt.Color(102, 102, 102));
        cb_parcela.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cb_parcela.setForeground(new java.awt.Color(255, 255, 255));
        cb_parcela.setMaximumRowCount(7);
        cb_parcela.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Parcela", "A", "B", "C", "D", "E", "F", " " }));
        cb_parcela.setToolTipText("Estabelecimento");
        cb_parcela.setName("Estabelecimento"); // NOI18N
        getContentPane().add(cb_parcela);
        cb_parcela.setBounds(33, 170, 150, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_selecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_selecionarActionPerformed
        // TODO add your handling code here:
        frameConfirmacao.setVisible(true);
    }//GEN-LAST:event_b_selecionarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_selecionar;
    private javax.swing.JComboBox<String> cb_estabelecimento;
    private javax.swing.JComboBox<String> cb_estabelecimento1;
    private javax.swing.JComboBox<String> cb_ordenacao;
    private javax.swing.JComboBox<String> cb_parcela;
    private javax.swing.JFormattedTextField ff_agente_cobrador;
    private javax.swing.JFormattedTextField ff_cliente;
    private javax.swing.JFormattedTextField ff_data_fin;
    private javax.swing.JFormattedTextField ff_data_inicial;
    private javax.swing.JLabel l_agente_cobrador;
    private javax.swing.JLabel l_cliente;
    private javax.swing.JLabel l_data_final;
    private javax.swing.JLabel l_data_inicial1;
    // End of variables declaration//GEN-END:variables
}
