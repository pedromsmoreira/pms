package pms.pets.model;

public enum Gender {
    NONE ("None"),
    MALE ("Male"),
    FEMALE ("Female")
    ;

    private final String genderCode;

    private Gender(String code){
        this.genderCode = code;
    }


    public String getGenderCode() {
        return genderCode;
    }
}
