package sandbox.design.bridge;

import java.io.IOException;


public class NullPosProcessador implements PosProcessador {

    public byte[] processar(byte[] bytes) throws IOException {
        return bytes;
    }
    
}
