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
package sandbox.design.composite;


public class TrechoComposto implements TrechoAereo {
    private TrechoAereo primeiro;
    private TrechoAereo segundo;
    private double taxaconexao;

    public TrechoComposto(TrechoAereo primeiro, TrechoAereo segundo, double taxaconexao) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.taxaconexao = taxaconexao;
        if(primeiro.getDestino() != segundo.getOrigem())
            throw new RuntimeException("O destino do primeiro não é igual a origem do segundo");
    }

    
    public String getOrigem() {
        return primeiro.getOrigem();
    }

    public String getDestino() {
        return segundo.getDestino();
    }

    public double getPreco() {
        return primeiro.getPreco() + segundo.getPreco() + taxaconexao;
    }

    @Override
    public String toString() {
        return "TrechoComposto{" + "primeiro=" + primeiro + ", segundo=" + segundo + ", taxaconexao=" + taxaconexao + '}';
    }
    
}
