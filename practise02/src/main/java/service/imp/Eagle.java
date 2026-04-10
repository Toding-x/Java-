package service.imp;

import service.Flyable;

public class Eagle implements Flyable {
    @Override
    public void fly() {
        System.out.println("Eagle flying");
    }
}
