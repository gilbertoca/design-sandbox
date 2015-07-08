package sandbox.design.dynamic_factory;

import java.io.IOException;


public class Criptografador implements PosProcessador {
    private int delay;

    public Criptografador(int delay) {
        this.delay = delay;
    }
    
    public byte[] processar(byte[] bytes) throws IOException {
        byte[] newBytes = new byte[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            newBytes[i]
                    = (byte) ((bytes[i] + delay) % Byte.MAX_VALUE);
        }
        return newBytes;
    }
    
}
