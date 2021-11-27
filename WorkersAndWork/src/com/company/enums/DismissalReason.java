package com.company.enums;

public enum DismissalReason {
    FAMILY_REASONS("family reasons"),
    PROFESSIONAL_GROWTHLACK("professional growthlack"),
    LOW_SALARY("low salary"),
    BAD_TEAM_MICROCLIMATE("bad team microclinate"),
    LACK_MANAGEMENT_UNDERSTANDING("lack management understanding"),
    OTHER("other"),
    NONE("none");

    private String name;


    DismissalReason(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
