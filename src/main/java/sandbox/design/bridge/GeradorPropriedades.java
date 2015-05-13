package sandbox.design.bridge;

import java.util.Map;

/**
 *
 * @author gilberto.andrade
 */
public class GeradorPropriedades extends GeradorArquivo {

    protected String gerarConteudo(Map<String, Object> props) {
        StringBuilder propFileBuilder = new StringBuilder();
        for (String prop : props.keySet()) {
            propFileBuilder.append(prop + "=" + props.get(prop) + "\n");
        }
        return propFileBuilder.toString();
    }
}
