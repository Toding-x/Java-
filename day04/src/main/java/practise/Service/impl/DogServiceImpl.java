package practise.Service.impl;

import practise.Service.DogService;
import practise.entity.Dog;

public class DogServiceImpl extends AnimalServiceImpl implements DogService {

    @Override
    // 方法名建议改成 writeAddress，这样更符合 Java 命名习惯。
    public void WriteAddress(Dog dog) {
        // 这里现在主要是在拼字符串输出。
        System.out.println(dog.getName()+"去"+dog.getAddress()+dog.getMove()+dog.getFood());

    }
}