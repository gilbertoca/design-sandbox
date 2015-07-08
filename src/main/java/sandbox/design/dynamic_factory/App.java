package sandbox.design.dynamic_factory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) throws IOException {
	new App().run();
    }
    public void run() throws IOException{
        System.out.println("Usando o gerador de arquivos");
        Map<String, Object> mapa = new HashMap<String, Object>();
        mapa.put("nome1", "Gilberto");
        mapa.put("nome2", "Caetano");

        //XML compactado
        FabricaDinamica f = new FabricaDinamica(getClass().getResource("configuracoes.properties").getFile());
        GeradorArquivo gerador = f.criaImplementacao(GeradorArquivo.class);
        gerador.setPosProcessador(f.criaImplementacao(PosProcessador.class));

        gerador.gerarArquivo("composto.zip", mapa);    
    }

}
