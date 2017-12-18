package pl.dominisz;

public class Person {

    private String name;
    private Sex gender;

    public enum Sex {
        MALE,
        FEMALE;
    }

    public Person(String name, Sex gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Sex getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }
}
