package pms.pets.model;

public class Pet {
    private String name;
    private String id;
    private String race;
    private Gender gender;
    private Integer age;
    private String birthDate;

    public Pet(String name, String id, String race, Gender gender, Integer age, String birthDate) {
        this.name = name;
        this.id = id;
        this.race = race;
        this.gender = gender;
        this.age = age;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getRace() {
        return race;
    }

    public Integer getAge() {
        return age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public Gender getGender() {
        return gender;
    }
}
