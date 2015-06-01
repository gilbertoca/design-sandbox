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

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class PosProcessadorComposto implements PosProcessador {

    private Set<PosProcessador> posProcessadores = new HashSet<PosProcessador>();

    public void add(PosProcessador p) {
        posProcessadores.add(p);
    }

    public byte[] processar(byte[] bytes) throws IOException {
        byte[] acumulador = bytes;
        for(PosProcessador p : posProcessadores ){
            acumulador = p.processar(acumulador);
            //Como acumular e aplicar ao próximo processmento?
        }
        return acumulador;
    }

}
