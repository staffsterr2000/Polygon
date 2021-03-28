package project3;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.bind.JAXBException;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, JAXBException {
        String filePath = "d:/test/a.txt";
        Writer writer = new FileWriter(filePath);

        Cat1 cat = new Cat1(2, "vasya");
        cat.add("key1", "value1");
        cat.add("key2", "value2");

        Cat1 cat1 = new Cat1(1, "vasilisa");
        cat1.add("asd", "asd");

//        CatHouse house = new CatHouse("noStandardValue", new ArrayList<>(Arrays.asList(cat, cat1)));
//        System.out.println(house);
//
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.writeValue(writer, house);
//        writer.close();
//
//        Reader reader = new FileReader(filePath);
//        CatHouse newHouse = mapper.readValue(reader, CatHouse.class);
//        System.out.println(newHouse);
//        reader.close();
    }
}


