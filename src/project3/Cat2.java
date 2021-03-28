package project3;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//FOR DESERIALIZATION!!
//@XmlRootElement(name = "another tag", namespace = "project3.Cat2.java")
@XmlRootElement(name = "tag_for_single_cat")
//@XmlType(name = "cat", namespace = "project3.Cat2.java")
public class Cat2 {
    @XmlElement
    private String name;
//    @XmlElement
    private int age;

    public static void main(String[] args) throws JAXBException {
        CatHouse house = new CatHouse("new value");

        Cat2 cat = new Cat2(2, "Vasya");
        cat.add("key", "value");
        house.add(cat);

        cat = new Cat2(2, "vasya");
        cat.add("key1", "value1");
        cat.add("key2", "value2");
        house.add(cat);

        cat = new Cat2(1, "vasilisa");
        cat.add("asd", "asd");
        house.add(cat);

        Writer writer = new StringWriter();

        JAXBContext context = JAXBContext.newInstance(Cat2.class, CatHouse.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(house, writer);

        System.out.println(writer);
    }

//    @XmlElement
    private Map<String, String> map;

    public Cat2() {}

    public Cat2(int age, String name) {
        this.name = name;
        this.age = age;
        this.map = new HashMap<>();
    }

    public Map<String, String> get() {
        return map;
    }

    public void add(String key, String value) {
        map.put(key, value);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "\n\tName: " + name
                + "\n\tAge: " + age
                + "\n\tElse: " + map;
    }
}
