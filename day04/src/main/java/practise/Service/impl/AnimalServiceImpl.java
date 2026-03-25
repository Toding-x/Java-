package practise.Service.impl;

import practise.Service.AnimalService;
import practise.entity.Animal;

public class AnimalServiceImpl implements AnimalService {

    Animal animal= new Animal();
    @Override
    public void eatFood(String food) {
    animal.setFood("food");
    System.out.println(animal.getFood());
    }

    @Override
    public void actionMove(String move) {
        animal.setMove("move");
        System.out.println(animal.getMove());
    }

    @Override
    public void setName(String name) {
        animal.setName("name");
        System.out.println(animal.getName());
    }
}
