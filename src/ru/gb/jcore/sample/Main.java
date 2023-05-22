package src.ru.gb.jcore.sample;

import ru.gb.jcore.regular.Decorator;

public class Main {
    public static void main(String[] args) {
        Decorator decorator = new Decorator();
        System.out.println(decorator.decorate());
    }
}
