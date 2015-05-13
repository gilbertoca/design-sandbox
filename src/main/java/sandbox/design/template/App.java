package sandbox.design.template;

import sandbox.design.bridge.GeradorArquivo;
import sandbox.design.bridge.GeradorPropriedades;
import sandbox.design.bridge.GeradorXML;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Usando o gerador de arquivos" );
        //GeradorArquivo ga = new GeradorPropriedades(1);
        GeradorArquivo ga = new GeradorXML();
        Map<String, Object> mapa = new HashMap<String, Object>();
        
        mapa.put("nome1", "Gilberto");
        mapa.put("nome2", "Caetano");
        //ga.gerarArquivo("lista.txt", mapa);
        ga.gerarArquivo("lista.zip", mapa);
    }
}
