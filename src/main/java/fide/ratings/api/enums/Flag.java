package fide.ratings.api.enums;

public enum Flag {
    ACTIVE(new String[] { "w", null }),
    INACTIVE(new String[] { "i", "wi" });

    private final String[] codes;

    Flag(String[] codes) {
        this.codes = codes;
    }

    public String[] getCodes() {
        return this.codes;
    }

    public static Flag fromCode(String code) {
        for (Flag flag : values()) {
            for (String c : flag.codes) {
                if (c == null && code == null) {
                    return flag;
                } else if (c != null && c.equalsIgnoreCase(code)) {
                    return flag;
                }
            }
        }

        throw new IllegalArgumentException("Invalid code for flag: " + code);
    }
}
