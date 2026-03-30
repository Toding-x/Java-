package demo;

public class EnumDemo {
    enum Color {
        Blue,Red,Green;

        private Color() {
        System.out.println("你的颜色是"+this.toString());
        }
        public void Test(){
            System.out.println("检测目标");
        }
    }
    public static void main(String[]args){
        Color c1 = Color.Red;
        System.out.println(c1);
        c1.Test();

        }
}

