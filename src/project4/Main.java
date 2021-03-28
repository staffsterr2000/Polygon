package project4;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.WeakHashMap;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);
    static {
        try {
            Properties properties = new Properties();
            properties.load(Main.class.getResourceAsStream("log4j.properties"));
            PropertyConfigurator.configure(properties);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String data;
    public Main(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public static void main(String[] args) {
        logger.debug("wow");
        Main data = new Main("secret info");
        Map<Main, String> map = new WeakHashMap<>();
        map.put(data, data.getData());

        System.out.println(map);

        data = null;
        System.gc();

        for (int i = 0; i < 10000; i++) {
            if (map.isEmpty()) {
                System.out.println("Finally! Iteration: " + i);
                break;
            }
            System.out.println("nah Iteration: " + i);
        }
    }
}
