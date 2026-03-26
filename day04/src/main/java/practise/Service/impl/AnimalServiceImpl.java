package practise.Service.impl;

import practise.Service.AnimalService;
import practise.entity.Animal;

public class AnimalServiceImpl implements AnimalService {

    // 这里直接 new 了一个 Animal，和真正传进来的 Dog、Cat 没关系。
    Animal animal= new Animal();
    @Override
    public void eatFood(String food) {
    // 这里把 food 写死了，传进来的 food 参数没有用到。
    animal.setFood("food");
    System.out.println(animal.getFood());
    }

    @Override
    public void actionMove(String move) {
        // 这里把 move 写死了，传进来的 move 参数没有用到。
        animal.setMove("move");
        System.out.println(animal.getMove());
    }

    @Override
    public void setName(String name) {
        // 这里把 name 写死了，传进来的 name 参数没有用到。
        animal.setName("name");
        System.out.println(animal.getName());
    }
}