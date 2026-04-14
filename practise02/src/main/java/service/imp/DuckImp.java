package service.imp;

import service.Flyable;
import service.Swimmable;

public class DuckImp implements Swimmable, Flyable {
    @Override
    public void fly() {
        System.out.println("Duck flying");

    }
    @Override
    public void swim() {
        System.out.println("Duck swimming");
    }
}
