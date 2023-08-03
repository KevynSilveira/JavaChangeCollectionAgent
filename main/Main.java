package main;

/*      @author Kevyn      */

import VIEW.FrameMain;
import VIEW.FrameConfirmacao;
import MODEL.background;

public class Main {
    public static void main(String[] args) {
        
        /*** INSTANCIANDO OBJETOS ***/
        
        FrameMain frame_principal = new FrameMain();
        FrameConfirmacao frame_confirmacao = new FrameConfirmacao();
        
        background fundo = new background(); // Instanciando o background para mudar a cor dos frames
        
        /*** DEFININDO A COR DE FUNDO DOS FRAMES ***/
        fundo.setCorDeFundo(frame_principal);
        fundo.setCorDeFundo(frame_confirmacao);
        
        
        frame_principal.setVisible(true);
    }
}
