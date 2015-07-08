package sandbox.design.dynamic_factory;

import java.io.IOException;


public class NullPosProcessador implements PosProcessador {

    public byte[] processar(byte[] bytes) throws IOException {
        return bytes;
    }
    
}
