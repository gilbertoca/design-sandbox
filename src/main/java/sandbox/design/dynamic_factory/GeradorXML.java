package sandbox.design.dynamic_factory;

import java.util.Map;

/**
 *
 * @author gilberto.andrade
 */
public class GeradorXML extends GeradorArquivo {

    protected String gerarConteudo(Map<String, Object> props) {
        StringBuilder propFileBuilder = new StringBuilder();
        propFileBuilder.append("<properties>");
        for (String prop : props.keySet()) {
            propFileBuilder.append("<" + prop + ">" + props.get(prop) + "</" + prop + ">");
        }
        propFileBuilder.append("</properties>");
        return propFileBuilder.toString();
    }
}
