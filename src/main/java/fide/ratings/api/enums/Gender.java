package fide.ratings.api.enums;

public enum Gender {
    MALE("M"),
    FEMALE("F");

    private final String code;

    Gender(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    public static Gender fromCode(String code) {
        for (Gender gender : values()) {
            if (gender.code != null && gender.code.equals(code)) {
                return gender;
            }
        }

        throw new IllegalArgumentException("Invalid code for gender: " + code);
    }
}
