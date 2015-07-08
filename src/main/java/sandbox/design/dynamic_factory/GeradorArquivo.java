package sandbox.design.dynamic_factory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author gilberto.andrade
 */
public abstract class GeradorArquivo {
    private PosProcessador processador;

    public void setPosProcessador(PosProcessador processador) {
        this.processador = processador;
    }
    
    public final void gerarArquivo(String nome, Map<String, Object> propriedades) throws IOException {
        String conteudo = gerarConteudo(propriedades);
        byte[] bytes = conteudo.getBytes();
        bytes = processador.processar(bytes);
        FileOutputStream fileout = new FileOutputStream(nome);
        fileout.write(bytes);
        fileout.close();
    }


    protected abstract String gerarConteudo(Map<String, Object> propriedades);
}
