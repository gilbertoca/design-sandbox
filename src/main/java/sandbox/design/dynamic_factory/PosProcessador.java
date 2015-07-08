package sandbox.design.bridge;

import java.io.IOException;

/**
 *
 * @author gilberto.andrade
 */
public interface PosProcessador {
    public byte[] processar(byte[] bytes) throws IOException;
}
