package Collections;

import java.util.List;

public class Person {
    private String name;
    private String typeOfPenalties;
    private String city;
    private List<String> penalties;

    public Person() {}

    public Person(String name, String typeOfPenalties, List<String> penalties, String city) {
        this.name = name;
        this.typeOfPenalties = typeOfPenalties;
        this.penalties = penalties;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfPenalties() {
        return typeOfPenalties;
    }

    public void setTypeOfPenalties(String typeOfPenalties) {
        this.typeOfPenalties = typeOfPenalties;
    }

    public List<String> getPenalties() {
        return penalties;
    }

    public void setPenalties(List<String> penalties) {
        this.penalties = penalties;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", typeOfPenalties='" + typeOfPenalties + '\'' +
                ", city='" + city + '\'' +
                ", penalties=" + penalties +
                '}';
    }
}
