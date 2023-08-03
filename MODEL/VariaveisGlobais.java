package MODEL;

/*      @author Kevyn      */

public class VariaveisGlobais {
    
     /*** VARIAVEIS GLOBAIS ***/
    private static String estabelecimento;
    private static String data_inicial;
    private static String data_final;
    private static String agente_cobrador;
    private static String novo_agente_cobrador;
    private static String cliente;
    private static String parcela;
    private static String ordem;
    private static int quantidade_resultado;

    /*** GET E SET ***/
    public static String getEstabelecimento() {
        return estabelecimento;
    }
    public static void setEstabelecimento(String estabelecimento) {
        VariaveisGlobais.estabelecimento = estabelecimento;
    }
    public static String getData_inicial() {
        return data_inicial;
    }
    public static void setData_inicial(String data_inicial) {
        VariaveisGlobais.data_inicial = data_inicial;
    }
    public static String getData_final() {
        return data_final;
    }
    public static void setData_final(String data_final) {
        VariaveisGlobais.data_final = data_final;
    }
    public static String getAgente_cobrador() {
        return agente_cobrador;
    }
    public static void setAgente_cobrador(String agente_cobrador) {
        VariaveisGlobais.agente_cobrador = agente_cobrador;
    }
    public static String getNovo_agente_cobrador() {
        return novo_agente_cobrador;
    }
    public static void setNovo_agente_cobrador(String novo_agente_cobrador) {
        VariaveisGlobais.novo_agente_cobrador = novo_agente_cobrador;
    }
    public static String getCliente() {
        return cliente;
    }
    public static void setCliente(String cliente) {
        VariaveisGlobais.cliente = cliente;
    }
    public static String getParcela() {
        return parcela;
    }
    public static void setParcela(String parcela) {
        VariaveisGlobais.parcela = parcela;
    }
    public static String getOrdem() {
        return ordem;
    }
    public static void setOrdem(String ordem) {
        VariaveisGlobais.ordem = ordem;
    }
    public static int getQuantidade_resultado() {
        return quantidade_resultado;
    }
    public static void setQuantidade_resultado(int quantidade_resultado) {
        VariaveisGlobais.quantidade_resultado = quantidade_resultado;
    }
}
