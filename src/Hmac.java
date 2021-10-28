import javax.xml.bind.DatatypeConverter;
import java.security.SecureRandom;

public class Hmac {

    private String key;

    public Hmac() {
        createKey();
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    private void createKey() {
        SecureRandom random = new SecureRandom();
        byte[] seed = random.generateSeed(16);
        setKey(DatatypeConverter.printHexBinary(seed));
    }
}
