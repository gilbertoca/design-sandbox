package sandbox.design.bridge;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Usando o gerador de arquivos" );
        Map<String, Object> mapa = new HashMap<String, Object>();
        mapa.put("nome1", "Gilberto");
        mapa.put("nome2", "Caetano");
        
        //XML sem pos-processador
        GeradorArquivo gxsp = new GeradorXML();
        gxsp.setProcessador(new NullPosProcessador());
        gxsp.gerarArquivo("gxsp.txt", mapa);
        
        //XML com pos-processador - compactador
        GeradorArquivo gxcc = new GeradorXML();
        gxcc.setProcessador(new Compactador());
        gxcc.gerarArquivo("gxcc.zip", mapa);
        
    }
}
