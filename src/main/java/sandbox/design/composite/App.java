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

/**
 *
 * @author gilberto.andrade
 */
public class App {
    public static void main(String[] args) {
        TrechoSimples ts1 = new TrechoSimples("São Paulo", "Brasília", 500);
        TrechoSimples ts2 = new TrechoSimples("Brasília", "Recife", 300);
        TrechoSimples ts3 = new TrechoSimples("Recife", "Natal", 350);
        
        TrechoComposto tc1 = new TrechoComposto(ts2, ts3, 30);
        TrechoComposto tc2 = new TrechoComposto(ts1, tc1, 50);
        
        System.out.println("Primeiro Trecho Composto: " + tc1);
        System.out.println("Segundo Trecho Composto: " + tc2);
    }
}
