package practise.Service;

import practise.entity.Animal;

//定义一个Animal接口，让Dog和Cat类实现它
// 这里又单独抽了一层 Service，这道练习先把 Animal 本身设计清楚会更重要。
public interface AnimalService {

     String eatFood(Animal animal);
     String actionMove(Animal animal);
     String setName(Animal animal);
}