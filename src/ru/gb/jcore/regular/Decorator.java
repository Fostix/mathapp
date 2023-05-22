package ru.gb.jcore.regular;

/**
 * I'm mr. Decorator
 * */
public class Decorator {


    public String decorate() {
        return String.format("5 + 5 = %d\n" +
                            "5 - 5 = %d\n" +
                            "5 / 5 = %d\n" +
                            "5 * 5 = %d",
                            MathClass.sum(5, 5),
                            MathClass.sub(5, 5),
                            MathClass.div(5, 5),
                            MathClass.mul(5, 5));
    }
}
