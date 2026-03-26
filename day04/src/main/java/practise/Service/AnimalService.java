package practise.Service;
//定义一个Animal接口，让Dog和Cat类实现它
// 这里又单独抽了一层 Service，这道练习先把 Animal 本身设计清楚会更重要。
public interface AnimalService {
     void eatFood(String food);
     void actionMove(String move);
     void setName(String name);
}