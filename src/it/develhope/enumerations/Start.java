package it.develhope.enumerations;

public class Start {

    enum Month {
        GENUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    public static void main(String[] args) {
        for (Month month : Month.values()) {
            if (month.name().endsWith("Y")) {
                System.out.println(month.name() + " ends with y");
            } else {
                System.out.println(month.name() + " doesn't end with y");
            }
        }
    }
}