package ru.app.financerentalcar.enums;

public enum Color {

    WHITE("White", false),
    BLACK("Black", false),
    RED("Red", false),
    GREEN("Green", false),
    GREY("Grey", false),
    YELLOW("Yellow", false);

    public String type;
    public boolean sticker;


    Color(String type, boolean sticker) {
        this.type = type;
        this.sticker = sticker;
    }
}
