package project3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

//@XmlRootElement(name = "wr", namespace = "project3.CatHouse.java")
@XmlRootElement(name = "wr")
public class CatHouse {
    @XmlAttribute
    private String ownProperty = "standard value";

//    @XmlElementWrapper(name = "tag_for_list")
    @XmlAnyElement
    private List<Cat2> cats;

    public CatHouse() {
        this.cats = new ArrayList<>();
    }

    public CatHouse(List<Cat2> cats) {
        this.cats = cats;
    }

    public CatHouse(String ownProperty) {
        this();
        this.ownProperty = ownProperty;
    }

    @JsonCreator
    public CatHouse(
            @JsonProperty("own")
            String ownProperty,
            @JsonProperty("cats")
            List<Cat2> cats) {
        this.ownProperty = ownProperty;
        this.cats = cats;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder()
                .append("=-=-=-=-=-=-=-=-=-=-=")
                .append("\nProperty: ").append(ownProperty)
                .append("\n\nCats: ").append(cats.size());

        cats.forEach(builder::append);
        builder.append("\n");
        return builder.toString();
    }

    public String getOwnProperty() {
        return ownProperty;
    }
    public List<Cat2> getCats() {
        return cats;
    }

    public void add(Cat2 cat) {
        cats.add(cat);
    }
}
