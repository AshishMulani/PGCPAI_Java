package Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("dd.properties");

        Properties properties=new Properties();
        properties.load(fis);

        String value = properties.getProperty("name");
        System.out.println(value);
    }
}
