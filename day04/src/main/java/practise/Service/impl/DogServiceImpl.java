package practise.Service.impl;

import practise.Service.DogService;
import practise.entity.Dog;

public class DogServiceImpl extends AnimalServiceImpl implements DogService {

    @Override
    public void WriteAddress(Dog dog) {
        System.out.println(dog.getName()+"去"+dog.getAddress()+dog.getMove()+dog.getFood());

    }
}
