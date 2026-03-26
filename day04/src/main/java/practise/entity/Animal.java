package practise.entity;

// 按这周练习题，这里更适合先写成接口，再让 Dog 和 Cat 去实现。
// 现在写成父类也能用，但重点会偏到继承。
public class Animal {
    private String name;
    private String move;
    private String food;

    public Animal(String name, String move, String food){
        this.name = name;
        this.food = food;
        this.move = move;
    }

    public Animal(){

    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", move='" + move + '\'' +
                ", food='" + food + '\'' +
                '}';
    }
}