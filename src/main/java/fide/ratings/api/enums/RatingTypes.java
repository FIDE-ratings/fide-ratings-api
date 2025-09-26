package fide.ratings.api.enums;

public enum RatingTypes {
    RATING("rating"),
    RAPID_RATING("rapid_rating"),
    BLITZ_RATING("blitz_rating");

    private final String code;

    RatingTypes(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    // public static RatingTypes fromCode(String code) {
    //     for (RatingTypes type : values()) {
    //         if (type.code != null && type.code.equalsIgnoreCase(code)) {
    //             return type;
    //         }
    //     }

    //     throw new IllegalArgumentException("Invalid code for rating type: " + code);
    // }
}
