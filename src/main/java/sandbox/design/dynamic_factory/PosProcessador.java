package sandbox.design.dynamic_factory;

import java.io.IOException;

/**
 *
 * @author gilberto.andrade
 */
public interface PosProcessador {
    public byte[] processar(byte[] bytes) throws IOException;
}
