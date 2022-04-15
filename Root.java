import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.List;


public class Root {


    private String name;
    private List<People> people;
    public Root(){

    }

    public Root(String name, List<People> people) {
        this.name = name;
        this.people = people;
    }

    public String getName() {
        return name;
    }

    public List<People> getPeople() {
        return people;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPeople(List<People> people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Root{" +
                "name='" + name + '\'' +
                ", people=" + people +
                '}';
    }
}
