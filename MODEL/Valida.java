package MODEL;

/*      @author Kevyn      */

import MODEL.VariaveisGlobais;
import javax.swing.JOptionPane;

public class Valida {
    
    /** INSTANCIANDO OBJETOS ***/
    VariaveisGlobais variavel = new VariaveisGlobais();
    
    
    /*** VALIDA SE TODOS OS CAMPOS ESTÃO PREENCHIDOS ***/
    public boolean valida_campo(){
        
        boolean status;
       
        /*** CHAMA AS VARIAVEIS GLOBAIS E ATRIBUI UMA VARIAVEL LOCAL PARA CONFERENCIA DE VALOR ***/
        String estabelecimento = variavel.getEstabelecimento();
        String dataInicial = variavel.getData_inicial();
        String dataFinal = variavel.getData_final();
        String agenteCobrador = variavel.getAgente_cobrador();
        String cliente = variavel.getCliente();
        String parcela = variavel.getParcela();
        String ordem = variavel.getOrdem();
        int quantidadeResultado = variavel.getQuantidade_resultado();
        
        /*** FAZ A VERIFICAÇÃO SE TODOS OS CAMPOS ESTÃO PREENCHIDOS ***/
        
        /*** Só aceita se todos os campos estiverem preenchidos ***/
        if (estabelecimento != null && !estabelecimento.isEmpty() &&
            dataInicial != null && !dataInicial.isEmpty() &&
            dataFinal != null && !dataFinal.isEmpty() &&
            agenteCobrador != null && !agenteCobrador.isEmpty() &&
            cliente != null && !cliente.isEmpty() &&
            parcela != null && !parcela.isEmpty() &&
            ordem != null && !ordem.isEmpty()) {
            
            status = true;
        }/*** Aceita sem colocar a parcela ***/    
        else if (estabelecimento != null && !estabelecimento.isEmpty() &&
            dataInicial != null && !dataInicial.isEmpty() &&
            dataFinal != null && !dataFinal.isEmpty() &&
            agenteCobrador != null && !agenteCobrador.isEmpty() &&
            cliente != null && !cliente.isEmpty() &&
            ordem != null && !ordem.isEmpty()) {
           
            status = true;    
        }/*** Aceita sem colocar parcela e cliente ***/
        else if (estabelecimento != null && !estabelecimento.isEmpty() &&
            dataInicial != null && !dataInicial.isEmpty() &&
            dataFinal != null && !dataFinal.isEmpty() &&
            agenteCobrador != null && !agenteCobrador.isEmpty() &&
            ordem != null && !ordem.isEmpty()) {
       
            status = true;   
        }
        else {
            status = false;
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }
        
        return status; //RETORNA UM VALOR BOOLEANO INDICANDO SE ESTÁ TODOS OS CAMPOS PREENCHIDOS
    }
}
