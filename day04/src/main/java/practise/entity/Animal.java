package practise.entity;

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
