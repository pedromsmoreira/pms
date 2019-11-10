package pms.pets.api;

public class Pet {
    private String name;
    private String id;
    private String race;
    private String gender;
    private Integer age;
    private String birthdate;

    public Pet(String name, String id, String race, String gender, Integer age, String birthdate) {
        this.name = name;
        this.id = id;
        this.race = race;
        this.gender = gender;
        this.age = age;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
