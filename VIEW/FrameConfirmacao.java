package VIEW;

/*      @author Kevyn      */

public class FrameConfirmacao extends javax.swing.JFrame {
    public FrameConfirmacao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ff_novo_agente = new javax.swing.JFormattedTextField();
        l_frame_confirmacao = new javax.swing.JLabel();
        b_confirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(250, 220));
        setResizable(false);
        getContentPane().setLayout(null);

        ff_novo_agente.setBackground(new java.awt.Color(102, 102, 102));
        ff_novo_agente.setForeground(new java.awt.Color(255, 255, 255));
        try {
            ff_novo_agente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ff_novo_agente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ff_novo_agente);
        ff_novo_agente.setBounds(50, 70, 150, 30);

        l_frame_confirmacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        l_frame_confirmacao.setForeground(new java.awt.Color(255, 255, 255));
        l_frame_confirmacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_frame_confirmacao.setText("Você selecinou X itens!");
        getContentPane().add(l_frame_confirmacao);
        l_frame_confirmacao.setBounds(0, 20, 250, 17);

        b_confirmar.setBackground(new java.awt.Color(102, 102, 102));
        b_confirmar.setForeground(new java.awt.Color(255, 255, 255));
        b_confirmar.setText("Atualizar");
        getContentPane().add(b_confirmar);
        b_confirmar.setBounds(50, 130, 150, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameConfirmacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameConfirmacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameConfirmacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameConfirmacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameConfirmacao().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_confirmar;
    private javax.swing.JFormattedTextField ff_novo_agente;
    private javax.swing.JLabel l_frame_confirmacao;
    // End of variables declaration//GEN-END:variables
}
