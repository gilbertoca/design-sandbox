/*
 * Copyright 2015 gilberto.andrade.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package sandbox.design.bridge;

/**
 *
 * @author gilberto.andrade
 */
public abstract class FabricaGerador {
    public static final String ZIP = "ZIP";
    public static final String CRYPTO = "CRYPTO";
    
    public static GeradorArquivo criarGeradorXML(String ... processadores) {
        GeradorArquivo g = new GeradorXML();
        g.setProcessador(criarProcessador(processadores));
        return g;
    }

    private static PosProcessador criarProcessador(String... processadores) {
        PosProcessador retorno = null;
        if(processadores.length > 1){
            PosProcessadorComposto pp = new PosProcessadorComposto();
            for(String proc : processadores){
                pp.add(criarProcessador(proc));
            }
            retorno = pp;
        }else if(processadores[0].equals(ZIP)){
            retorno = new Compactador();
        }else if(processadores[0].equals(CRYPTO)){
            retorno = new Criptografador(1);
        }
        return retorno;
    }
}
