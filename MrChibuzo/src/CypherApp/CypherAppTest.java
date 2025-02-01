package CypherApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CypherAppTest {
    @Test
    public void checkIfTheCyptherAppWorks(){
        Encryption encryption = new Encryption();
        assertEquals(encryption.getEncryption("CODEDAMN", 3), "FRGHGDPQ");
    }
    @Test
    public void checkIfTheCyptherDecryptionAppWorks(){
        Encryption encryption = new Encryption();
        assertEquals(encryption.getDecryption("FRGHGDPQ", 3), "CODEDAMN");
    }

}
