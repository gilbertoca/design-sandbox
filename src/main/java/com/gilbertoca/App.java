package com.gilbertoca;

import com.gilbertoca.template.GeradorArquivo;
import com.gilbertoca.template.GeradorPropriedadesCriptografado;
import com.gilbertoca.template.GeradorXMLCompactado;
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
        //GeradorArquivo ga = new GeradorPropriedadesCriptografado(1);
        GeradorArquivo ga = new GeradorXMLCompactado();
        Map<String, Object> mapa = new HashMap<String, Object>();
        
        mapa.put("nome1", "Gilberto");
        mapa.put("nome2", "Caetano");
        //ga.gerarArquivo("lista.txt", mapa);
        ga.gerarArquivo("lista.zip", mapa);
    }
}
