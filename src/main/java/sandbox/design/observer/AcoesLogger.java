package sandbox.design.observer;


public class AcoesLogger implements Observador {

    public void mudancaQuantidade(String acao, Integer qtd) {
        System.out.println("Ação: "+acao+" Quantidade auterada: "+qtd);
    }
    
}
