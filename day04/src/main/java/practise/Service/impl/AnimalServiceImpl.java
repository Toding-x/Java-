package practise.Service.impl;

import practise.Service.AnimalService;
import practise.entity.Animal;

public class AnimalServiceImpl extends Animal implements AnimalService {

    // 这里直接 new 了一个 Animal，和真正传进来的 Dog、Cat 没关系。
    /*
    修改了一下，现在就是调用传入的的Animal，可以使用传入的数据，就是重写了一下，setter和getter方法
    */
    @Override
    public String eatFood(Animal animal) {
       return animal.getFood();
    }

    @Override
    public String actionMove(Animal animal) {
        return animal.getMove();
    }

    @Override
    public String setName(Animal animal) {
        // 必须用 super，否则会调用自身造成无限递归
        return animal.getName();

    }
}