package project3;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "TYPE")
@JsonSubTypes(@JsonSubTypes.Type(value = Cat1.class, name = "cat_one"))
public class Cat1 {
    private String name;
    private int age;

    private Map<String, String> map;

    @JsonCreator
    public Cat1(
            @JsonProperty("age")
                    int age,
            @JsonProperty("name")
                    String name) {
        this.name = name;
        this.age = age;
        this.map = new HashMap<>();
    }

    @JsonAnyGetter
    public Map<String, String> get() {
        return map;
    }

    @JsonAnySetter
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
