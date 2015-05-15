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
package sandbox.design.observer;

/**
 *
 * @author gilberto.andrade
 */
public class App {

    public static void main(String[] args) throws InterruptedException {
        CarteiraAcoes ca = new CarteiraAcoes();
        Observador al = new AcoesLogger();
        GraficoBarras gb = new GraficoBarras();
        ca.addObservador(gb);
        ca.addObservador(al);
        
        ca.adicionaAcoes("COLGATE", 25);
        ca.adicionaAcoes("COLINOS", 15);
        ca.adicionaAcoes("SORRISO", 5);
        //modificações
        ca.adicionaAcoes("COLGATE", 55);
        ca.adicionaAcoes("COLINOS", 25);
        ca.adicionaAcoes("SORRISO", 30);

        Thread.sleep(2000);
        ca.adicionaAcoes("COMP02", 200);
        Thread.sleep(2000);
        ca.adicionaAcoes("EMP34", 400);
        Thread.sleep(2000);
        ca.adicionaAcoes("ACDF89", 300);
        Thread.sleep(2000);
        ca.adicionaAcoes("EMP34", -200);
        Thread.sleep(2000);
        ca.adicionaAcoes("COMP02", 150);

    }
}
