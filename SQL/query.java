package SQL;

/*      @author Kevyn      */

import MODEL.VariaveisGlobais;

public class query {
    
    /** INSTANCIANDO OBJETOS ***/
    VariaveisGlobais variavel = new VariaveisGlobais();
    
    /*** CHAMA AS VARIAVEIS GLOBAIS E ATRIBUI UMA VARIAVEL LOCAL PARA CONFERENCIA DE VALOR ***/
    String estabelecimento = variavel.getEstabelecimento();
    String dataInicial = variavel.getData_inicial();
    String dataFinal = variavel.getData_final();
    String agenteCobrador = variavel.getAgente_cobrador();
    String cliente = variavel.getCliente();
    String parcela = variavel.getParcela();
    String ordem = variavel.getOrdem();
    int quantidadeResultado = variavel.getQuantidade_resultado();

    
    /*** TRAZ A CONTAGEM DE QUANTAS COLUNAS FORAM SELECIONADAS ***/
    private static String query_contagem = 
        "DECLARE @cliente INT = ?;" +
        "DECLARE @filial INT = (SELECT cgc_matriz FROM CLIEN WHERE codigo = @cliente);" +
        "DECLARE @agente INT = ?;" +
        "DECLARE @estabelecimento INT = ?;" +
        "DECLARE @datainicio DATE = ?;" +
        "DECLARE @datafim DATE = ?;" +
        "DECLARE @parcela varchar = ?;" +
        "WITH ResultadoConsulta AS (" +
        "SELECT TOP 800" +
        "  Cod_Documento" +
        " FROM CTREC" +
        " WHERE cod_estabe = @estabelecimento" +
        "  AND cod_agente = @agente" +
        "  AND status = 'A'" +
        "  AND Par_Documento = @parcela" +
        "  AND dat_vencimento BETWEEN @datainicio AND @datafim" +
        "  AND (cod_cliente = @cliente OR cgc_matriz = @filial)" +
        ")" +
        "SELECT COUNT(*) AS Quantidadetotal FROM ResultadoConsulta;";
    
    
    /*** SELECIONA PARA TRANSFORMAR EM EXCEL ***/
    private static final String query_seleciona = "DECLARE @cliente INT = ?;" +
        "DECLARE @filial INT = (SELECT cgc_matriz FROM CLIEN WHERE codigo = @cliente);" +
        "DECLARE @agente INT = ?;" +
        "DECLARE @estabelecimento INT = ?;" +
        "DECLARE @datainicio DATE = ?;" +
        "DECLARE @datafim DATE = ?;" +
        "DECLARE @parcela varchar = ?;" +
        "SELECT TOP 800" +
        "  Cod_Documento AS Código," +
        "  Num_Documento AS Documento," +
        "  CONVERT(varchar, Dat_Emissao, 103) AS Emissao," +
        "  CONVERT(varchar, Dat_Vencimento, 103) AS Vencimento," +
        "  Cod_Agente AS Ag_Cobrador," +
        "  CT.Cod_Cliente AS Cliente," +
        "  V.Razao_Social AS Razao_Cocial," +
        "  Par_Documento AS Parcela," +
        "  FORMAT(Vlr_Documento, 'C') AS Preco" +
        " FROM CTREC CT" +
        " LEFT JOIN V_CLIEN V ON CT.Cod_Cliente = V.Cod_Cliente" +
        " WHERE cod_estabe = @estabelecimento" +
        "  AND cod_agente = @agente" +
        "  AND status = 'A'" +
        "  AND Par_Documento = @parcela" +
        "  AND dat_vencimento BETWEEN @datainicio AND @datafim" +
        "  AND (CT.cod_cliente = @cliente OR cgc_matriz = @filial)" +
        " ORDER BY %s;";
    
    
    /*** SELECIONA E ATUALIZA O AGENTE COBRADOR ***/
    private static final String query_seleciona_update = "DECLARE @cliente INT = ?; " +
        "DECLARE @filial INT = (SELECT cgc_matriz FROM CLIEN WHERE codigo = @cliente); " +
        "DECLARE @agente INT = ?; " +
        "DECLARE @estabelecimento INT = ?; " +
        "DECLARE @datainicio DATE = ?; " +
        "DECLARE @datafim DATE = ?; " +
        "DECLARE @parcela varchar(255) = ?; " +
        "WITH CTE AS ( " +
        "SELECT TOP 800" +
        "  Cod_Documento AS Código," +
        "  Num_Documento AS Documento," +
        "  dat_vencimento AS Vencimento," +
        "  Par_Documento AS Parcela," +
        "  Cod_Agente AS Ag_Cobrador," +
        "  Cod_Cliente AS Cliente," +
        "  FORMAT(Vlr_Documento, 'C') AS Preco" +
        " FROM CTREC" +
        " WHERE cod_estabe = @estabelecimento" +
        "  AND cod_agente = @agente" +
        "  AND status = 'A'" +
        "  AND Par_Documento = @parcela" +
        "  AND dat_vencimento BETWEEN @datainicio AND @datafim" +
        "  AND (cod_cliente = @cliente OR cgc_matriz = @filial)" +
        " ORDER BY %s" +
        ") " +
        "UPDATE CTE SET Ag_Cobrador = ?;";

}
