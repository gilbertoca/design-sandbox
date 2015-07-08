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
package sandbox.design.dynamic_factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author gilberto.andrade
 */
public class FabricaDinamica {
  
  private Properties props;
  
  public FabricaDinamica(String arquivo) throws FileNotFoundException, IOException{
    props = new Properties();
    props.load(new FileInputStream(arquivo));
  }

  public <T> T criaImplementacao(Class<T> _interface) {
    String nomeClasse = props.getProperty(_interface.getName());

    if(nomeClasse == null) {
      throw new IllegalArgumentException("Interface não configurada");
    }

    try {
      Class clazz = Class.forName(nomeClasse);
      if (_interface.isAssignableFrom(clazz)) {
        return (T) clazz.newInstance();
      } else {
        throw new IllegalArgumentException("Classe configurada não implementa a interface");
      }
    } catch (ClassNotFoundException e) {
      throw new IllegalArgumentException("Classe configurada não existe",e);
    } catch (Exception e) {
      throw new IllegalArgumentException("Não foi possível criar a implementação",e);
    }
  }

}